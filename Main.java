
import java.io.File;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oscar
 */
public class Main {

      public static void main(String[] args) {
        IStack<Integer> coleccion = new MiStack<Integer>();// Se instancia un Stack
        ICalculator Calculadora = new Calculator(); // Se instancia una nueva calculadora
        
                //Se crea un try and catch por posibles errores
        try {
          System.out.println("Ingrese la ruta de su archivo .txt");
          Scanner texto = new Scanner(System.in);
          File file = new File(texto.toString());
          Scanner sc = new Scanner(file); // Se instancia un scanner que servira para leer el archivo de texto
          String datos = sc.nextLine(); //Se guardan los datos en la variable datos
          
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        String [] datosLista = datos.split("\\s");// Guarda los datos en un array con split
        System.out.println(datosLista);
        boolean numero = false;
        int contador = 0;//Variable que me servira para poder saber que dato se esta leyendo

        while (contador < datosLista.length ){

            try{
                coleccion.push(Integer.parseInt(datosLista[contador]));
                numero = true;
            }catch (Exception e){
                numero = false;
            }

            if (numero == false){
                if (coleccion.size() <= 1){
                    System.out.println("No hay suficientes datos para operar");
                }else {

                    if (datosLista.equals("+")){
                        coleccion.push(Calculadora.sumar(coleccion.pop(),coleccion.pop())); //Realiza la operacion de suma
                    }else if (datosLista.equals("-")){
                        coleccion.push(Calculadora.restar(coleccion.pop(),coleccion.pop())); //Realiza la operacion de resta
                    }else if (datosLista.equals("*")){
                        coleccion.push(Calculadora.multiplicacion(coleccion.pop(),coleccion.pop())); // Realiza la operacion de multiplicacion
                    }else if (datosLista.equals("/")){
                        coleccion.push(Calculadora.division(coleccion.pop(),coleccion.pop())); // Realiza la operacion de divsion
                    }else{
                        System.out.println("No se puede realizar la operacion porfavor ingrese nuevamente");
                    }
                }

            }
            contador++;// aumenta el contador
        }

        if (coleccion.size() == 1){
            System.out.println("Su resultado es: "+ coleccion.get());//imprime el resultado de las operaciones
        }else{
            System.out.println("No se pudo procesar la informacion porfavor comprueba los datos.");// en caso de que no se puede leer el archivo de texto
        }
    }

    private static class datos {

        private static String[] split(String s) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public datos() {
        }
    }
}
