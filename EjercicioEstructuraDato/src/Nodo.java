public class Nodo implements INodo {

    //Atributos
    protected int valor;
    //Relaciones
    protected Nodo izquierda;
    protected Nodo derecha;

    //Constructor
    public Nodo(int valor) {
        this.valor = valor;
    }

    //Getters y Setters
    public int getValor() {
        return valor;
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
