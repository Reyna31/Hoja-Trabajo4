/*
    @author Pablo Cesar Reyna Juarez
    @Version 26/02/2020

 */

import java.util.ArrayList;

public class ArrayList<T> extends APila<T> implements IPila<T> {

    protected ArrayList<T> pila = new ArrayList<T>();

    public void add(T value){
        pila.add(value);
    }

    public T remove(){
        return pila.remove(pila.size()-1);
    }

    public T peek() {
        return pila.get(pila.size()-1);
    }

    @Override
    public int size() {
        return pila.size();
    }
}
