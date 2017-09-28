package app;

import app.Interfecaes.SetApiInterface;
import java.util.ArrayList;
import java.util.List;

public class Set<T> implements SetApiInterface {

    private List values = new ArrayList();

    public Set() {
    }

    public static void main(String[] args) {
    }

    @Override
    public Set<Integer> unionList(Set<Integer> a, Set<Integer> b) {
        Union union = new Union();

    }
   
    @Override
    public void addToList(int value) {
        values.add(value);
    }

}
