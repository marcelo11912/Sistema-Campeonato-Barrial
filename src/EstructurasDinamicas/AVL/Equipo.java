
package EstructurasDinamicas.AVL;


public class Equipo {
    
    private int id;
    private String nombre;
    private int puntos;
    public Equipo(){
    
    }
    public Equipo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "ID:"+id +" " +nombre;
    }
    
    
}









