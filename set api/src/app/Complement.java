package app;

import java.util.ArrayList;

public class Complement {
     public static void main(String[] args) {
        Integer[] listA = {1,2,3,4};
        Integer[] listB = {3,4,5};
        Set<Integer> o1 = new Set<>(listA);
        Set<Integer> o2 = new Set<>(listB);
        
        Set o3 = Complement.complementOfSet(o1, o2);
      
        //System.out.println(o3.isInfinite);
        
        for (int i = 0; i < o3.getValues().length; i++) {
            System.out.println(o3.getValues()[i] +",");
        }
    }
     /*
     the complement of set refers to elements not in set.
     our methods focus on elements not in listA
     */
     public static Set complementOfSet(Set a, Set b){
     int index = 0;
     int flag = 1;
   
     if(a.isInfinite || a.isInfinite && b.isInfinite){
            return new Set(true);
        }
        if(b.isInfinite || a.getValues().length <= b.getValues().length){
            return new Set();
        }
        ArrayList<Comparable> result = new ArrayList();
        
        for (int i = 0; i < b.getValues().length; i++) {
          
            for (int j = 0; j <  a.getValues().length; j++) {
                if (a.getValues()[j]== b.getValues()[i]) {
                    flag = 0;
                    break;
                }
                else flag = 1;
            }
            if (flag ==1 ) {
                result.add(b.getValues()[i]);
            }
        
        }
        
        Comparable[] newResult = new Comparable[result.size()];
        for (int i = 0; i < newResult.length; i++) {
            newResult[i] = result.get(i);
        }

        return new Set(newResult);
    }
}
