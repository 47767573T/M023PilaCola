import java.util.Random;

/**
 * Created by 47767573t on 05/11/15.
 */
public class Main {

    public static void main(String[] args) {

        int numMaxAlea = 10;
        Random rnd = new Random();
        Apilar pila = new Apilar(5);

        //DEMOSTRACION DE LA PILA::::::::::::::::::::::::::::::::::::::::::::::::::::
        //Añadimos a la pila
        pila.sumar(rnd.nextInt(numMaxAlea));
        pila.sumar(rnd.nextInt(numMaxAlea));
        pila.sumar(rnd.nextInt(numMaxAlea));

        pila.mostrar();

        //Restamos de la pila
        pila.restar();
        pila.restar();

        pila.mostrar();

        //DEMOSTRACION DE LA COLA:::::::::::::::::::::::::::::::::::::::::::::::::::::


    }
//http://programacionparajava.blogspot.com.es/p/programas-sencillos-usando-estructura.html

}
