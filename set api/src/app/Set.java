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
    public Set<Integer> unionList(int[] a, int[] b) {

    }

    @Override
    public int compareSets(int[] a, int[] b) {
        if (a.length == 0) {
            return b.length == 0 ? 0 : -1;
        }
        if (b.length == 0) {
            return 1;
        }

        int result = 0;
        int indexA = 0;
        int indexB = 0;

        while (indexA < a.length && indexB < b.length) {
            if (a[indexA] == b[indexB]) {
                indexA++;
                indexB++;
            }
        }
    }

}
