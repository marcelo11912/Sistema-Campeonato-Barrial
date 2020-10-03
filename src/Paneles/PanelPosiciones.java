package Paneles;


import AccionEspecial.Accion;
import Controlador.EquipoControlador;
import Controlador.PosicionControlador;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;


public class PanelPosiciones extends javax.swing.JPanel {

    DefaultTableModel model;
    Accion accion = new Accion();
    PosicionControlador  posicionCon = new PosicionControlador();
    

    public PanelPosiciones() throws SQLException {
        initComponents();
        this.cIdEquipo.setVisible(false);
        posicionCon.DatosTabla();
        posicionCon.LlenarTabla(model, jEquipo);
        posicionCon.Ordenado();
        posicionCon.LlenarTablaOrd(model, jEquipoCa);
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgGenero = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pRegistrar = new javax.swing.JPanel();
        pDatos = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        cNombreE = new javax.swing.JTextField();
        cIdEquipo = new javax.swing.JTextField();
        bGano = new PaginaPrincipal.RSButtonMetro();
        pPlantilla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEquipo = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        cBuscar = new javax.swing.JTextField();
        pEditar = new javax.swing.JPanel();
        pPlantilla1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEquipoCa = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        pRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        pRegistrar.setLayout(null);

        pDatos.setBackground(new java.awt.Color(255, 255, 255));
        pDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Equipo"));
        pDatos.setAutoscrolls(true);

        jLabel13.setText("NOMBRE");

        cNombreE.setEditable(false);
        cNombreE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cNombreEKeyTyped(evt);
            }
        });

        cIdEquipo.setEditable(false);
        cIdEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cIdEquipoActionPerformed(evt);
            }
        });
        cIdEquipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cIdEquipoKeyTyped(evt);
            }
        });

        bGano.setText("Ganó");
        bGano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGanoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pDatosLayout = new javax.swing.GroupLayout(pDatos);
        pDatos.setLayout(pDatosLayout);
        pDatosLayout.setHorizontalGroup(
            pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatosLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDatosLayout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(bGano, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        pDatosLayout.setVerticalGroup(
            pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(bGano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pRegistrar.add(pDatos);
        pDatos.setBounds(20, 20, 570, 110);

        pPlantilla.setBackground(new java.awt.Color(255, 255, 255));
        pPlantilla.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Equipos"));
        pPlantilla.setAutoscrolls(true);

        jEquipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEquipoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jEquipo);

        javax.swing.GroupLayout pPlantillaLayout = new javax.swing.GroupLayout(pPlantilla);
        pPlantilla.setLayout(pPlantillaLayout);
        pPlantillaLayout.setHorizontalGroup(
            pPlantillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPlantillaLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        pPlantillaLayout.setVerticalGroup(
            pPlantillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPlantillaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pRegistrar.add(pPlantilla);
        pPlantilla.setBounds(20, 220, 490, 270);

        jLabel14.setText("Buscar");
        pRegistrar.add(jLabel14);
        jLabel14.setBounds(20, 150, 40, 23);

        cBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cBuscarKeyTyped(evt);
            }
        });
        pRegistrar.add(cBuscar);
        cBuscar.setBounds(20, 170, 220, 30);

        jTabbedPane1.addTab("PUNTOS", pRegistrar);

        pEditar.setBackground(new java.awt.Color(255, 255, 255));
        pEditar.setLayout(null);

        pPlantilla1.setBackground(new java.awt.Color(255, 255, 255));
        pPlantilla1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tabla de Posiciones del Campeonato"));
        pPlantilla1.setAutoscrolls(true);

        jEquipoCa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jEquipoCa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEquipoCaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jEquipoCa);

        javax.swing.GroupLayout pPlantilla1Layout = new javax.swing.GroupLayout(pPlantilla1);
        pPlantilla1.setLayout(pPlantilla1Layout);
        pPlantilla1Layout.setHorizontalGroup(
            pPlantilla1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPlantilla1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        pPlantilla1Layout.setVerticalGroup(
            pPlantilla1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPlantilla1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pEditar.add(pPlantilla1);
        pPlantilla1.setBounds(60, 60, 490, 350);

        jTabbedPane1.addTab("POSICIONES", pEditar);

        add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 880, 590);
    }// </editor-fold>//GEN-END:initComponents

    private void cNombreEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNombreEKeyTyped

    }//GEN-LAST:event_cNombreEKeyTyped

    private void cIdEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cIdEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdEquipoActionPerformed

    private void cIdEquipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cIdEquipoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdEquipoKeyTyped

    private void bGanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGanoActionPerformed
       this.posicionCon.Modificar(this.cNombreE, this.cIdEquipo);
    }//GEN-LAST:event_bGanoActionPerformed

    private void cBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBuscarKeyTyped
        this.accion.filtro(this.cBuscar.getText(), jEquipo);
    }//GEN-LAST:event_cBuscarKeyTyped

    private void jEquipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEquipoMouseClicked
      this.posicionCon.PasarDatos(jEquipo,this.cIdEquipo, cNombreE);
    }//GEN-LAST:event_jEquipoMouseClicked

    private void jEquipoCaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEquipoCaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jEquipoCaMouseClicked
  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private PaginaPrincipal.RSButtonMetro bGano;
    private javax.swing.ButtonGroup bgGenero;
    private javax.swing.JTextField cBuscar;
    private javax.swing.JTextField cIdEquipo;
    private javax.swing.JTextField cNombreE;
    private javax.swing.JTable jEquipo;
    private javax.swing.JTable jEquipoCa;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pDatos;
    private javax.swing.JPanel pEditar;
    private javax.swing.JPanel pPlantilla;
    private javax.swing.JPanel pPlantilla1;
    private javax.swing.JPanel pRegistrar;
    // End of variables declaration//GEN-END:variables
}
