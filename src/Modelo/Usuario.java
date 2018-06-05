/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author daniel
 */
public class Usuario {
    
    private int id;
    private String userName;
    private String Password;
    private String rol;

    public Usuario(int id, String userName, String Password, String rol) {
        this.id = id;
        this.userName = userName;
        this.Password = Password;
        this.rol = rol;
    }

    public Usuario() {
    }  

    public Usuario(String userName, String Password) {
        this.userName = userName;
        this.Password = Password;
    }
    
    

    public Usuario(String userName, String Password, String rol) {
        this.userName = userName;
        this.Password = Password;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
    
    
    
}
