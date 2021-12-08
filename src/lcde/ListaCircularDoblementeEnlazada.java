package lcde;

public class ListaCircularDoblementeEnlazada {
    private Nodo inicio;
    public ListaCircularDoblementeEnlazada() {
        inicio = null;
    }

    public boolean estaVacia() {
        return inicio == null;
    }
    public int tamaño() {
        int contador = 0;
        if (!estaVacia()){
            Nodo ultimo = inicio;
            while (ultimo.getSiguiente() != inicio) {
                ultimo = ultimo.getSiguiente();

                contador++;
            }
            contador++;

        }
        return contador;
    }

    public void insertarFin(Object dato) {
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
            while (ultimo.getSiguiente() != inicio) {
                ultimo = ultimo.getSiguiente();
            }
            ultimo.setSiguiente(nuevo);



        }
    }

    public void eliminarFin(){
        if(!estaVacia()) {
            Nodo penultimo = inicio;
            while (penultimo.getSiguiente().getSiguiente() != inicio){
                penultimo = penultimo.getSiguiente();
            }
            penultimo.setSiguiente(inicio);
        }
    }
    public void mostrarCircular(int vueltas){
        if(!estaVacia()){
            int contador = 0;

            Nodo temp = inicio;
            while (temp != null &&  contador < (tamaño() * vueltas)) {
                System.out.print(temp.getDato() + "   ");

                temp = temp.getSiguiente();

                contador++;
            }

            System.out.println();
        }
    }
    public void mostrarAtras(int vueltas) {
        for (int i = tamaño(); i >= 0;i--)
        {
            System.out.print(i+ "  ");
        }
    }
}