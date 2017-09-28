package app.Interfecaes;

import app.Set;

public interface SetApiInterface {

    Set<Integer> unionList(Set<Integer> a, Set<Integer> b);
    void addToList (int value);
}
