/*
    @author Pablo Cesar Reyna Juarez
    @Version 26/02/2020

 */

public class FactoryPila<T> {
    public IPila<T> getFactory(String entry){

        switch (entry){
            case "1":
                return new Vector<T>();
            case "2":
                return new ArrayList<T>();
            case "3":
                return new List<T>();
            default:
                return null;
        }
    }

}
