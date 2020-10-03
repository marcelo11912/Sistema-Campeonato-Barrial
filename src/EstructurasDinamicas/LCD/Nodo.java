
package EstructurasDinamicas.LCD;


public class Nodo {
    private Equipo dato;
    private Nodo sig, ant;

    public Nodo() {
        this.dato = null;
        this.sig = null;
        this.ant = null;
    }

    public Equipo getDato() {
        return dato;
    }

    public void setDato(Equipo dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }
    
    
    
}




