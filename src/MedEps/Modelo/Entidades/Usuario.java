

package MedEps.Modelo.Entidades;

import MedEps.Modelo.Entidades.Enumeraciones.RolUsuarioEnum;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

/**
 *
 * @author Antonio Aguilar
 */
@Entity (name = "Usuarios")
  public class Usuario implements Serializable{
    @Id
    @Column(name = "Id", length = 36)
    protected String codigo;

    @Column(length = 40, nullable = false)
    protected String nombres;

    @Column(length = 50, nullable = false)
    protected String apellidos;

    @Column(length = 50, nullable = false)
    protected String tipoDocumento;

    @Column(length = 20, unique = true)
    protected String numeroDocumento;

    @Column(length = 100, unique = true)
    protected String correo;

    @Column(length = 15)
    protected String telefono;

    @Column(length = 70)
    protected String contrasena;
    
    @Enumerated(EnumType.STRING)
    @Column(length = 20, nullable = false)
    protected RolUsuarioEnum rol;
    
    //Constructor por defecto 
    
    public Usuario(){
        
    }
    
    //Constructor con parametros
    
    public Usuario (String id, String nombres, String apellidos, String tipoDocumento, String numeroDocumento, String correo, String telefono, String contraseña, RolUsuarioEnum rol){
        codigo = apellidos;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.correo = correo;
        this.telefono = telefono;
        this.contrasena = contraseña;
        this.rol = rol;
    }
    
    // Set y Get
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public String getCodigo(){
        return this.codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public RolUsuarioEnum getRol() {
        return rol;
    }

    public void setRol(RolUsuarioEnum rol) {
        this.rol = rol;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.codigo, other.codigo);
    }
    
}
