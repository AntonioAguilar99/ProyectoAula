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
public class Paciente extends Usuario {
    private String historialClinico;
    private List<Cita> citas;

    public Paciente(String id, String nombre, String correo, String contrasena) {
        super(id, nombre, correo, contrasena);
        this.citas = new ArrayList<>();
    }

    // Getter para historialClinico
    public String getHistorialClinico() {
        return historialClinico;
    }

    // Setter para historialClinico
    public void setHistorialClinico(String historialClinico) {
        this.historialClinico = historialClinico;
    }

    // Getter para citas
    public List<Cita> getCitas() {
        return citas;
    }

    // Setter para citas
    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    // Método para solicitar una cita
    public void solicitarCita(Cita cita) {
        citas.add(cita);
    }
}

