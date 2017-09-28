package app;

import app.Interfecaes.UnionInterface;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Union implements UnionInterface {

    public List<Integer> unionArrays(int[] a, int[] b) {
        int aSize = a.length;
        int bSize = b.length;

        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < aSize; i++) {
            myMap.put(a[i], a[i]);
        }
        
        for (int i = 0; i < bSize; i++) {
            myMap.put(b[i], b[i]);
        }

        ArrayList unionSet = new ArrayList();

        for(Map.Entry<Integer, Integer> value: myMap.entrySet()) {

            if (myMap.containsKey(value.getValue())) {
                unionSet.add(value.getValue());
            }
        }
        return unionSet;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 7, 8};
        int[] b = {2, 3, 4, 6, 7, 9, 13};

        Union union = new Union();
        System.out.println("Union array: " + union.unionArrays(a, b));
    }

    @Override
    public int[] noDuplicates(int[] a, int[] b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
