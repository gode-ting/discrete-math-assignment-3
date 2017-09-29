package app;

import java.util.ArrayList;
/*
This isnt membership. 

*/
public class Membership {
     /*
    a ∈A element of set membership	
    
    example:
    A={3,9,14}, 3∈ A
    
    Simple - check if A contains 3. Return true or false;
    
    */
    
    public static void main(String[] args) {
        Integer[] listA = {1,2,3,4};
        Integer[] listB = {3,4,5};
        Set<Integer> o1 = new Set<>(listA);
        Set<Integer> o2 = new Set<>(listB);
        
        Set o3 = Membership.membership(o1, o2);
      
        System.out.println(o3.isInfinite);
        
        for (int i = 0; i < o3.getValues().length; i++) {
            System.out.println(o3.getValues()[i] +",");
        }
    }
    
    
    
    public static Set membership(Set a, Set b){
     int index = 0;
  
   
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
                    result.add(b.getValues()[i]);
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
