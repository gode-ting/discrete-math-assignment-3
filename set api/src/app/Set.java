package app;

import app.Interfecaes.SetApiInterface;
import java.util.ArrayList;
import java.util.List;

public class Set<T> implements SetApiInterface {

    public Set() {
    }
    
    public static void main(String[] args) {
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
            } else if (a[indexA] > b[indexB]) {
                if (result == 1) {
                    return -2;
                }
                indexB++;
                return -1; // a is subset
            } else if(a[indexA] < b[indexB]) {
                if (result == -1) {
                    return -2;
                }
                indexA++;
                result = 1; // a is superset
            }
        }
        if (indexA == a.length && indexB == b.length) {
            return result;
        }
        return -2; // sets
    }

    @Override
    public Set<Integer> union(int[] a, int[] b) {
        
    }

}
