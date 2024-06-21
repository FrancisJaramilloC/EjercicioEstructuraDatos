import java.util.Random;

public class ListaCircular implements Lista{
    private int tamanio;
    private NodoLista inicio;

    public ListaCircular(int valor) {
        this.inicio = new NodoLista(valor);
        this.inicio.setSiguiente(this.inicio);  // El primer nodo se apunta a sí mismo
        this.tamanio = 1;
        System.out.println("Lista inicializada con el nodo: " + valor);
    }

    @Override
    public boolean agregar(int valor) {
        boolean agregado = inicio.agregar(valor);
        if (agregado) {
            tamanio++;
            System.out.println("Nodo agregado: " + valor + " | Tamaño: " + tamanio);
        }
        return agregado;
    }

    @Override
    public void ordenarAscendente() {
        if (tamanio > 1) {
            boolean swapped;
            do {
                NodoLista current = inicio;
                NodoLista next = inicio.getSiguiente();
                swapped = false;

                for (int i = 0; i < tamanio - 1; i++) {
                    if (current.getValor() > next.getValor()) {
                        int temp = current.getValor();
                        current.setValor(next.getValor());
                        next.setValor(temp);
                        swapped = true;
                    }
                    current = next;
                    next = next.getSiguiente();
                }
            } while (swapped);
        }
    }

    @Override
    public String toString() {
        StringBuilder lista = new StringBuilder();
        lista.append("Tamaño de la lista: ").append(tamanio).append("\n");
        if (tamanio > 0) {
            NodoLista aux = inicio;
            do {
                lista.append("->").append(aux.getValor());
                aux = aux.getSiguiente();
            } while (aux != inicio);
        }
        lista.append("\n<-----------<");
        return lista.toString();
    }
}
