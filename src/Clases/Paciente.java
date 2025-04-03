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
public class Paciente extends Usuario{
    
      private String historialClinico;
    private List<Cita> citas;
    
    public Paciente(String id, String nombre, String correo, String contrasena) {
        super(id, nombre, correo, contrasena);
        this.citas = new ArrayList<>();
    }
    
    public void solicitarCita(Cita cita) {
        citas.add(cita);
    }
    
}
