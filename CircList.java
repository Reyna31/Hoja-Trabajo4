import java.util.List;

/**
 *
 * @author oscar
 */
public class CircList<P> extends ListAbstracta<P> {

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
        return info.get(tamano() - 1);
    }

    @Override
    public P eliminaprim() {
       return info.remove(0);
    }

    @Override
    public P eliminaulti() {
      return info.remove(tamano() - 1);
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
