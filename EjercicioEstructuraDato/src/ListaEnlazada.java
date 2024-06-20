public class ListaEnlazada implements Lista {
    private int numNodos;
    private NodoLista inicio;
    private NodoLista fin;

    public ListaEnlazada(int valor) {
        this.inicio = new NodoLista(valor);
        this.fin = this.inicio;
        this.numNodos++;
    }

    @Override
    public boolean agregar(int valor) {
        this.numNodos++;
        return this.fin.agregar(valor);
    }
    @Override
    public boolean insertar(int valor, int posicion){
        if (posicion == 0) {
            NodoLista nuevoNodo = new NodoLista(valor);
            nuevoNodo.siguiente = this.inicio;
            this.inicio = nuevoNodo;
            this.numNodos++;
            return true;
        } else {
            this.numNodos++;
            return this.inicio.insertar(valor, posicion - 1);
        }
    }

    public int obtenerPosicion(int valorBuscado) {
        return this.inicio.obtenerPosicion(valorBuscado);
    }
    public void eliminarNodo(int posicion){
        this.numNodos--;
        this.inicio.eliminarNodo(posicion);
    }
    public void eliminarFinal(){
        this.numNodos--;
        this.inicio.eliminarFinal();
    }
    public void eliminarInicio(){
        this.numNodos--;
        this.inicio = this.inicio.siguiente;
    }
    @Override
    public String toString() {
        StringBuilder lista = new StringBuilder("Num nodos: " + this.numNodos + "\nLista: ");
        NodoLista nodo = this.inicio;
        while (nodo != null) {
            lista.append(nodo.getValor());
            if (nodo.getSiguiente() != null) {
                lista.append(" -> ");
            }
            nodo = nodo.getSiguiente();
        }
        return lista.toString();
    }
}
