/**
 * La clase NodoLista extiende Nodo y representa un nodo en una lista enlazada.
 */
public class NodoLista extends Nodo{

    protected NodoLista siguiente; // El siguiente nodo en la lista

    /**
     * Constructor para NodoLista.
     * @param valor El valor del nodo.
     */
    public NodoLista(int valor) {
        super(valor);
        this.siguiente = null;
    }

    /**
     * Getter para el siguiente nodo.
     * @return El siguiente nodo en la lista.
     */
    public NodoLista getSiguiente() {
        return siguiente;
    }

    /**
     * Inserta un nuevo nodo en una posición específica en la lista.
     * @param valor El valor del nuevo nodo.
     * @param posicion La posición para insertar el nuevo nodo.
     * @return true si el nodo se insertó correctamente, false en caso contrario.
     */
    public boolean insertar(int valor, int posicion) {
        if (posicion == 0) {
            NodoLista nuevoNodo = new NodoLista(valor);
            nuevoNodo.siguiente = this.siguiente;
            this.siguiente = nuevoNodo;
            return true;
        } else if (this.siguiente != null) {
            return this.siguiente.insertar(valor, posicion - 1);
        } else {
            return false;
        }
    }

    /**
     * Agrega un nuevo nodo al final de la lista.
     * @param valor El valor del nuevo nodo.
     * @return true si el nodo se agregó correctamente, false en caso contrario.
     */
    public boolean agregar(int valor){
        if(this.siguiente == null){
            this.siguiente = new NodoLista(valor);
            return true;
        }else{
            return this.siguiente.agregar(valor);
        }
    }

    /**
     * Encuentra la posición de un nodo con un valor específico.
     * @param valorBuscado El valor a buscar.
     * @return La posición del primer nodo con el valor buscado, o -1 si no se encuentra.
     */
    public int obtenerPosicion(int valorBuscado) {
        NodoLista current = this;
        int position = 0;
        while (current != null) {
            if (current.getValor() == valorBuscado) {
                return position;
            }
            current = current.getSiguiente();
            position++;
        }
        return -1; // Devuelve -1 si el valor no se encuentra
    }

    /**
     * Elimina un nodo en una posición específica.
     * @param posicion La posición del nodo a eliminar.
     */
    public void eliminarNodo(int posicion){
        if(posicion == 1){
            this.siguiente = this.siguiente.siguiente;
        }else{
            this.siguiente.eliminarNodo(posicion - 1);
        }
    }

    /**
     * Elimina el último nodo en la lista.
     */
    public void eliminarFinal(){
        if(this.siguiente.siguiente == null){
            this.siguiente = null;
        }else{
            this.siguiente.eliminarFinal();
        }
    }

    /**
     * Elimina el primer nodo en la lista.
     */
    public void eliminarInicio(){
        this.siguiente = this.siguiente.siguiente;
    }
}