/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import javax.imageio.metadata.IIOMetadataFormat;
import javax.sound.sampled.DataLine;
/**
 *
 * @author oscar
 */
public class simpleEnca<P> extends ListAbstracta<P>{
    
    List<P> info;

    @Override
    public void agregar(P item) {
        info.add(item);
    }

    @Override
    public P showprim() {
        return info.get(0);
    }

    @Override
    public P showulti() {
        return info.get(tamano());
    }

    @Override
    public P eliminaprim(){
        return info.remove(0);
    }

    @Override
    public P eliminaulti() {
        return info.remove(tamano());
    }

    @Override
    public boolean status() {
        return tamano() == 0;
    }

    @Override
    public int tamano() {
        return info.size();
    }
    
    
}
