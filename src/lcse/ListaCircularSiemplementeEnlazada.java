package lcse;

//import lse.ListaCircularSimplementeEnlazada;

public class ListaCircularSiemplementeEnlazada {
private Nodo inicio;
public ListaCircularSiemplementeEnlazada(){
    inicio = null;

}
public boolean estaVacia(){
    return inicio == null;
}
public  int tamaño(){
    int contador = 0;

    if(!estaVacia()){
    Nodo ultimo =inicio;
    while (ultimo.getSiguiente()!= inicio){
        ultimo = ultimo.getSiguiente();
        contador++;
    }
    contador++;
    }
    return contador;
}
public void insertarFin(Object dato){
    if (estaVacia()){
    Nodo nuevo = new Nodo();
    nuevo.setDato(dato);
    nuevo.setSiguiente(nuevo);
    inicio = nuevo;

    }else{
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
        nuevo.setSiguiente(inicio);

        Nodo ultimo = inicio;
        while (ultimo.getSiguiente()!=inicio){
            ultimo = ultimo.getSiguiente();

        }
        ultimo.setSiguiente(nuevo);

        }
    }

    public void eliminarFin(){
    if (!estaVacia()){

        Nodo penultimo = inicio;
        while (penultimo.getSiguiente().getSiguiente()!=inicio){
            penultimo = penultimo.getSiguiente();

        }
        penultimo.setSiguiente(inicio);
    }
    }
    public void mostrar(){
    if(!estaVacia()){
        Nodo ultimo = inicio;
        while (ultimo.getSiguiente()!=inicio){
            System.out.print(ultimo.getDato()+ "    ");
        }
    }
    }
}
