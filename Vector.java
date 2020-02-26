import java.util.Vector;
/*
    @author Pablo Cesar Reyna Juarez
    @Version 26/02/2020

 */

public class Vector<T> extends APila<T> implements IPila<T> {

    protected Vector<T> pila = new Vector<T>();

    public void add (T value){
        pila.add(value);
    }

    public T remove(){
        return pila.remove(pila.size()-1);
    }

    @Override
    public T peek() {
        return pila.get(pila.size()-1);
    }

    @Override
    public int size() {
        return pila.size();
    }


}
