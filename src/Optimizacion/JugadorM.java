
package Optimizacion;


public class JugadorM {
    private String nombre;
    private int nivel;
    private int costo;

    public JugadorM(String nombre,int nivel, int costo) {
        this.nivel = nivel;
        this.costo = costo;
        this.nombre = nombre;
    }
    

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final JugadorM other = (JugadorM) obj;
        if (this.nivel != other.nivel) {
            return false;
        }
        if (this.costo != other.costo) {
            return false;
        }
        return true;
    }

    @Override

    public String toString() {
        return "Jugador: " + nombre + " Nivel: " + nivel + " Precio: " + costo ;
    }
    
    
    
    
}











