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

        public static void main(String[] args) {
            Integer[] listA = {1,2,3,4};
            Integer[] listB = {3,4,5};
            Set<Integer> o1 = new Set<>(listA);
            Set<Integer> o2 = new Set<>(listB);

            Set o3 = Union.union(o1, o2);

            System.out.println(o3.isInfinite);

            for (int i = 0; i < o3.getValues().length; i++) {
                System.out.println(o3.getValues()[i] +",");
            }
        }

    @Override
    public int[] noDuplicates(int[] a, int[] b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 public static Set union(Set a, Set b){
     int index = 0;
     int flag = 1;
   
     if(a.isInfinite || a.isInfinite && b.isInfinite){
            return new Set(true);
        }
        if(b.isInfinite || a.getValues().length <= b.getValues().length){
            return new Set();
        }
        ArrayList<Comparable> result = new ArrayList();
        
        for (int i = 0; i < a.getValues().length; i++) {
            if (!result.contains(a.getValues()[i])) {
                 result.add(a.getValues()[i]);
            }


            for (int j = 0; j < b.getValues().length; j++) {
                for (int k = 0; k < a.getValues().length; k++) {
                    if (b.getValues()[j] == a.getValues()[k]) {
                        flag = 0;
                        break;
                    }
                    else flag = 1;
                }
                if (flag ==1 && !result.contains(b.getValues()[j])) {
                    result.add(b.getValues()[j]);
                }
            }
        
        }
        
        Comparable[] newResult = new Comparable[result.size()];
        for (int i = 0; i < newResult.length; i++) {
            newResult[i] = result.get(i);
        }

        return new Set(newResult);
    }
}
