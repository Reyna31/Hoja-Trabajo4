import java.io.IOException;
import java.net.URISyntaxException;


/**
 * Clase encargada de realizar las operaciones
 * implementa la interfaz iCalculator
 * @author oscar
 */
public class Calculator implements iCalculator{

    /**
     * las operaciones se realizan unicamente con dos parametros
     * @param a
     * @param b
     * @return suma
     */
    // el siguiente metodo realiza las sumas
    public int sumar (int a, int b){
        return a + b;
    }
    /**
     * las operaciones se realizan unicamente con dos parametros
     * @param a
     * @param b
     * @return resta
     */
    //el siguiente metodo realiza las restas
    public int restar (int a, int b){
        return a - b;
    }
    /**
     * las operaciones se realizan unicamente con dos parametros
     * @param a
     * @param b
     * @return division
     */
    // el siguiente metodo realiza las divisiones siempre
    // y cuando ninguno de los parametros sea 0
    @Override
    public int division (int a, int b){
        int dividendo = 0;
        try {
           if (a == 0) {
               return 0;
           }
           if (b == 0) {
               return 0;
           }
           dividendo = (a/b);
       }catch (Exception e){
          System.out.println("La division no e posible");
          dividendo = -1;
       }
        return dividendo;
    }
    /**
     * las operaciones se realizan unicamente con dos parametros
     * @param a
     * @param b
     * @return multiplicacion
     */
    // el siguiente metodo realiza las multiplicaciones
    public int multiplicacion (int a, int b){
        return a * b;

    }

    @Override
    public void init() throws IOException, URISyntaxException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int sum(int a, int b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int subtraction(int a, int b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int multiply(int a, int b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isInt(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void manageOperator(String operator) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
