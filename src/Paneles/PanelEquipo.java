package Paneles;

import AccionEspecial.Accion;
import Controlador.EquipoControlador;
import EstructurasDinamicas.ListaDobl.ListaDoble;
import EstructurasDinamicas.ListaDobl.Nodo;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class PanelEquipo extends javax.swing.JPanel {

    DefaultTableModel model;

    EquipoControlador equipoCon = new EquipoControlador();
    ListaDoble lista = new ListaDoble();

    public PanelEquipo() throws SQLException {
        initComponents();

        this.cIdEquipo.setText(Integer.toString(equipoCon.idEquipo()));
        this.cIdEquipo.setVisible(false);
        equipoCon.DatosTablaAVL();

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
        pPlantilla = new javax.swing.JPanel();
        bGuardar = new PaginaPrincipal.RSButtonMetro();
        jScrollPane1 = new javax.swing.JScrollPane();
        jJugador = new javax.swing.JTable();
        pJugadores = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        cNombreJu = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        cCamisa = new javax.swing.JTextField();
        cNivel = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        bAgregar = new PaginaPrincipal.RSButtonMetro();
        bMostrar = new PaginaPrincipal.RSButtonMetro();
        jLabel21 = new javax.swing.JLabel();
        cPrecio = new javax.swing.JTextField();
        pJugadoresE = new javax.swing.JPanel();
        cIdEli = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        bMostrar1 = new PaginaPrincipal.RSButtonMetro();
        cEliminar = new PaginaPrincipal.RSButtonMetro();
        pEditar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bGrafica = new PaginaPrincipal.RSButtonMetro();
        pPlantilla1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jEquipo = new javax.swing.JTable();
        bPos = new PaginaPrincipal.RSButtonMetro();
        bPre = new PaginaPrincipal.RSButtonMetro();
        bIn = new PaginaPrincipal.RSButtonMetro();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        pRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        pRegistrar.setLayout(null);

        pDatos.setBackground(new java.awt.Color(255, 255, 255));
        pDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Equipo"));
        pDatos.setAutoscrolls(true);

        jLabel13.setText("NOMBRE");

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

        javax.swing.GroupLayout pDatosLayout = new javax.swing.GroupLayout(pDatos);
        pDatos.setLayout(pDatosLayout);
        pDatosLayout.setHorizontalGroup(
            pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(cIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        pDatosLayout.setVerticalGroup(
            pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pRegistrar.add(pDatos);
        pDatos.setBounds(50, 10, 660, 90);

        pPlantilla.setBackground(new java.awt.Color(255, 255, 255));
        pPlantilla.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Plantilla"));
        pPlantilla.setAutoscrolls(true);

        bGuardar.setText("Guardar");
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });

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
        jScrollPane1.setViewportView(jJugador);

        javax.swing.GroupLayout pPlantillaLayout = new javax.swing.GroupLayout(pPlantilla);
        pPlantilla.setLayout(pPlantillaLayout);
        pPlantillaLayout.setHorizontalGroup(
            pPlantillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPlantillaLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(bGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        pPlantillaLayout.setVerticalGroup(
            pPlantillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPlantillaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPlantillaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        pRegistrar.add(pPlantilla);
        pPlantilla.setBounds(50, 290, 610, 260);

        pJugadores.setBackground(new java.awt.Color(255, 255, 255));
        pJugadores.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Jugadores"));
        pJugadores.setAutoscrolls(true);

        jLabel18.setText("NOMBRES");

        cNombreJu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNombreJuActionPerformed(evt);
            }
        });
        cNombreJu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cNombreJuKeyTyped(evt);
            }
        });

        jLabel19.setText("#CAMISA");

        cCamisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCamisaActionPerformed(evt);
            }
        });
        cCamisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cCamisaKeyTyped(evt);
            }
        });

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

        jLabel20.setText("NIVEL DE JUEGO");

        bAgregar.setText("Agregar");
        bAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarActionPerformed(evt);
            }
        });

        bMostrar.setText("Mostrar");
        bMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrarActionPerformed(evt);
            }
        });

        jLabel21.setText("PRECIO");

        cPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cPrecioActionPerformed(evt);
            }
        });
        cPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cPrecioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pJugadoresLayout = new javax.swing.GroupLayout(pJugadores);
        pJugadores.setLayout(pJugadoresLayout);
        pJugadoresLayout.setHorizontalGroup(
            pJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pJugadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pJugadoresLayout.createSequentialGroup()
                        .addGroup(pJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cCamisa, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(bAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cNombreJu, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        pJugadoresLayout.setVerticalGroup(
            pJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pJugadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cNombreJu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pJugadoresLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cCamisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pJugadoresLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pRegistrar.add(pJugadores);
        pJugadores.setBounds(50, 110, 470, 160);

        pJugadoresE.setBackground(new java.awt.Color(255, 255, 255));
        pJugadoresE.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Jugadores"));
        pJugadoresE.setAutoscrolls(true);

        cIdEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cIdEliActionPerformed(evt);
            }
        });
        cIdEli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cIdEliKeyTyped(evt);
            }
        });

        jLabel25.setText("INTRODUZCA EL NUMERO DE CAMISA");

        bMostrar1.setText("Mostrar");
        bMostrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrar1ActionPerformed(evt);
            }
        });

        cEliminar.setText("Eliminar");
        cEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pJugadoresELayout = new javax.swing.GroupLayout(pJugadoresE);
        pJugadoresE.setLayout(pJugadoresELayout);
        pJugadoresELayout.setHorizontalGroup(
            pJugadoresELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pJugadoresELayout.createSequentialGroup()
                .addGroup(pJugadoresELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pJugadoresELayout.createSequentialGroup()
                        .addGroup(pJugadoresELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pJugadoresELayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(cEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pJugadoresELayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(cIdEli, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(173, 173, 173)
                        .addComponent(bMostrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pJugadoresELayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pJugadoresELayout.setVerticalGroup(
            pJugadoresELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pJugadoresELayout.createSequentialGroup()
                .addGroup(pJugadoresELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pJugadoresELayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(bMostrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pJugadoresELayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cIdEli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pRegistrar.add(pJugadoresE);
        pJugadoresE.setBounds(530, 110, 270, 130);

        jTabbedPane1.addTab("REGISTRAR", pRegistrar);

        pEditar.setBackground(new java.awt.Color(255, 255, 255));
        pEditar.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("TOTAL DE EQUIPOS REGISTRADOS");
        pEditar.add(jLabel1);
        jLabel1.setBounds(40, 10, 390, 22);

        bGrafica.setText("Mostrar Grafica");
        bGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGraficaActionPerformed(evt);
            }
        });
        pEditar.add(bGrafica);
        bGrafica.setBounds(400, 60, 130, 35);

        pPlantilla1.setBackground(new java.awt.Color(255, 255, 255));
        pPlantilla1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Metodos"));
        pPlantilla1.setAutoscrolls(true);

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
        jScrollPane4.setViewportView(jEquipo);

        javax.swing.GroupLayout pPlantilla1Layout = new javax.swing.GroupLayout(pPlantilla1);
        pPlantilla1.setLayout(pPlantilla1Layout);
        pPlantilla1Layout.setHorizontalGroup(
            pPlantilla1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPlantilla1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        pPlantilla1Layout.setVerticalGroup(
            pPlantilla1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPlantilla1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pEditar.add(pPlantilla1);
        pPlantilla1.setBounds(40, 140, 520, 290);

        bPos.setText("PosOrden");
        bPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPosActionPerformed(evt);
            }
        });
        pEditar.add(bPos);
        bPos.setBounds(280, 60, 100, 35);

        bPre.setText("PreOrden");
        bPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPreActionPerformed(evt);
            }
        });
        pEditar.add(bPre);
        bPre.setBounds(40, 60, 100, 35);

        bIn.setText("InOrden");
        bIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInActionPerformed(evt);
            }
        });
        pEditar.add(bIn);
        bIn.setBounds(160, 60, 100, 35);

        jTabbedPane1.addTab("EQUIPOS", pEditar);

        add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 880, 590);
    }// </editor-fold>//GEN-END:initComponents

    private void cNombreEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNombreEKeyTyped

    }//GEN-LAST:event_cNombreEKeyTyped

    private void cNombreJuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNombreJuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNombreJuActionPerformed

    private void cNombreJuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNombreJuKeyTyped

    }//GEN-LAST:event_cNombreJuKeyTyped

    private void cCamisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCamisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cCamisaActionPerformed

    private void cCamisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cCamisaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cCamisaKeyTyped

    private void cNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNivelActionPerformed

    private void cNivelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNivelKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cNivelKeyTyped
    public void limpiar() {
        cPrecio.setText("");
        cNombreJu.setText("");
        cCamisa.setText("");
        cNivel.setText("");

    }
    private void bAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarActionPerformed
        this.equipoCon.agregarLD( cNombreJu.getText(), Integer.parseInt(cCamisa.getText()), Integer.parseInt(cNivel.getText()),Integer.parseInt(cPrecio.getText()));
        this.limpiar();
    }//GEN-LAST:event_bAgregarActionPerformed

    private void bMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrarActionPerformed
//        this.equipoCon.mostrar();
        this.equipoCon.LlenarTablaLD(model, jJugador);

    }//GEN-LAST:event_bMostrarActionPerformed

    private void cIdEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cIdEliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdEliActionPerformed

    private void cIdEliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cIdEliKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdEliKeyTyped

    private void bMostrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrar1ActionPerformed

    }//GEN-LAST:event_bMostrar1ActionPerformed


    private void cEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cEliminarActionPerformed
        this.equipoCon.EliminarLD(Integer.parseInt(cIdEli.getText()));
        this.equipoCon.LlenarTablaLD(model, jJugador);
    }//GEN-LAST:event_cEliminarActionPerformed

    private void cIdEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cIdEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdEquipoActionPerformed

    private void cIdEquipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cIdEquipoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdEquipoKeyTyped

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        try {
            this.cIdEquipo.setText(Integer.toString(equipoCon.idEquipo()));
            this.equipoCon.RegistrarEquipo(cNombreE);
            this.equipoCon.RegistrarJugador(cIdEquipo);
        } catch (SQLException ex) {

        }

    }//GEN-LAST:event_bGuardarActionPerformed

    private void bGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGraficaActionPerformed

        equipoCon.graficar();
    }//GEN-LAST:event_bGraficaActionPerformed

    private void bPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPosActionPerformed
        equipoCon.PostOrdern.clear();
        equipoCon.MostrarPostOrden();
        equipoCon.TablaPost(model, jEquipo);
    }//GEN-LAST:event_bPosActionPerformed

    private void bPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPreActionPerformed
        equipoCon.preOrdern.clear();
        equipoCon.MostrarPreOrden();
        equipoCon.TablaPre(model, jEquipo);

    }//GEN-LAST:event_bPreActionPerformed

    private void bInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInActionPerformed
        equipoCon.InOrdern.clear();
        equipoCon.MostrarInOrden();
        equipoCon.TablaIn(model, jEquipo);
    }//GEN-LAST:event_bInActionPerformed

    private void cPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cPrecioActionPerformed

    private void cPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cPrecioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cPrecioKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private PaginaPrincipal.RSButtonMetro bAgregar;
    private PaginaPrincipal.RSButtonMetro bGrafica;
    private PaginaPrincipal.RSButtonMetro bGuardar;
    private PaginaPrincipal.RSButtonMetro bIn;
    private PaginaPrincipal.RSButtonMetro bMostrar;
    private PaginaPrincipal.RSButtonMetro bMostrar1;
    private PaginaPrincipal.RSButtonMetro bPos;
    private PaginaPrincipal.RSButtonMetro bPre;
    private javax.swing.ButtonGroup bgGenero;
    private javax.swing.JTextField cCamisa;
    private PaginaPrincipal.RSButtonMetro cEliminar;
    private javax.swing.JTextField cIdEli;
    private javax.swing.JTextField cIdEquipo;
    private javax.swing.JTextField cNivel;
    private javax.swing.JTextField cNombreE;
    private javax.swing.JTextField cNombreJu;
    private javax.swing.JTextField cPrecio;
    private javax.swing.JTable jEquipo;
    private javax.swing.JTable jJugador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pDatos;
    private javax.swing.JPanel pEditar;
    private javax.swing.JPanel pJugadores;
    private javax.swing.JPanel pJugadoresE;
    private javax.swing.JPanel pPlantilla;
    private javax.swing.JPanel pPlantilla1;
    private javax.swing.JPanel pRegistrar;
    // End of variables declaration//GEN-END:variables
}
