/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author anton
 */
import java.util.Date;

public class Cita {
    private int id;
    private Date fecha;
    private String motivo;
    private String estado; // Ej: Agendada, Cancelada, Realizada
    private Afiliado afiliado;
    private Doctor doctor;

    // Métodos
    public void agendar() {
        // Lógica para agendar la cita
    }

    public void cancelar() {
        // Lógica para cancelar la cita
    }

    public void modificar(Date nuevaFecha, String nuevoMotivo) {
        // Lógica para modificar la cita
        this.fecha = nuevaFecha;
        this.motivo = nuevoMotivo;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Afiliado getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(Afiliado afiliado) {
        this.afiliado = afiliado;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}

