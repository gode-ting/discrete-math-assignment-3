# discrete-math-assignment-3
Repository for assignment 3 in discrete math course on Cphbusiness, PBA in software development. 

### A set API

We created the set API using Java. 

**Class: Set**

We made a base class *Set*

It consists of methods handling values. 

It also consists of a method handling infinite:

One way: 

```java
boolean isInfinite = false;
```
Another way e.g:

```java
 public boolean isInfinite(Double d){
       
       return d == Double.POSITIVE_INFINITY;
    }
    
```

## Membership 

We interpreted membership as being *"element of"* a set e.g. A={3,9,14}, 3	∈ A

A simply check if an element is in a set should do the job.

```java
 public static boolean memberOf(int value, Set set){
        for (Comparable value1 : set.getValues()) {
            if ((int) (value1) == value) {
                return true;
            }
        }
        return false;
    }
```

## Intersection

Meaning : objects that belong to set A and set B
e.g : *A ∩ B = {9,14}*

```java
public static Set intersection(Set a, Set b){
     int index = 0;

     if(a.isInfinite || a.isInfinite && b.isInfinite){
            return new Set(true);
        }
        if(b.isInfinite){
            return new Set();
        }
        ArrayList<Comparable> result = new ArrayList();
        
        for (int i = 0; i < b.getValues().length; i++) {
          
            for (int j = 0; j <  a.getValues().length; j++) {
                if (a.getValues()[j]== b.getValues()[i] && !result.contains(b.getValues()[i])) {
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

```
At first *if-statement* we are handling infinite and return true if so.

Test:

```java
public static void main(String[] args) {
        Integer[] listA = {1,2,3,4};
        Integer[] listB = {3,4,5};
        Set<Integer> o1 = new Set<>(listA);
        Set<Integer> o2 = new Set<>(listB);
        Set o3 = Intersection.intersection(o1, o2);
        for (int i = 0; i < o3.getValues().length; i++) {
            System.out.println(o3.getValues()[i] +",");
        }
    }
```
Result: *3 and 4*

## Union

Definition: *objects that belong to set A or set B* e.g A ∪ B = {3,7,9,14,28}

```java
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
```
Test: 

```java
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
```
Result: *1,5,2,3,4*

## Difference

Definition: *The set difference of sets A and B (denoted by A–BA–B) is the set of elements which are only in A but not in B.* e.g 

A={10,11,12,13} and B={13,14,15} ten (A−B)={10,11,12} and (B−A)={14,15}

```java
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
```
Test: 

```java
public static void main(String[] args) {
        Integer[] listA = {1,2,3,4};
        Integer[] listB = {3,4,5};
        Set<Integer> o1 = new Set<>(true);
        Set<Integer> o2 = new Set<>(listB);
        
        Set o3 = Difference.DifferenceInSet(o1, o2);
        
        System.out.println(o3.isInfinite);
        
        for (int i = 0; i < o3.getValues().length; i++) {
            System.out.println(o3.getValues()[i] +",");
        }
        
    }
```

Result: *1, 2* 


## Complement

Definition : *all the objects that do not belong to set A* 

Symbol: *A^C*

```java

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
```

Test:

```java
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
```
Result: *5*

## Also create methods for handling subsets and equality as in exercise. Beware, that infinite sets might not be determined to be subsets, so we end up with five cases:

• A ⊂ B: -1
• A = B: 0
• A ⊃ B: 1
• Undeterminable: 2
• A * B ∧ B * A: -2

```java
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

```

Notes:

First we check if both sets are of same type. If not, return 2. If both sets are not of same type it will be undeterminable.
