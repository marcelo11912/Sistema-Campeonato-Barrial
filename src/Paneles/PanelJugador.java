package Paneles;

import Controlador.JugadorControlador;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class PanelJugador extends javax.swing.JPanel {

    JugadorControlador jugadorCont = new JugadorControlador();
    DefaultTableModel model;

    public PanelJugador() throws SQLException {
        initComponents();
        jugadorCont.DatosTabla();
        jugadorCont.LlenarTablaJugLD(model, jJugador);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgGenero = new javax.swing.ButtonGroup();
        jTabbedPane = new javax.swing.JTabbedPane();
        pEditar = new javax.swing.JPanel();
        pPlantilla1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jJugador = new javax.swing.JTable();
        cNivel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bMostrar = new PaginaPrincipal.RSButtonMetro();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        pEditar.setBackground(new java.awt.Color(255, 255, 255));
        pEditar.setLayout(null);

        pPlantilla1.setBackground(new java.awt.Color(255, 255, 255));
        pPlantilla1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Jugadores del Campeonato"));
        pPlantilla1.setAutoscrolls(true);

        jJugador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jJugador);

        javax.swing.GroupLayout pPlantilla1Layout = new javax.swing.GroupLayout(pPlantilla1);
        pPlantilla1.setLayout(pPlantilla1Layout);
        pPlantilla1Layout.setHorizontalGroup(
            pPlantilla1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPlantilla1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pPlantilla1Layout.setVerticalGroup(
            pPlantilla1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPlantilla1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pEditar.add(pPlantilla1);
        pPlantilla1.setBounds(30, 110, 380, 440);

        cNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNivelActionPerformed(evt);
            }
        });
        cNivel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cNivelKeyTyped(evt);
            }
        });
        pEditar.add(cNivel);
        cNivel.setBounds(40, 60, 120, 30);

        jLabel1.setText("Nivel del Campeonato");
        pEditar.add(jLabel1);
        jLabel1.setBounds(40, 30, 160, 20);

        bMostrar.setText("Mostrar");
        bMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrarActionPerformed(evt);
            }
        });
        pEditar.add(bMostrar);
        bMostrar.setBounds(180, 60, 150, 35);

        jTabbedPane.addTab("JUGADOR", pEditar);

        add(jTabbedPane);
        jTabbedPane.setBounds(0, 0, 880, 590);
    }// </editor-fold>//GEN-END:initComponents

    private void cNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNivelActionPerformed

    private void cNivelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNivelKeyTyped

    }//GEN-LAST:event_cNivelKeyTyped

    private void bMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrarActionPerformed
       this.jugadorCont.DatosVector(Integer.parseInt(this.cNivel.getText()));
    }//GEN-LAST:event_bMostrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private PaginaPrincipal.RSButtonMetro bMostrar;
    private javax.swing.ButtonGroup bgGenero;
    private javax.swing.JTextField cNivel;
    private javax.swing.JTable jJugador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JPanel pEditar;
    private javax.swing.JPanel pPlantilla1;
    // End of variables declaration//GEN-END:variables
}
