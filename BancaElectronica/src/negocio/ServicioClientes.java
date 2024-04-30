package negocio;

import java.util.ArrayList;
import java.util.Set;

public interface ServicioClientes {
    boolean agregarCliente(Cliente cliente);

    boolean eliminarCliente(int numero);

    Cliente consultaCliente(int numero);

    Set<Cliente> obtenerClientes();

    Cliente buscarClientePorRfc(String rfc);

    void listarClientes();
}
