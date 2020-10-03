/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccionEspecial;


import Paneles.PanelEquipo;
import Paneles.PanelJugador;
import Paneles.PanelPosiciones;
import java.sql.SQLException;
import javax.swing.JPanel;

public class AccionBotones {

    public void botonEquipo(JPanel PanelCambio) throws SQLException  {
        PanelEquipo panelEquipo = new PanelEquipo();
        panelEquipo.setVisible(true);
        panelEquipo.setSize(1000, 589);
        panelEquipo.setLocation(5, 5);
        PanelCambio.removeAll();
        PanelCambio.add(panelEquipo);
        PanelCambio.revalidate();
        PanelCambio.repaint();

    }
    
     public void botonJugador(JPanel PanelCambio) throws SQLException  {
        PanelJugador panelJugador = new PanelJugador();
        panelJugador.setVisible(true);
        panelJugador.setSize(1000, 589);
        panelJugador.setLocation(5, 5);
        PanelCambio.removeAll();
        PanelCambio.add(panelJugador);
        PanelCambio.revalidate();
        PanelCambio.repaint();

    }
      public void botonPosiciones(JPanel PanelCambio) throws SQLException  {
        PanelPosiciones panelPosiciones  = new PanelPosiciones ();
        panelPosiciones.setVisible(true);
        panelPosiciones.setSize(1000, 589);
        panelPosiciones.setLocation(5, 5);
        PanelCambio.removeAll();
        PanelCambio.add(panelPosiciones);
        PanelCambio.revalidate();
        PanelCambio.repaint();

    }

   

}











