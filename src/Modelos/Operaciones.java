/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Roberto Marroquín
 */
public interface Operaciones {
    
   public boolean agregarCli(Object obj);
   public boolean agregarEmpleado(Object obj);
   public boolean agregarMovimientos(Object obj);
   public ArrayList<Object []> consultar();  
   public boolean seleccionarProd(Producto pr)throws SQLException;
   public boolean actualizarProd(int exis,int cant,int id);
   public boolean registroUsuarios(Object obj);
    
}
