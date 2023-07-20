/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Roberto Marroquín
 */
public class DAO implements Operaciones{
    
    DataBase db = new DataBase();
    Producto prod = new Producto();
    Empleado emp = new Empleado();
    Cliente cli = new Cliente();
    Usuarios user = new Usuarios();
    Movimientos mov = new Movimientos();

    public String nom ;
    public float precio ;
    public int cant ;
 
    String sql="";

    @Override
    public boolean agregarCli(Object obj) {
        cli = (Cliente) obj;
        this.sql = "insert into clientes (nombreCliente,dui) values (?,?);";
        
        Connection conn;
        PreparedStatement ps;
        
        try{
            
            Class.forName(db.getDriver());
           
           conn=  DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPassword());
           
           ps = conn.prepareStatement(this.sql);
           
           ps.setString(1, cli.getNombreCli());
           ps.setString(2, cli.getDui());
           

           int fila = ps.executeUpdate();
           
           if(fila > 0){
               conn.close();

               return true;
           }else{
               return false;
           }
           
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        } 
    }

    @Override
    public boolean agregarEmpleado(Object obj) {
        
         emp = (Empleado) obj;
        this.sql = "insert into empleados (nombreEmpleado,telefono) values (?,?);";
        
        Connection conn;
        PreparedStatement ps;
        
        try{
            
            Class.forName(db.getDriver());
           
           conn=  DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPassword());
           
           ps = conn.prepareStatement(this.sql);
           
           ps.setString(1, emp.getNombreEmpleado());
           
           ps.setInt(2, emp.getTelefono());

           int fila = ps.executeUpdate();
           
           if(fila > 0){
               conn.close();

               return true;
           }else{
               return false;
           }
        }catch (ClassNotFoundException | SQLException ex) {
            return false;
        } 
        
    }
    
   
    
     static Connection contacto = null;
    
    public static Connection getConexion(){
        
        String url ="jdbc:mysql://localhost:3306/proyectofinal";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e){
            
         JOptionPane.showMessageDialog(null,"no se puede establecer coneccion"+ e);
        }
        try
        {
            contacto = DriverManager.getConnection(url,"root","");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"no se puede establecer coneccion"+ e);
        }
        return contacto;
    }

    @Override
    public boolean agregarMovimientos(Object obj) {
        mov = (Movimientos) obj;
        this.sql = "insert into movimiento(nombreCliente,nombreVendedor,fechaVenta,montoTotal,detalleVenta) values (?,?,?,?,?);";
        
        Connection conn;
        PreparedStatement ps;
        
        try{
            
           Class.forName(db.getDriver());
           
           conn=  DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPassword());
           
           ps = conn.prepareStatement(this.sql);
           
           ps.setString(1, mov.getNombreCliente());
           ps.setString(2, mov.getNombreVendedor());
           ps.setDate(3,  mov.getFecha());
           ps.setFloat(4, mov.getMontoTotal());
           ps.setString(5, mov.getDetalleVenta());

           int fila = ps.executeUpdate();
           
           if(fila > 0){
               conn.close();
               JOptionPane.showMessageDialog(null,"EL REGISTRO ESTA GUARDADO CORRECTAMENTE! ","GUARDADO",JOptionPane.INFORMATION_MESSAGE);

               return true;
           }else{
               return false;
           }
           
        } catch (ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null," : "+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
            return false;
        } 
    }

    @Override
    public ArrayList<Object[]> consultar() {

     this.sql = "select * from movimiento;";
     
     Connection conn;
     PreparedStatement ps;
     ResultSet rs;
     ResultSetMetaData meta;
     
     ArrayList<Object []> datos = new ArrayList<>();

     try{
         
         Class.forName(db.getDriver());
           
          conn=  DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPassword());
           
          ps = conn.prepareStatement(this.sql);
          rs = ps.executeQuery();
          
          
          
          meta = rs.getMetaData();
          
          while(rs.next()){
              Object[] fila = new Object[meta.getColumnCount()];
              for(int i = 0; i<fila.length;i++){
                  fila[i] = rs.getObject(i+1);
              }
              datos.add(fila);
          }
          
          
     }  catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
     return datos;
    }

 

    @Override
    public boolean seleccionarProd(Producto pr) throws SQLException {
        Connection conn;
        PreparedStatement ps;
        ResultSet rs;
     
        
        this.sql = "select nombreProducto,precioProducto,Stock from producto where id ='"+pr.getId()+"'";

        
        try {
            Class.forName(db.getDriver());
           
           conn=  DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPassword());
           
           ps = conn.prepareStatement(this.sql);
           
           
            rs = ps.executeQuery();
            
            if(rs.next()){
                pr.setNombreProd(rs.getString("nombreProducto"));
                pr.setPrecioProd(rs.getFloat("precioProducto"));
                pr.setStock(rs.getInt("Stock"));
                
                this.nom = pr.getNombreProd();
                this.precio = pr.getPrecioProd();
                this.cant = pr.getStock();
                 return true;
            }else{
                
                return false;
            }
                
       
        }catch (ClassNotFoundException  | SQLException ex) {
            
            return false;
        } 
        
    }

    @Override
    public boolean actualizarProd(int exis, int cant,int id) {
        
    PreparedStatement ps;
    Connection conn;
    int rs,rest;
    
   rest= exis-cant;
        
    this.sql= "Update producto set Stock = '"+(rest)+"'where id='"+id+"';";
            
    try{
                
        Class.forName(db.getDriver());
           
        conn=  DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPassword());
         
        ps = conn.prepareStatement(this.sql);       
        rs= ps.executeUpdate(this.sql);
        
        if(rest>0){
            
        if(rs>0){
            System.out.println("Actualizado");
            return true;
        }else{
            System.out.println("Error");
            return false;  
        }
            
        }else{
            JOptionPane.showMessageDialog(null, "Productos agotados");
            return false;
        }
        
                
        }catch( ClassNotFoundException | SQLException ex){

            System.out.println("Error: "+ex);
            return false;
        }    
    
    }

    @Override
    public boolean registroUsuarios(Object obj) {
        user = (Usuarios) obj;
        this.sql = "insert into usuarios (nombreUsuario,contraseña,tipoUsuario) values (?,?,?);";
        
        Connection conn;
        PreparedStatement ps;
        
        try{
            
            Class.forName(db.getDriver());
           
           conn=  DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPassword());
           
           ps = conn.prepareStatement(this.sql);
           
           ps.setString(1, user.getNombreUs());
           ps.setString(2, user.getPass());
           ps.setInt(3, user.getTipoUs());

           int fila = ps.executeUpdate();
           
           if(fila > 0){
               conn.close();
               JOptionPane.showMessageDialog(null,"USUARIO GUARDADO CORRECTAMENTE! ","GUARDADO",JOptionPane.INFORMATION_MESSAGE);

               return true;
           }else{
               return false;
           }
           
        } catch (ClassNotFoundException | SQLException e) {
            //JOptionPane.showMessageDialog(null,"NO PUEDE REPETIR CODIGO "+e,"ERROR",JOptionPane.ERROR_MESSAGE);
            return false;
        } 
    }
    
}
