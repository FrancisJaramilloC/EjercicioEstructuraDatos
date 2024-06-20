
public class Main {
    public static void main(String[] args) {
        /*Estructura arbol = new Arbol(10);
        arbol.agregar(5);
        arbol.agregar(6);
        arbol.agregar(7);
        arbol.agregar(12);
        arbol.agregar(11);
        ((Arbol) arbol).inOrden();
        //((Arbol) arbol).preOrden();
        //((Arbol) arbol).postOrden();*/

        ListaEnlazada lista = new ListaEnlazada(29);
        lista.agregar(10);
        lista.agregar(20);
        System.out.println("Lista Original: " + lista);
        lista.insertar(15, 2);
        lista.insertar(15, 2);
        lista.insertar(12, 1);
        System.out.println("lista con insertados: " + lista);
        System.out.println("Posicion del primer valor 15 encontrado: " + lista.obtenerPosicion(15));
        lista.eliminarNodo(1);
        System.out.println("Lista con nodo eliminado: " + lista);
        lista.eliminarFinal();
        System.out.println("Lista con nodo final eliminado: " + lista);
        lista.eliminarInicio();
        System.out.println("lista con nodo inicio eliminado: " + lista);
    }
}
