
package modelo;


public class Persona {

    private String nombre;
    private int edad;
    private String email;
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String mostrarInfo(){
        
        String info = "Nombre :" + getNombre() + "\n" +
                      "Edad :" + getEdad() + "\n" +
                      "Email :" + getEmail() + "\n" +
                      "Teléfono :" + getTelefono() + "\n";
        return info;
    }
    

    
}
