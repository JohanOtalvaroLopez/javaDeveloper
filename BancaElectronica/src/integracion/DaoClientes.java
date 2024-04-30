package integracion;

import negocio.Cliente;
import negocio.ServicioClientes;

import java.util.Set;

public class DaoClientes implements ServicioClientes {

    @Override
    public boolean agregarCliente(Cliente cliente) {
        return false;
    }

    @Override
    public boolean eliminarCliente(int numero) {
        return false;
    }

    @Override
    public Cliente consultarCliente(int numero) {
        return null;
    }

    @Override
    public Set<Cliente> obtenerClientes() {
        return null;
    }

    @Override
    public Cliente buscarClientePorRfc(String rfc) {
        return null;
    }

    @Override
    public void listarClientes() {

    }
}
