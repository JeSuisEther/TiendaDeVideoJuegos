
package modelo;


public class Cliente extends Persona {

    private String Plataforma;

    public String getPlataforma() {
        return Plataforma;
    }

    public void setPlataforma(String Plataforma) {
        this.Plataforma = Plataforma;
    }
    

 
    @Override
    public String mostrarInfo() {
        
        String info = super.mostrarInfo();
               info+= "Plataforma:" + getPlataforma();
        return info;
    }
    
}
