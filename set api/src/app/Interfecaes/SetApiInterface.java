package app.Interfecaes;

import app.Set;

public interface SetApiInterface {

    Set<Integer> unionList(int[] a, int[] b);

    int compareSets(int[] a, int[] b);
}
