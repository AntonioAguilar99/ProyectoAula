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

public class Recepcionista extends Persona {

    // Métodos específicos
    public Cita registrarCita(Afiliado afiliado, Doctor doctor, Date fecha) {
        // Registrar una cita para el afiliado con el doctor en la fecha indicada
        return null;
    }

    public void cancelarCita(Cita cita) {
        // Cancelar la cita
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

