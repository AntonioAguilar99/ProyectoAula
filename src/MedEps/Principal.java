

package MedEps;

import MedEps.Infraestructura.Config.Bd.ConexionBd;

/**
 *
 * @author Antonio Aguilar
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("Prueba del proyecto");
        ConexionBd.conectar();
        ConexionBd.desconectar();
    }
}
