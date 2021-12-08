package lcde;


public class Main {
    public static void main(String[] args) {
        ListaCircularDoblementeEnlazada listaCircularDoblementeEnlazada= new ListaCircularDoblementeEnlazada();
        System.out.println(listaCircularDoblementeEnlazada.estaVacia());
        System.out.println(listaCircularDoblementeEnlazada.tamaño());

        for (int i = 1; i <= 5; i++) {
            listaCircularDoblementeEnlazada.insertarFin(i);
        }

        listaCircularDoblementeEnlazada.mostrarCircular(1);
        listaCircularDoblementeEnlazada.mostrarAtras(1);
        System.out.println(listaCircularDoblementeEnlazada.tamaño());




    }
}