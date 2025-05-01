/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Date;

/**
 *
 * @author anton
 */
public abstract class Usuario {
    protected String id;
    protected String nombre;
    protected String documento;
    protected String correo;
    protected String contraseña;
    protected String telefono;
    protected String apellidos;
    protected String tipoDocumento;
    protected String direccion;
    protected Date fechaNacimiento;
    protected String genero;
    protected boolean activo;

    
    public Usuario(String id, String nombre, String correo, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
    }
    
    public String getId() {
        return id; 
    }
    
    public String getNombre() {
        return nombre; 
    }
    
    public String getCorreo() {
        return correo; 
    }
    
    public String getContrasena() {
        return contraseña; 
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }
    
    public void setCorreo(String correo) {
        this.correo = correo; 
    }
    
    public void setContrasena(String contrasena) {
        this.contraseña = contrasena; 
    }

    public Object getNumeroDocumento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
