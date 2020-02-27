/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
/**
 *
 * @author oscar
 */
public abstract class ListAbstracta<P> implements interfaceList<P> {
    
    public abstract void agregar(P item);
    
    public abstract P showprim();
    
    public abstract P showulti();
    
    public abstract P eliminaprim();
    
    public abstract P eliminaulti();
    
    public abstract boolean status();
    
    public abstract int tamano();
    
}
