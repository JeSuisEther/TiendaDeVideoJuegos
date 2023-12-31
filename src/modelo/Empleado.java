package modelo;


public class Empleado extends Persona{
    private int cantHoras;
    private double pagoHora;
    private double salario;

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    public double getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void calcularSalario() {
        setSalario (getCantHoras() * getPagoHora());
    }
    
    
    public void modificarCliente(Cliente ObjCliente, int Edad,
                                            String Telefono,
                                            String Email, String Plataforma) {
        
        ObjCliente.setEdad(Edad);
        ObjCliente.setTelefono(Telefono);
        ObjCliente.setEmail(Email);
        ObjCliente.setPlataforma(Plataforma);
    }
    
    
    @Override
    public String mostrarInfo() {
        String info = super.mostrarInfo();
               info+= "Horas trabajadas :" + getCantHoras() + "\n" +
                      "Pago x hora :" + getPagoHora() + "\n" +
                      "Salario :" + getSalario() + "\n";
        return info;
    }
}
