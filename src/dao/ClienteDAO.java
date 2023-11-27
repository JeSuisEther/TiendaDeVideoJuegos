
package dao;

import modelo.Cliente;

public interface ClienteDAO {
    
    public void abrirConexion();
    public void cerrarConexion();
    public void insertarCliente(Cliente ObjCliente);
    public Cliente consultarCliente(String telefono);
    public void eliminarCliente(String telefono);
    public void actualizarCliente(Cliente ObjCliente);

}
