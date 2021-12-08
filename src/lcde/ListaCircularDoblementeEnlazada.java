package lcde;

public class ListaCircularDoblementeEnlazada {
    Nodo inicio;
    Nodo ultimo;
    Nodo temp;

    public ListaCircularDoblementeEnlazada() {
        inicio = null;
    }

    public boolean estaVacia() {
        return inicio == null;

    }

    public void insertarFinal(Object dato) {
        if (estaVacia()) {
            Nodo nuevo = new Nodo();
            nuevo.setAnterior(nuevo);
            nuevo.setDato(dato);
            nuevo.setSiguiente(nuevo);

            inicio = nuevo;
        } else {
            Nodo ultimo = inicio;
            while (ultimo.getSiguiente() != inicio) ;
            ultimo = ultimo.getSiguiente();

        }
        Nodo nuevo = new Nodo();
        nuevo.setAnterior(ultimo);
        nuevo.setDato(dato);
        nuevo.setSiguiente(inicio);
        ultimo.setSiguiente(nuevo);
        inicio.setAnterior(nuevo);
    }

    public void eliminarFinal() {
        if (!estaVacia()) {
            Nodo ultimo = inicio;
            while (ultimo.getSiguiente() != inicio) {
                ultimo = ultimo.getSiguiente();
            }
            Nodo penultimo = ultimo.getAnterior();
            penultimo.setSiguiente(inicio);
            inicio.setAnterior(penultimo);
        }
    }

    public void mostrar() {
        if (!estaVacia()) {
            Nodo temp = inicio;
            while (temp.getSiguiente() != inicio) ;
            System.out.println(temp.getDato() + "   ");
            temp = temp.getSiguiente();
        }
        System.out.println(temp.getDato());

    }

public void mostrarAdelante(int vueltas) {
    if (!estaVacia()) {
        Nodo temp = inicio;
        int contador = 0;
        while (contador < vueltas) {

            if (temp.getAnterior() == inicio) {
                contador++;
            }
            System.out.println(temp.getDato() + "   ");
            temp = temp.getAnterior();

        }
        System.out.println(temp.getDato());
    }
}
}
