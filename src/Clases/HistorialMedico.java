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
import java.util.ArrayList;

public class HistorialMedico {
    private int id;
    private Afiliado afiliado;
    private List<String> consultas;
    private List<String> tratamientos;

    // Constructor
    public HistorialMedico(Afiliado afiliado) {
        this.afiliado = afiliado;
        this.consultas = new ArrayList<>();
        this.tratamientos = new ArrayList<>();
    }

    // Métodos
    public void agregarConsulta(String consulta) {
        consultas.add(consulta);
    }

    public List<String> verHistorial() {
        return consultas;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Afiliado getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(Afiliado afiliado) {
        this.afiliado = afiliado;
    }

    public List<String> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<String> consultas) {
        this.consultas = consultas;
    }

    public List<String> getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(List<String> tratamientos) {
        this.tratamientos = tratamientos;
    }
}

