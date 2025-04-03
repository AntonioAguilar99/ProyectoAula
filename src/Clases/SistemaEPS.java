/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anton
 */
public class SistemaEPS {
    private List<Usuario> usuarios;
    private List<Cita> citas;
    
    public SistemaEPS() {
        this.usuarios = new ArrayList<>();
        this.citas = new ArrayList<>();
    }
    
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    } 
}
