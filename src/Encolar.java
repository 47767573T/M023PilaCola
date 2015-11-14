/**
 * Created by 47767573t on 05/11/15.
 */
public class Encolar {

    int[] cola;
    int top;
    int base;
    int max;

    public Encolar(int max) {
        this.max = max;
        this.cola = new int[max];
        top = 0;
        base = 0;
    }

    public void agregar(int valor) {
        if (estaLLena()) System.out.println("\n - Cola Llena - ");
        else if (!estaVacia() && top == (max)) {
            reordenar();
            cola[top] = valor;
            borrarRestante(top);
        }else if (estaVacia()){
            base = 0;
            top = 0;
        } else {
            cola[top] = valor;
            top++;
        }
    }

    public void quitar() {
        if (estaVacia()){
            System.out.println("\n - Cola vacia - ");
            System.out.println(") base("+base+"), top("+top+")");
        }
        else{
            cola[base] = 0;
            base++;
        }
    }

    public void reordenar () {
        int dif = cantidadActual();
        System.out.println("diferencia:"+dif);
        for(int i = 0 ; i < dif ; i++) {
            cola[i]= cola[base+i];
        }
        base = 0;
        top = dif;
    }

    public boolean estaVacia() {
        if (cantidadActual() == 0) return true;
        else return false;
    }

    public boolean estaLLena() {
        if (cantidadActual() == (max)) return true;
        else return false;
    }

    public int cantidadActual(){
        return top-base;
    }

    public void borrarTodo(){
        top = 0;
        base = 0;
        for (int i = 0 ; i < cola.length ; i++){
            cola[i]=0;
        }
    }

    public void mostrar(){
        System.out.print("\nCola( ");
        for (int i = 0 ; i<cola.length ; i++,System.out.print(",") ) {
            System.out.print(cola[i]);
        }
        System.out.println(") base("+base+"), top("+top+")");
    }

    public void borrarRestante(int posIni){
        for (int i = posIni ; i < cola.length ; i++){
            cola[i]=0;
        }
    }

}
