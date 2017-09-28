package app.Interfecaes;

import app.Set;

public interface SetApiInterface {

    Set<Integer> union(int[] a, int[] b);

    int compareSets(int[] a, int[] b);
}
