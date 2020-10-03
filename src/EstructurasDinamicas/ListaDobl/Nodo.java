package EstructurasDinamicas.ListaDobl;

public class Nodo {

    private Jugador jugador;
    private Nodo ant, sig;

    public Nodo() {
        this.jugador = null;
        this.ant = null;
        this.sig = null;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    

}





