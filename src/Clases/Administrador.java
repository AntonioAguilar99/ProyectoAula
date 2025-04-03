/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author anton
 */
public class Administrador extends Usuario{
        public Administrador(String id, String nombre, String correo, String contrasena) {
        super(id, nombre, correo, contrasena);
    }
    
    public void gestionarUsuarios() {
        System.out.println("Gestionando usuarios...");
    }
}
