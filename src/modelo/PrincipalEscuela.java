
package modelo;

import dao.ClienteImpDAO;

public class PrincipalEscuela {

    public static void main(String[] args) {
        Cliente objAl = new Cliente();
        Empleado objDoc = new Empleado();
        
        ClienteImpDAO objDao = new ClienteImpDAO();
        
        /*
        
        
        objAl.setNombre("Juan Perez");
        objAl.setEdad(20);
        objAl.setEmail("juan@gmail.com");
        objAl.setCodigo("12345");
        objAl.setCarrera("IDS");
        
        objDoc.setNombre("Pedro Lopez");
        objDoc.setEdad(35);
        objDoc.setEmail("pedro@gmail.com");
        objDoc.setCodigo("6789");
        objDoc.setCantHoras(20);
        objDoc.setPagoHora(200);
        
        System.out.println(objAl.mostrarInfo());
        System.out.println("------------------------");
        System.out.println(objDoc.mostrarInfo());
        
        objDoc.calcularSalario();
        objDoc.evaluarAlumno(objAl, 80, 100, 90);
        
        System.out.println(objAl.mostrarInfo());
        System.out.println("------------------------");
        System.out.println(objDoc.mostrarInfo());
        */
    }

    
}
