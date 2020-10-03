package EstructurasDinamicas.ListaDobl;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ListaDoble {

    public Nodo cabecera;
    private int tamano;

    public ListaDoble() {
        this.cabecera = null;
    }

    public Nodo getCabecera() {
        return cabecera;
    }

    public void setCabecera(Nodo cabecera) {
        this.cabecera = cabecera;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public boolean esVacia() {
        return cabecera == null;
    }

    public void Insertar( String nombre, int camisa, int nivel,int precio) {
        Nodo nuevo = new Nodo();
        Jugador jugador = new Jugador( nombre, camisa, nivel,precio);
        nuevo.setJugador(jugador);
        if (esVacia()) {
            cabecera = nuevo;

        } else {
            Retroceder();
            nuevo.setSig(cabecera);
            cabecera.setAnt(nuevo);
            cabecera = nuevo;
        }
        tamano++;

    }

    public void Retroceder() {
        if (!esVacia()) {
            while (cabecera.getAnt() != null) {
                cabecera = cabecera.getAnt();
            }
        }
    }

 

    public void Eliminar(int camisa) {
        if (esVacia()) {
          JOptionPane.showMessageDialog(null,"La lista esta vacia");
            return;
        }
        Retroceder();
        Nodo aux = cabecera;
        while (aux != null) {
            if (aux.getJugador().getCamisa() == camisa) {
                if (aux.getAnt() != null) {
                    aux.getAnt().setSig(aux.getSig());
                }
                if (aux.getSig() != null) {
                aux.getSig().setAnt(aux.getAnt());
                }
                if (aux == cabecera) {
                    if (aux.getSig() != null) {
                        cabecera = aux.getSig();
                    } else {
                        cabecera = aux.getAnt();
                    }
                }
                JOptionPane.showMessageDialog(null,"Jugador eliminado exitosamente");
                return;
            } else {
                aux = aux.getSig();
            }
            
        }
        cabecera = cabecera.getSig();
    }

}



























