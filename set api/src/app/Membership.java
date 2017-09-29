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
        
        Membership.memberOf(3, o1);
      
        System.out.println("is a element of " + Membership.memberOf(3, o1));
        
       
    }
    
    
    
    public static boolean memberOf(int value, Set set){
        for (Comparable value1 : set.getValues()) {
            if ((int) (value1) == value) {
                return true;
            }
        }
        return false;
    }
}
