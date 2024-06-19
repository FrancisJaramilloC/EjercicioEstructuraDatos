public class Nodo implements INodo {

    //Atributos
    private int valor;
    //Relaciones
    private Nodo izquierda;
    private Nodo derecha;

    //Constructor
    public Nodo(int valor) {
        this.valor = valor;
    }

    //Getters y Setters
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    //Metodos
    public boolean agregar(int valor) {
        if (valor > this.valor) {
            if (this.izquierda == null) {
                this.izquierda = new Nodo(valor);
                return true;
            } else {
                return this.izquierda.agregar(valor);
            }
        } else {
            if (this.derecha == null) {
                this.derecha = new Nodo(valor);
                return true;
            } else {
                return this.derecha.agregar(valor);
            }
        }
    }

    public void postOrden(){
        if(this.izquierda != null){
            this.izquierda.postOrden();
        }
        if(this.derecha != null){
            this.derecha.postOrden();
        }
        System.out.println(this.valor);
    }

    public void preOrden(){
        System.out.println(this.valor);
        if(this.izquierda != null){
            this.izquierda.preOrden();
        }
        if(this.derecha != null){
            this.derecha.preOrden();
        }
    }

    public void inOrden(){
        if(this.izquierda != null){
            this.izquierda.inOrden();
        }
        System.out.println(this.valor);
        if(this.derecha != null){
            this.derecha.inOrden();
        }
    }
}
