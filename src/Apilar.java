/**
 * Created by 47767573t on 05/11/15.
 */
public class Apilar {
    int[] pila;
    int tope;

    public Apilar(int max) {
        this.pila = new int[max];
        tope = -1;
    }


    public void agregar (int valor){
        if (tope == pila.length-1){
            System.out.println("\n - Pila Llena - ");
        }else{
            tope++;
            pila[tope] = valor;
        }
    }
    public void quitar() {
        if (tope == -1) {
            System.out.println("Pila Vacía");

        } else {
            pila[tope]=0;
            tope--;
        }
    }
    public void mostrar(){
        System.out.print("\nPila( ");
        for (int i = 0 ; i<pila.length ; i++,System.out.print(",") ) {
            System.out.print(pila[i]);
        }
        System.out.println(")");
    }
}
