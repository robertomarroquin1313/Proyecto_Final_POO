/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Roberto Marroquín
 */
public class DataBase {
    
    
    private final String url;
    private final String driver;
    private final String user;
    private final String password;

    public DataBase(){
        
        this.url = "jdbc:mysql://localhost:3306/proyectofinal";
        this.driver = "com.mysql.jdbc.Driver";
        this.user = "root";
        this.password = "";
        
        
        
    }

    public String getUrl() {
        return url;
    }

    public String getDriver() {
        return driver;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
    
    
    
    
}
