/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oscar
 */
public interface interfaceList<P> {
    
    public void agregar(P item);
    // agrega un valor a la lista
    
    public P showprim();
    // muestra el primer valor en la lista
    
    public P showulti();
    // muestra el ultimo valor en la lista
    
    public P eliminaprim();
    // elimina el primer valor en la lista
    
    public P eliminaulti();
    // elimina el ultimo valor en la lista
    
    public boolean status(); 
    // determina si la lista esta vacia 
    
    public int tamano();
    // determina la cantidad de elementos en la lista
}


	
