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
public class Doctor extends Usuario {
    private String especialidad;
    private List<Cita> citasAsignadas;

    public Doctor(String id, String nombre, String correo, String contrasena, String especialidad) {
        super(id, nombre, correo, contrasena);
        this.especialidad = especialidad;
        this.citasAsignadas = new ArrayList<>();
    }

    // Getter para especialidad
    public String getEspecialidad() {
        return especialidad;
    }

    // Setter para especialidad
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Getter para citasAsignadas
    public List<Cita> getCitasAsignadas() {
        return citasAsignadas;
    }

    // Setter para citasAsignadas
    public void setCitasAsignadas(List<Cita> citasAsignadas) {
        this.citasAsignadas = citasAsignadas;
    }

    // Método para asignar una cita
    public void asignarCita(Cita cita) {
        citasAsignadas.add(cita);
    }
}
