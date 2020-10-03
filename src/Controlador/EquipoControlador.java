package Controlador;

import BaseDatos.BaseDatoControlador;
import EstructurasDinamicas.AVL.ArbolAVL;
import EstructurasDinamicas.AVL.Equipo;
import EstructurasDinamicas.AVL.GraficaArbolBinario;
import EstructurasDinamicas.ListaDobl.ListaDoble;
import EstructurasDinamicas.ListaDobl.Nodo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class EquipoControlador {

    BaseDatoControlador bdControlador = new BaseDatoControlador();
    ListaDoble listaDoble = new ListaDoble();
    ArbolAVL arbolAvl = new ArbolAVL();
    public ArrayList<Equipo> preOrdern = new ArrayList();
    public ArrayList<Equipo> InOrdern = new ArrayList();
    ;
    public ArrayList<Equipo> PostOrdern = new ArrayList();

    ;

    // INICIO -- LISTA DOBLEMENTE ENLAZADA
    public void agregarLD(String nombre, int camisa, int nivel,int precio) {
        listaDoble.Insertar(nombre, camisa, nivel, precio);
    }

    public void LlenarTablaLD(DefaultTableModel model, JTable tJugador) {
        String[] titulos = {"NOMBRE", "CAMISA","PRECIO", "NIVEL"};
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

    public void EliminarLD(int camisa) {
        listaDoble.Eliminar(camisa);
    }

    public int idEquipo() throws SQLException {
        String mysqlId = "SELECT MAX(idEquipo) FROM equipo";
        return bdControlador.ConsultarIdMax(mysqlId);

    }

    public void RegistrarEquipo(JTextField cEquipo) {
        String mysql = "INSERT INTO equipo(idEquipo,nombre,puntos) VALUES(?,?,?)";
        try {
            if (cEquipo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Existen campos vacios");
                return;
            }
            bdControlador.Registrar(mysql);
            bdControlador.ps.setInt(1, idEquipo());
            bdControlador.ps.setString(2, cEquipo.getText());
            bdControlador.ps.setInt(3, 0);
            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();
            JOptionPane.showMessageDialog(null, "Se Guardó Correctamente");
            cEquipo.setText("");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Guardar" + "\n" + e);
        }
    }

    public void RegistrarJugador(JTextField idEquipo) {
        String mysql = "INSERT INTO jugadores(nombre,camiseta,precio,nivel,idEquipo) VALUES(?,?,?,?,?)";
        try {
            bdControlador.Registrar(mysql);
            if (listaDoble.esVacia()) {
                return;
            }
            listaDoble.Retroceder();
            Nodo aux = listaDoble.cabecera;
            while (aux != null) {

                bdControlador.ps.setString(1, aux.getJugador().getNombre());
                bdControlador.ps.setInt(2, aux.getJugador().getCamisa());
                bdControlador.ps.setInt(3, aux.getJugador().getPrecio());
                bdControlador.ps.setInt(4, aux.getJugador().getNivel());
                bdControlador.ps.setInt(5, Integer.parseInt(idEquipo.getText()));
                bdControlador.ps.executeUpdate();
                aux = aux.getSig();

            }

            bdControlador.ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Guardar" + "\n" + e);
        }
    }
    // FIN -- LISTA DOBLEMENTE ENLAZADA

    // INICIO -- AVL
    public void DatosTablaAVL() {
        ResultSet rs;
        String mysql = "SELECT * FROM equipo";
        try {
            rs = bdControlador.Buscar(mysql);
            while (rs.next()) {
                this.arbolAvl.Anadir(Integer.parseInt(rs.getString("idequipo")), rs.getString("Nombre"));
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Guardar" + "\n" + e);
        }
    }

    public void graficar() {
        GraficaArbolBinario equipoGraficos = new GraficaArbolBinario(this.arbolAvl);
        JFrame ventana = new JFrame("Equipos");
        ventana.getContentPane().add(equipoGraficos);
        ventana.setSize(800, 400);
        ventana.setVisible(true);
    }

    public void TablaPre(DefaultTableModel model, JTable tEquipo) {
        String[] titulos = {"ID", "NOMBRE"};
        model = new DefaultTableModel(null, titulos);
        String[] fila = new String[2];
        for (int i = 0; i < preOrdern.size(); i++) {
            fila[0] = preOrdern.get(i).getId() + "";
            fila[1] = preOrdern.get(i).getNombre();

            model.addRow(fila);
        }
        TableColumnModel columnModel = tEquipo.getColumnModel();
        tEquipo.setModel(model);

    }

    public void TablaIn(DefaultTableModel model, JTable tEquipo) {
        String[] titulos = {"ID", "NOMBRE"};
        model = new DefaultTableModel(null, titulos);
        String[] fila = new String[2];
        for (int i = 0; i < InOrdern.size(); i++) {
            fila[0] = InOrdern.get(i).getId() + "";
            fila[1] = InOrdern.get(i).getNombre();

            model.addRow(fila);
        }
        TableColumnModel columnModel = tEquipo.getColumnModel();
        tEquipo.setModel(model);

    }

    public void TablaPost(DefaultTableModel model, JTable tEquipo) {
        String[] titulos = {"ID", "NOMBRE"};
        model = new DefaultTableModel(null, titulos);
        String[] fila = new String[2];
        for (int i = 0; i < this.PostOrdern.size(); i++) {
            fila[0] = PostOrdern.get(i).getId() + "";
            fila[1] = PostOrdern.get(i).getNombre();

            model.addRow(fila);
        }
        TableColumnModel columnModel = tEquipo.getColumnModel();
        tEquipo.setModel(model);

    }

    public void MostrarPreOrden() {
        PreOrden(this.arbolAvl.raiz);
    }

    public void PreOrden(EstructurasDinamicas.AVL.Nodo raiz) {
        if (raiz != null) {
            Equipo equipo = new Equipo(raiz.getDato().getId(), raiz.getDato().getNombre());
            this.preOrdern.add(new Equipo(raiz.getDato().getId(), raiz.getDato().getNombre()));
            PreOrden(raiz.getIzquierda());
            PreOrden(raiz.getDerecha());

        }
    }

    public void MostrarInOrden() {

        InOrden(this.arbolAvl.raiz);
    }

    private void InOrden(EstructurasDinamicas.AVL.Nodo raiz) {
        if (raiz != null) {
            InOrden(raiz.getIzquierda());
            Equipo equipo = new Equipo(raiz.getDato().getId(), raiz.getDato().getNombre());
            this.InOrdern.add(new Equipo(raiz.getDato().getId(), raiz.getDato().getNombre()));

            InOrden(raiz.getDerecha());
        }
    }

    public void MostrarPostOrden() {
        PostOrden(this.arbolAvl.raiz);
    }

    private void PostOrden(EstructurasDinamicas.AVL.Nodo raiz) {
        if (raiz != null) {
            PostOrden(raiz.getIzquierda());
            PostOrden(raiz.getDerecha());
            Equipo equipo = new Equipo(raiz.getDato().getId(), raiz.getDato().getNombre());
            this.PostOrdern.add(new Equipo(raiz.getDato().getId(), raiz.getDato().getNombre()));
        }
    }

    // FIN -- AVL
}















