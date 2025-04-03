/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author anton
 */
public class Cita {
    private String idCita;
    private String fecha;
    private String motivo;
    private Paciente paciente;
    private Doctor doctor;
    
    public Cita(String idCita, String fecha, String motivo, Paciente paciente, Doctor doctor) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.motivo = motivo;
        this.paciente = paciente;
        this.doctor = doctor;
    } 
}
