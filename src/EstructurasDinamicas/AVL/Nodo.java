package EstructurasDinamicas.AVL;

public class Nodo {
    private Equipo dato;
    private Nodo derecha, izquierda;
    public Nodo(Equipo dato) {
        this.dato = dato;
        this.derecha = null;
        this.izquierda = null;
    }

    public Equipo getDato() {
        return dato;
    }

    public void setDato(Equipo dato) {
        this.dato = dato;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }
    
}



