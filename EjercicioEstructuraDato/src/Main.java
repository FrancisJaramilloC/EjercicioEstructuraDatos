
public class Main {
    public static void main(String[] args) {
        Estructura arbol = new Arbol(10);
        arbol.agregar(5);
        arbol.agregar(6);
        arbol.agregar(7);
        arbol.agregar(12);
        arbol.agregar(11);
        ((Arbol) arbol).inOrden();
        //((Arbol) arbol).preOrden();
        //((Arbol) arbol).postOrden();
    }
}
