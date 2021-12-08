
package lse;

public class ListaSimplementeEnlazada {
    Nodo primero;
    public  ListaSimplementeEnlazada(){
        primero = null;
    }
    public boolean estaVacia(){
        return primero == null;

    }
    public void insertar(Object dato){
        if(estaVacia()){
            Nodo nuevo = new Nodo(dato, null);
            primero = nuevo;
        } else{
            Nodo nuevo = new Nodo(dato, primero);
            primero = nuevo;

        }
    }
    public void eliminar(){
        if (!estaVacia()){
            primero = primero.getSiguiente();
        }
    }
    public void mostrar(){
        Nodo temporal = primero;
        while (temporal!= null){
            System.out.println(temporal.getDato() + "  ");
            temporal = temporal.getSiguiente();

        }
        System.out.println();
    }
}
