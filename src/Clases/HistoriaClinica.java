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
public class HistoriaClinica {
    private String idHistoria;
    private Paciente paciente;
    private List<String> notas;
    
    public HistoriaClinica(String idHistoria, Paciente paciente) {
        this.idHistoria = idHistoria;
        this.paciente = paciente;
        this.notas = new ArrayList<>();
    }
    
    public void agregarNota(String nota) {
        notas.add(nota);
    }
}
