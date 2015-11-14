import java.util.Random;

/**
 * Created by 47767573t on 05/11/15.
 */
public class Main {

    public static void main(String[] args) {

        int numMaxAlea = 9;
        Random rnd = new Random();
        Apilar pila = new Apilar(5);
        Encolar cola = new Encolar (10);

        //DEMOSTRACION DE LA PILA::::::::::::::::::::::::::::::::::::::::::::::::::::
        //A�adimos a la pila
        System.out.print("\nA�ADIMOS 3 A LA PILA");
        pila.agregar(rnd.nextInt(numMaxAlea)+1);
        pila.agregar(rnd.nextInt(numMaxAlea)+1);
        pila.agregar(rnd.nextInt(numMaxAlea)+1);
        pila.mostrar();     //mostramos resultado de la pila

        //Restamos de la pila
        System.out.print("\nQUITAMOS 2 DE LA PILA");
        pila.quitar();
        pila.quitar();
        pila.mostrar();     //mostramos resultado de la pila

        //DEMOSTRACION DE LA COLA:::::::::::::::::::::::::::::::::::::::::::::::::::::
        //A�adimos a la cola
        System.out.print("\nA�ADIMOS 3 A LA COLA");
        cola.agregar(rnd.nextInt(numMaxAlea)+1);
        cola.agregar(rnd.nextInt(numMaxAlea)+1);
        cola.agregar(rnd.nextInt(numMaxAlea)+1);
        cola.mostrar();

        //Restamos de la cola
        System.out.print("\nQUITAMOS 2 DE LA COLA");
        cola.quitar();
        cola.quitar();
        cola.mostrar();

        // Volvemos a A�adir a la cola
        System.out.print("\nA�ADIMOS 2 DE LA COLA");
        cola.agregar(rnd.nextInt(numMaxAlea)+1);
        cola.mostrar();


    }
}
