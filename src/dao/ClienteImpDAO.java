package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import modelo.Cliente;


public class ClienteImpDAO implements ClienteDAO {

    Connection conexion;
    PreparedStatement stInsertar;
    PreparedStatement stConsultar;
    PreparedStatement stActualizar;
    PreparedStatement stEliminar;
   
    
    public ClienteImpDAO(){
          
       try{
               
           Class.forName("com.mysql.cj.jdbc.Driver");
       
       }catch(ClassNotFoundException ex){
           System.out.println("Error al cargar el Driver");
           System.out.println(ex.getMessage());
       }
     
    }
 
       
    
    @Override
    public void abrirConexion() {
        try { 
            conexion = DriverManager.getConnection(
                 "jdbc:mysql://127.0.0.1/proyectotienda?serverTimezone=GMT-5",
                 "root",
                 "");
            
            
             stInsertar = conexion.prepareStatement(
                    "INSERT INTO Cliente VALUES (?,?,?,?,?)");
            
             stConsultar = conexion.prepareStatement(
                    "SELECT * FROM Cliente WHERE telefono=?");
             
             stActualizar = conexion.prepareStatement(
                            "UPDATE Cliente set Edad=?, Telefono=?,"
                                    + " Email=?, Plataforma=? WHERE"
                                    + " telefono=?");
           
             stEliminar = conexion.prepareStatement(
                            "DELETE FROM Cliente WHERE telefono=?");
             
             
        }catch(SQLException ex) {
            System.out.println("¡ERROR! no se logró la conexión a la base de datos, motivo: ");
            System.out.println(ex.getMessage());
       } 
    }
    
    
    @Override
    public void cerrarConexion() {
        try{
            conexion.close();
        }catch(SQLException ex) {
            System.out.println("¡ERROR! no se logró la desconexión a la base de datos, motivo: ");
            System.out.println(ex.getMessage());
       }
    }

    
    
    
    
    @Override
    public void insertarCliente(Cliente ObjCliente) {
    
        try{
            stInsertar.setString(1, ObjCliente.getNombre());
            stInsertar.setInt(2, ObjCliente.getEdad());
             stInsertar.setString(3, ObjCliente.getTelefono());
            stInsertar.setString(4, ObjCliente.getEmail());
            stInsertar.setString(5, ObjCliente.getPlataforma());
            
            
            stInsertar.executeUpdate();
            
        }catch(SQLException ex) {
            System.out.println("¡ERROR! no se logró el agregar al cliente a la base de datos, motivo:");    
            System.out.println(ex.getMessage());
        }
        
        
    }
  
   
    @Override
    public Cliente consultarCliente(String telefono) {
    
        Cliente ObjCliente = null;
        ResultSet rs = null;
        
        try{
            stConsultar.setString(1, telefono);
            rs = stConsultar.executeQuery();
            
            if( rs.next() ){
                ObjCliente = new Cliente();
                ObjCliente.setNombre(  rs.getString("nombre") );
                ObjCliente.setEdad(rs.getInt("edad"));
                ObjCliente.setEmail( rs.getString("email"));
                ObjCliente.setTelefono( rs.getString("telefono"));
                ObjCliente.setPlataforma( rs.getString("plataforma"));
             }
            
            
        }catch(SQLException ex) {
            System.out.println("¡ERROR! el cliente no se encuentra en la base de datos, motivo: ");
            System.out.println(ex.getMessage());
        }
        return ObjCliente;
    }
    
    
    
    

    @Override
    public void eliminarCliente(String telefono) { 
       try{ 
        
           stEliminar.setString(1, telefono);
           stEliminar.executeUpdate();
       }catch(SQLException ex){
           System.out.println("¡ERROR! al Eliminar al cliente, motivo: ");
           System.out.println(ex.getMessage());
       }
             
    }

    @Override
    public void actualizarCliente(Cliente ObjCliente) {
         
        try{
            stActualizar.setInt(1, ObjCliente.getEdad());
            stActualizar.setString(2, ObjCliente.getTelefono());
            stActualizar.setString(3, ObjCliente.getEmail());
            stActualizar.setString(4, ObjCliente.getPlataforma());
            stActualizar.executeUpdate();
            
        }catch(SQLException ex){
            System.out.println("Error al Actualizar al cliente, motivo: ");
            System.out.println(ex.getMessage());
        }
       
    }
   
}
