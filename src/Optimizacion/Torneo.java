package Optimizacion;

public class Torneo {

    private int nivelMax;
    private JugadorM[] elementos;
    private int sumaPrecio;
    private int sumaNivel;

    public Torneo(int nivelMax, int numElementos) {
        this.nivelMax = nivelMax;
        this.elementos = new JugadorM[numElementos];
        this.sumaPrecio = 0;
        this.sumaNivel = 0;
    }

    public int getNivelMax() {
        return nivelMax;
    }

    public void setNivelMax(int nivelMax) {
        this.nivelMax = nivelMax;
    }

    public JugadorM[] getElementos() {
        return elementos;
    }

    public void setElementos(JugadorM[] elementos) {
        this.elementos = elementos;
    }

    public int getSumaPrecio() {
        return sumaPrecio;
    }

    public void setSumaPrecio(int sumaPrecio) {
        this.sumaPrecio = sumaPrecio;
    }

    public int getSumaNivel() {
        return sumaNivel;
    }

    public void setSumaNivel(int sumaNivel) {
        this.sumaNivel = sumaNivel;
    }

    public void Añadir(JugadorM jugador) {
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == null) {
                elementos[i] = jugador;
                this.sumaNivel += jugador.getNivel();
                this.sumaPrecio += jugador.getCosto();
                break;
            }
        }
    }

    public void Eliminar(JugadorM jugador) {
        for (int i = 0; i < this.elementos.length; i++) {
            if (elementos[i].equals(jugador)) {
                elementos[i] = null;
                this.sumaNivel -= jugador.getNivel();
                this.sumaPrecio -= jugador.getCosto();
                 break;
            }
        }
    }

    public boolean ExisteElemento(JugadorM jugador) {
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] != null && elementos[i].equals(jugador)) {
                return true;
            }
        }
        return false;
    }

    public void Vaciar() {
        this.sumaNivel = 0;
        this.sumaPrecio = 0;
        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = null;
        }
    }

    @Override
    public String toString() {
        String cadena = "";
        for (int i = 0; i < elementos.length; i++) {
            if (this.elementos[i] != null) {
                cadena += elementos[i] + "\n";
            }
        }
        cadena += "Nivel del Torneo: " + this.getSumaNivel() + "\n";
        cadena += "Precio Total de los Jugadores: " + this.getSumaPrecio() + "\n";
        return cadena;
    }

}









