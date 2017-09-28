package app;

import java.util.ArrayList;

public class Difference {
    
    public static Set DifferenceInSet(Set a, Set b){
        if(a.isInfinite || a.isInfinite && b.isInfinite){
            return new Set(true);
        }
        if(b.isInfinite || a.getValues().length <= b.getValues().length){
            return new Set();
        }
        ArrayList<Comparable> result = new ArrayList();
        
        for (int i = 0; i < a.getValues().length; i++) {
            boolean check = true;
            for (int j = 0; j < b.getValues().length; j++) {
                if(a.getValues()[i] == b.getValues()[j]){
                    check = false;
                }
            }
            if(check){
                result.add(a.getValues()[i]);
            }
        }
        
        Comparable[] newResult = new Comparable[result.size()];
        for (int i = 0; i < newResult.length; i++) {
            newResult[i] = result.get(i);
        }

        return new Set(newResult);
    }
}
