package app;

import app.Interfecaes.SetApiInterface;
import java.util.ArrayList;
import java.util.List;

public class Set<T extends Comparable> {

    T[] values;
    boolean isInfinite = false;
    
    public boolean isInfinite(Double d){
       
       return d == Double.POSITIVE_INFINITY;
    }
    
    
    public Set() {
        values = (T[]) new Comparable[0];
    }

    public Set(boolean isInfinite) {
        this.isInfinite = isInfinite;
    }

    public Set(T[] values) {
        this.values = values;
    }

    public void setValues(T[] values) {
        this.values = values;
    }

    public T[] getValues() {
        return values;
    }
}
