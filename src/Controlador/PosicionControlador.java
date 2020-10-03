package Controlador;

import BaseDatos.BaseDatoControlador;
import EstructurasDinamicas.AVL.Equipo;
import EstructurasDinamicas.LCD.ListaCD;
import EstructurasDinamicas.LCD.Nodo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class PosicionControlador {

    BaseDatoControlador bdControlador = new BaseDatoControlador();
    public ArrayList<Equipo> listaEquipo = new ArrayList<>();
    ListaCD listaCD = new ListaCD();

    public void DatosTabla() {
        ResultSet rs;
        String mysql = "SELECT * FROM equipo";
        try {
            rs = bdControlador.Buscar(mysql);
            while (rs.next()) {
                Equipo equipo = new Equipo();
                equipo.setId(Integer.parseInt(rs.getString("idEquipo")));
                equipo.setNombre(rs.getString("Nombre"));
                equipo.setPuntos(Integer.parseInt(rs.getString("puntos")));

                listaEquipo.add(equipo);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Guardar" + "\n" + e);
        }

    }

    public void LlenarTabla(DefaultTableModel model, JTable tEnfermedad) {
        String[] titulos = {"ID", "NOMBRE", "PUNTOS"};
        model = new DefaultTableModel(null, titulos);
        String[] fila = new String[3];
        for (int i = 0; i < this.listaEquipo.size(); i++) {
            fila[0] = listaEquipo.get(i).getId() + "";
            fila[1] = listaEquipo.get(i).getNombre();
            fila[2] = listaEquipo.get(i).getPuntos() + "";

            model.addRow(fila);
        }
        TableColumnModel columnModel = tEnfermedad.getColumnModel();
        tEnfermedad.setModel(model);

    }

    public void PasarDatos(JTable tEquipo, JTextField cId, JTextField cNombre) {
        int rec = tEquipo.getSelectedRow();
        cId.setText((String) tEquipo.getValueAt(rec, 0));
        cNombre.setText((String) tEquipo.getValueAt(rec, 1));
    }

    public void Modificar(JTextField cPuntos, JTextField cId) {
        String mysql = "UPDATE equipo SET puntos=? WHERE idequipo=?";
        try {

            bdControlador.Registrar(mysql);
            bdControlador.ps.setInt(1, 3);
            bdControlador.ps.setInt(2, Integer.parseInt(cId.getText()));
            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();
            JOptionPane.showMessageDialog(null, "Se agrego los 3 puntos con exito");

            cPuntos.setText("");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Modificar" + "\n" + e);
        }

    }

    public void Ordenado() {
        for (int i = 0; i < this.listaEquipo.size(); i++) {
            this.listaCD.InsertarOrdenados(listaEquipo.get(i).getId(), listaEquipo.get(i).getNombre(), listaEquipo.get(i).getPuntos());
        }
    }

    public void LlenarTablaOrd(DefaultTableModel model, JTable tJugador) {
        String[] titulos = {"ID", "NOMBRE", "PUNTOS"};
        model = new DefaultTableModel(null, titulos);
        String[] fila = new String[3];

        if (listaCD.EsVacia()) {
            return;
        }
        Nodo aux = listaCD.cabecera;
        do {
            fila[0] = aux.getDato().getId() + "";
            fila[1] = aux.getDato().getNombre();
            fila[2] = aux.getDato().getPuntos() + "";
    
            model.addRow(fila);
            aux = aux.getSig();
            
        } while (aux != listaCD.cabecera);

        TableColumnModel columnModel = tJugador.getColumnModel();
        tJugador.setModel(model);

    }
}















