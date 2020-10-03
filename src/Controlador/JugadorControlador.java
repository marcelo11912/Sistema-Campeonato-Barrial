package Controlador;

import BaseDatos.BaseDatoControlador;
import EstructurasDinamicas.ListaDobl.ListaDoble;
import EstructurasDinamicas.ListaDobl.Nodo;
import Optimizacion.JugadorM;
import Optimizacion.Torneo;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class JugadorControlador {

    BaseDatoControlador bdControlador = new BaseDatoControlador();
    ListaDoble listaDoble = new ListaDoble();

    public void DatosTabla() {
        ResultSet rs;
        String mysql = "SELECT JUG.NOMBRE, JUG.CAMISETA, JUG.PRECIO, JUG.NIVEL FROM  jugadores JUG";
        try {
            rs = bdControlador.Buscar(mysql);
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                int camiseta = rs.getInt("camiseta");
                int precio = rs.getInt("precio");
                int nivel = rs.getInt("nivel");

                listaDoble.Insertar(nombre, camiseta, precio, nivel);

            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Guardar" + "\n" + e);
        }

    }

    public void LlenarTablaJugLD(DefaultTableModel model, JTable tJugador) {
        String[] titulos = {"NOMBRE", "CAMISA", "PRECIO", "NIVEL"};
        model = new DefaultTableModel(null, titulos);
        String[] fila = new String[4];

        if (listaDoble.esVacia()) {
            return;
        }
        listaDoble.Retroceder();
        Nodo aux = listaDoble.cabecera;
        while (aux != null) {

            fila[0] = aux.getJugador().getNombre();
            fila[1] = aux.getJugador().getCamisa() + "";
            fila[2] = aux.getJugador().getPrecio() + "";
            fila[3] = aux.getJugador().getNivel() + "";

            model.addRow(fila);
            aux = aux.getSig();

        }
        TableColumnModel columnModel = tJugador.getColumnModel();
        tJugador.setModel(model);

    }

    public static void LlenarMochila(Torneo tBase, JugadorM[] elementos, boolean llena, Torneo tOpt) {
        if (llena) {
            if (tBase.getSumaPrecio() > tOpt.getSumaPrecio()) {

                JugadorM[] elementosTornBase = tBase.getElementos();
                tOpt.Vaciar();

                for (JugadorM jugadorM : elementosTornBase) {
                    if (jugadorM != null) {
                        tOpt.Añadir(jugadorM);
                    }
                }
            }
        } else {
            for (int i = 0; i < elementos.length; i++) {
                if (!tBase.ExisteElemento(elementos[i])) {

                    if (tBase.getNivelMax() > tBase.getSumaNivel() + elementos[i].getNivel()) {

                        tBase.Añadir(elementos[i]);
                        LlenarMochila(tBase, elementos, false, tOpt);
                        tBase.Eliminar(elementos[i]);
                    } else {
                        LlenarMochila(tBase, elementos, true, tOpt);
                    }
                }

            }
        }
    }

    public void DatosVector( int nivelMax) {
        this.DatosTabla();

        JugadorM[] elementos = new JugadorM[listaDoble.getTamano()];
        if (listaDoble.esVacia()) {
            return;
        }
        listaDoble.Retroceder();
        Nodo aux = listaDoble.cabecera;
        int conta = 0;
        while (aux != null) {
            elementos[conta] = new JugadorM(aux.getJugador().getNombre(),aux.getJugador().getNivel(), aux.getJugador().getPrecio());
            conta = conta + 1;
            aux = aux.getSig();

        }
        Torneo tBase = new Torneo(nivelMax, elementos.length);
        Torneo tOpt = new Torneo(nivelMax, elementos.length);
        LlenarMochila(tBase, elementos, false, tOpt);
        JOptionPane.showMessageDialog(null, tOpt);
     

    }

}






