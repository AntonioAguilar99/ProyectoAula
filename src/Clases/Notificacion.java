/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author anton
 */
public class Notificacion {
        public static void enviarNotificacion(String mensaje, Usuario usuario) {
        System.out.println("Enviando notificación a " + usuario.getCorreo() + ": " + mensaje);
    }
}
