public class Arbol implements  Estructura {

    private Nodo raiz;

    public Arbol(int valor) {
        this.raiz = new Nodo(valor);
    }

    @Override
    public boolean agregar(int valor) {
        return raiz.agregar(valor);
    }

    public void inOrden(){
        this.raiz.inOrden();
    }

    public void preOrden(){
        this.raiz.preOrden();
    }

    public void postOrden(){
        this.raiz.postOrden();
    }
}