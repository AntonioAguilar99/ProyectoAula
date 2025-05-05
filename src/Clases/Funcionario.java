/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author anton
 */
import java.util.List;

public class Funcionario extends Persona {

    // Métodos específicos
    public List<Afiliado> verAfiliados() {
        // Retornar la lista de afiliados gestionados por el funcionario
        return null;
    }

    public List<Cita> verCitas() {
        // Retornar la lista de citas gestionadas por el funcionario
        return null;
    }

    public HistorialMedico verHistorial(Afiliado afiliado) {
        // Retornar el historial médico de un afiliado
        return null;
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

