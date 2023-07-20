/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Modelos.Cliente;
import Modelos.DAO;
import Modelos.DataBase;
import Modelos.Empleado;
import Modelos.Movimientos;
import Modelos.Producto;
import Modelos.Usuarios;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Roberto Marroquín
 */
public class Ventana_Pedidos2 extends javax.swing.JFrame {
    
     DataBase a = new DataBase();
    DAO dao = new DAO();
    Producto prod = new Producto();
    Empleado emp = new Empleado();
    Cliente cli = new Cliente();
    Movimientos mov = new Movimientos();
    Usuarios us = new Usuarios();
    
    String [] columnas ={"ID","Cliente","Vendedor","Fecha","Monto","Detalle"};
    ArrayList<Object[]> datos = new ArrayList<>();
    DefaultTableModel modelo = new DefaultTableModel(columnas,0);


    /**
     * Creates new form Ventana_Pedidos2
     */
    public Ventana_Pedidos2() {
        initComponents();
        this.setResizable(false);
        cargar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtClientenombre = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        txtClientedui = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableMovimientos = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btn_Realizarpedido = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        btn_Limpiartxt = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTelefonoEmpleado = new javax.swing.JTextField();
        txtNombreEmpleado = new javax.swing.JTextField();
        txtFecha = new com.toedter.calendar.JDateChooser();
        txtDetalle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtExistencias = new javax.swing.JTextField();
        btn_Logout1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PEDIDOS-EMPLEADO");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));
        jPanel3.setPreferredSize(new java.awt.Dimension(783, 5));
        jPanel3.setLayout(new javax.swing.OverlayLayout(jPanel3));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 20, 1081, -1));

        jPanel4.setBackground(new java.awt.Color(0, 102, 153));
        jPanel4.setPreferredSize(new java.awt.Dimension(5, 546));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 88, -1, 535));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DATOS DEL CLIENTE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 43, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DATOS DEL EMLPEADO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 43, 169, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DETALLE DE LA VENTA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("CANTIDAD");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(916, 208, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("PRODUCTO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 208, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("PRECIO $");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 208, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("DUI");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 81, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("NOMBRE");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 81, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("NOMBRE");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 81, -1, -1));

        txtClientenombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtClientenombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClientenombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtClientenombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 118, 205, -1));

        txtProducto.setEditable(false);
        txtProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });
        jPanel1.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 238, 291, -1));

        txtClientedui.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtClientedui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteduiActionPerformed(evt);
            }
        });
        txtClientedui.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClienteduiKeyTyped(evt);
            }
        });
        jPanel1.add(txtClientedui, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 118, 182, -1));

        txtPrecio.setEditable(false);
        txtPrecio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 238, 74, -1));

        txtCantidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 238, 74, -1));

        TableMovimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TableMovimientos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 428, 1058, 200));

        jPanel5.setBackground(new java.awt.Color(0, 102, 153));
        jPanel5.setPreferredSize(new java.awt.Dimension(783, 5));
        jPanel5.setLayout(new javax.swing.OverlayLayout(jPanel5));
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 417, 1058, -1));

        btn_Realizarpedido.setBackground(new java.awt.Color(51, 51, 51));
        btn_Realizarpedido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Realizarpedido.setForeground(new java.awt.Color(255, 255, 255));
        btn_Realizarpedido.setText("GUARDAR");
        btn_Realizarpedido.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 204, 255)));
        btn_Realizarpedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RealizarpedidoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Realizarpedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(773, 303, 162, 47));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("FECHA");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(924, 81, -1, -1));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setPreferredSize(new java.awt.Dimension(783, 3));
        jPanel6.setLayout(new javax.swing.OverlayLayout(jPanel6));
        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 167, 1046, -1));

        btnAtras.setBackground(new java.awt.Color(51, 51, 51));
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("ATRAS");
        btnAtras.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 102, 0)));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, 77, -1));

        btn_Limpiartxt.setBackground(new java.awt.Color(51, 51, 51));
        btn_Limpiartxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Limpiartxt.setForeground(new java.awt.Color(255, 255, 255));
        btn_Limpiartxt.setText("LIMPIAR");
        btn_Limpiartxt.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 0, 0)));
        btn_Limpiartxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiartxtActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Limpiartxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(975, 303, 129, 47));

        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Cerrar sesion");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(984, 35, -1, -1));

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("TELEFONO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 81, -1, 19));

        txtTelefonoEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoEmpleadoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefonoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 119, 110, 30));

        txtNombreEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEmpleadoKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 119, 120, 28));

        txtFecha.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(914, 119, 141, 30));

        txtDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDetalleActionPerformed(evt);
            }
        });
        jPanel1.add(txtDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 308, 291, 26));

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("DETALLE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 278, -1, 20));

        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("ID");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 208, -1, -1));

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 238, 90, 26));

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 238, -1, 26));

        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("EXISTENCIAS");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, -1, 20));

        txtExistencias.setEditable(false);
        txtExistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExistenciasActionPerformed(evt);
            }
        });
        jPanel1.add(txtExistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 243, 70, -1));

        btn_Logout1.setBackground(new java.awt.Color(51, 51, 51));
        btn_Logout1.setForeground(new java.awt.Color(255, 255, 255));
        btn_Logout1.setText("LOGOUT");
        btn_Logout1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 102, 0)));
        btn_Logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Logout1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1052, 33, 77, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtClientenombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClientenombreKeyTyped

        char c  = evt.getKeyChar();

        if((c<'a' || c>'z')&&(c<'A' || c>'Z')) evt.consume();

    }//GEN-LAST:event_txtClientenombreKeyTyped

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed

    private void txtClienteduiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteduiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteduiActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char c  = evt.getKeyChar();

        if(c<'0' || c>'9') evt.consume();

    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped

        char c  = evt.getKeyChar();

        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtCantidadKeyTyped
 public void cargar(){
        modelo.setRowCount(0);
        datos = dao.consultar();
        
        for(Object[] obj : datos){
                
            modelo.addRow(obj);
            
        }
        this.TableMovimientos.setModel(modelo);
    }
  
     public void clean(){
        this.txtCantidad.setText("");
        this.txtClientedui.setText("");
        this.txtClientenombre.setText("");
        this.txtNombreEmpleado.setText("");
        this.txtPrecio.setText("");
        this.txtProducto.setText("");
        this.txtTelefonoEmpleado.setText("");
        this.txtDetalle.setText("");
        this.txtId.setText("");
        this.txtExistencias.setText("");
        
    }
    
    
    
    //METODO PARA VALIDAR TXT VACIOS
    public boolean validarTxt(){
        boolean estado = true;
        String mensaje = "INGRESAR LOS SIGUIENTES DATOS:\n";
        if(txtClientenombre.getText().isEmpty()){
            estado = false;
            mensaje += "> NOMBRE DE CLIENTE\n";    
        }
        if(txtClientedui.getText().isEmpty()){
            estado = false;
            mensaje += "> DUI\n";    
        }
       /* if(txtEmpleado.getText().isEmpty()){
            estado = false;
            mensaje += "> NOMBRE DE VENDEDOR\n";    
        }*/
        if(txtCantidad.getText().isEmpty()){
            estado = false;
            mensaje += "> CANTIDAD\n";    
        }
        /*if(txt_Codigo.getText().isEmpty()){
            estado = false;
            mensaje += "> CODIGO\n";    
        }*/
        if(txtPrecio.getText().isEmpty()){
            estado = false;
            mensaje += "> PRECIO $\n";    
        }
        /*if(txt_Efectivo.getText().isEmpty()){
            estado = false;
            mensaje += "> EFECTIVO $\n";    
        }*/
        if(!estado){
            JOptionPane.showMessageDialog(null,mensaje,"::===> NO HAY REGISTROS <===::",JOptionPane.ERROR_MESSAGE);
        }
        return estado;
    }
    
    private void btn_RealizarpedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RealizarpedidoActionPerformed

        if( validarTxt()){
            String c;

            dao.actualizarProd(Integer.parseInt(this.txtExistencias.getText()),Integer.parseInt(this.txtCantidad.getText()), Integer.parseInt(this.txtId.getText()));

            cli.setNombreCli(this.txtClientenombre.getText());
            cli.setDui(this.txtClientedui.getText());

            dao.agregarCli(cli);

            //guardar en la tabla empleado
            emp.setNombreEmpleado(this.txtNombreEmpleado.getText());
            //emp.setDui(this.txtClientedui.getText());
            emp.setTelefono(Integer.parseInt(this.txtTelefonoEmpleado.getText()));

            dao.agregarEmpleado(emp);

            //guardar en la tabla movimientos
            mov.setNombreCliente(this.txtClientenombre.getText());
            mov.setNombreVendedor(this.txtNombreEmpleado.getText());

            String fecha = ((JTextField)this.txtFecha.getDateEditor().getUiComponent()).getText();
            mov.setFecha(Date.valueOf(fecha));

            float dv,te;
            float cantidad, precio;

            cantidad = Float.parseFloat(this.txtCantidad.getText());
            precio = Float.parseFloat(this.txtPrecio.getText());

            dv = cantidad*precio;
            mov.setMontoTotal(dv);
            mov.setDetalleVenta(this.txtDetalle.getText());

            dao.agregarMovimientos(mov);

            clean();
            cargar();

        }

    }//GEN-LAST:event_btn_RealizarpedidoActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed

        MenuEmpleado bck = new MenuEmpleado();
        bck.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btn_LimpiartxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiartxtActionPerformed
        //metodo para limpiar cuadros txt
        clean();
    }//GEN-LAST:event_btn_LimpiartxtActionPerformed

    private void txtTelefonoEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoEmpleadoKeyTyped
        char c  = evt.getKeyChar();

        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtTelefonoEmpleadoKeyTyped

    private void txtNombreEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEmpleadoKeyTyped

        char c  = evt.getKeyChar();

    }//GEN-LAST:event_txtNombreEmpleadoKeyTyped

    private void txtDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDetalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDetalleActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        char c  = evt.getKeyChar();

    }//GEN-LAST:event_txtIdKeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        Producto pr = new Producto();
        pr.setId(Integer.parseInt(this.txtId.getText()));
        try{
            if(dao.seleccionarProd(pr)){

                this.txtProducto.setText(dao.nom);
                this.txtPrecio.setText(String.valueOf(dao.precio));
                this.txtExistencias.setText(String.valueOf(dao.cant));

            }else{

                JOptionPane.showMessageDialog(null,"Error, el producto no existe");

            }

        }catch(SQLException ex){

            JOptionPane.showMessageDialog(null,"Error, el producto no existe"+ ex);

        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtExistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExistenciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExistenciasActionPerformed

    private void btn_Logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Logout1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Logout1ActionPerformed

    private void txtClienteduiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteduiKeyTyped
        char c  = evt.getKeyChar();

        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtClienteduiKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_Pedidos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Pedidos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Pedidos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Pedidos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Pedidos2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableMovimientos;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btn_Limpiartxt;
    private javax.swing.JButton btn_Logout1;
    private javax.swing.JButton btn_Realizarpedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtClientedui;
    private javax.swing.JTextField txtClientenombre;
    private javax.swing.JTextField txtDetalle;
    private javax.swing.JTextField txtExistencias;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtTelefonoEmpleado;
    // End of variables declaration//GEN-END:variables
}