package ap40intermedio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        List<String>palabras=new ArrayList<String>();
        palabras.add("hola");
        palabras.add("que tal");
        palabras.add("yo me llamo");
        palabras.add("Tomas");


        System.out.println("Listado de Strings en Mayuscula:");

        for (int i=0;i<palabras.size();i++){
            String respuesta=mayus(palabras.get(i), (palabra -> palabra.toUpperCase()) );
            System.out.println(respuesta);
        }




}
@FunctionalInterface
public interface Transformador{
        String transformar(String palabra);

}

public static String mayus(String palabra, Transformador transformador){
        return transformador.transformar(palabra);

}

}
