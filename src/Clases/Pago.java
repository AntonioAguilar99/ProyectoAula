/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author anton
 */
public class Pago {
    private String idPago;
    private String metodo;
    private double monto;
    
    public Pago(String idPago, String metodo, double monto) {
        this.idPago = idPago;
        this.metodo = metodo;
        this.monto = monto;
    } 
}
