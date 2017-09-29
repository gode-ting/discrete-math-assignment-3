/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import app.Interfecaes.CompareSetInterface;

public class CompareSets<T extends Comparable> implements CompareSetInterface {

    public static void main(String[] args) {
        Integer[] listA = {3,4,5,7,4,3,2,1,10};
        Integer[] listB = {3,4,5,7,4,3,2,1,10};
        
        String[]  listC = {"a","b","c"};
        Integer[] listD = {3,4,5,7,4,3,2,1,12,11};
        Set<Integer> o1 = new Set<>(listA);
        Set<Integer> o2 = new Set<>(listB);
        Set<Integer> o3 = new Set<>(listD);
        
        
        Set<String> o4 = new Set<>(listC);
       
        CompareSets cs = new CompareSets();
        
        System.out.println(cs.compareSets(o1,o2));
    }
    
    public  int compareSets(Set<T> a, Set<T> b) {
        
        if (a.getValues().getClass() != b.getValues().getClass()) {
            return 2;
        }else{
          
        }
        if (a.getValues().length == 0) {
            return b.getValues().length == 0 ? 0 : -1;
        }
        if (b.getValues().length == 0) {
            return 1;
        }

        int result = 0;
        int indexA = 0;
        int indexB = 0;

        while (indexA < a.getValues().length && indexB < b.getValues().length) {
           
            if (a.getValues()[indexA] == b.getValues()[indexB]) {
             
                indexA++;
                indexB++;
                
                //System.out.println("IndexA: " + indexA + "IndexB: " + indexB);
            } else if (a.getValues()[indexA].compareTo(b.getValues()[indexB]) == -1) {
                if (result == 1) {
                    return -2;
                }
                indexB++;
                return -1; // a is subset
            } else if (a.getValues()[indexA].compareTo(b.getValues()[indexB])== 1) {
                if (result == -1) {
                    return -2;
                }
                indexA++;
                result = 1; // a is superset
            }
        }
        if (indexA == a.getValues().length && indexB == b.getValues().length) {
            return result;
        }
        return -2; // sets
    }

    @Override
    public int compareSets(int[] a, int[] b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
