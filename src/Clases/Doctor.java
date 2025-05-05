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
import java.util.List;
import java.util.Date;

public class Doctor extends Persona {
    private String especialidad;

    // Métodos específicos
    public List<Cita> verCitas() {
        // Retornar la lista de citas del doctor
        return null;
    }

    public boolean estaDisponible(Date fecha) {
        // Verificar si el doctor está disponible en la fecha indicada
        return false;
    }

    // Getters y Setters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void registrarse() {
        // Implementación del método de registro
    }

    @Override
    public boolean iniciarSesion() {
        // Implementación del inicio de sesión
        return false;
    }
}
