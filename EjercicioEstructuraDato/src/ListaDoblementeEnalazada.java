public class ListaDoblementeEnalazada extends ListaEnlazada {

    public ListaDoblementeEnalazada(int valor) {
        super(valor);
    }

    public void eliminarRepetidos(int valor){
        NodoLista nodo = this.inicio;
        boolean encontrado = false;
        while (nodo != null && nodo.getActual() != null) {
            if (nodo.getActual().getValor() == valor) {
                if (encontrado) {
                    nodo.setActual(nodo.getActual().getActual());
                    this.numNodos--;
                } else {
                    encontrado = true;
                    nodo = nodo.getActual();
                }
            } else {
                nodo = nodo.getActual();
            }
        }
    }


    @Override
    public String toString() {
        StringBuilder lista = new StringBuilder("Num nodos: " + this.numNodos + "\nLista: ");
        NodoLista nodo = this.inicio;
        while (nodo != null) {
            lista.append(nodo.getValor());
            if (nodo.getActual() != null) {
                lista.append(" <-> ");
            }
            nodo = nodo.getActual();
        }
        return lista.toString();
    }
}
