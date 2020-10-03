
package EstructurasDinamicas.ListaDobl;


public class Jugador {
    
    
    private String nombre;
    private int camisa;
    private int precio;
    private int nivel;
   

    public Jugador( String nombre, int camisa, int nivel,int precio) {
        this.nombre = nombre;
        this.camisa = camisa;
        this.nivel = nivel;
        this.precio = precio;
    }

   

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCamisa() {
        return camisa;
    }

    public void setCamisa(int camisa) {
        this.camisa = camisa;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    
    
    
}




















