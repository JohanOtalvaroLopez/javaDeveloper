package integracion;

import negocio.Cliente;
import negocio.ServicioClientes;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class DaoClientes implements ServicioClientes {
    private String url;
    private String usuario;
    private String password;
    private DriverManager driver;
    private Connection conexion;
    private Statement sentencia;

    private String query;
    private ResultSet resultado;
    private int renglones;

    public DaoClientes() {
        url = "jdbc:mysql://localhost:3306/banca";
        usuario = "root";
        password = "abc123";

        try {
            conexion = DriverManager.getConnection(url, usuario, password);
            sentencia = conexion.createStatement();
            System.out.println("La conexion fue exitosa!!!");
        } catch (SQLException e) {
            System.out.println("Hubo un problema en la conexion con la BD " + e.getMessage());
        }

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DriverManager getDriver() {
        return driver;
    }

    public void setDriver(DriverManager driver) {
        this.driver = driver;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public Statement getSentecia() {
        return sentencia;
    }

    public void setSentecia(Statement sentencia) {
        this.sentencia = sentencia;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public ResultSet getResultado() {
        return resultado;
    }

    public void setResultado(ResultSet resultado) {
        this.resultado = resultado;
    }

    public int getRenglones() {
        return renglones;
    }

    public void setRenglones(int renglones) {
        this.renglones = renglones;
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        query = "INSERT INTO CLIENTES VALUES (" + cliente.getNumero() + ",'" + cliente.getNombre() + "','" + cliente.getTelefono() + "');";
        System.out.println(query);
        try {
            renglones = sentencia.executeUpdate(query);
            if (renglones == 1) {
                System.out.println("Se inserto el dato de manera exitosa!!!");
            }
        } catch (SQLException e) {
            System.out.println("Hubo un problema al insertar el cliente " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean eliminarCliente(int numeroCliente) {
        query = "DELETE FROM CLIENTES WHERE numero = " + numeroCliente + ";";
        System.out.println(query);
        try {
            renglones = sentencia.executeUpdate(query);
            if (renglones == 1) {
                System.out.println("Se eliminó el cliente de manera exitosa!!!");
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Hubo un problema al eliminar el cliente " + e.getMessage());
        }
        return false;
    }


    @Override
    public Cliente consultaCliente(int _numero) {
        Cliente cliente = null;
        query = "SELECT * FROM CLIENTES WHERE numero = " + _numero + ";";
        System.out.println(query);
        try {
            ResultSet resultSet = sentencia.executeQuery(query);
            if (resultSet.next()) {
                int num = resultSet.getInt("num");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                String calle = resultSet.getString("calle");
                String numero = resultSet.getString("numero");
                String telefono = resultSet.getString("telefono");
                String colonia = resultSet.getString("colonia");
                String estado = resultSet.getString("estado");
                String codigoPostal = resultSet.getString("codigoPostal");
                String rfc = resultSet.getString("rfc");
                String fechaNacimiento = resultSet.getString("fechaNacimiento");
                cliente = new Cliente(num, nombre, apellido, calle, numero, colonia, estado, codigoPostal, rfc, telefono, fechaNacimiento);

            } else {
                System.out.println("No se encontró ningún cliente con el número " + _numero);
            }
        } catch (SQLException e) {
            System.out.println("Hubo un problema al consultar el cliente " + e.getMessage());
        }
        return cliente;
    }


    @Override
    public Set<Cliente> obtenerClientes() {
        Set<Cliente> clientes = new HashSet<>();
        query = "SELECT * FROM CLIENTES;";
        System.out.println(query);
        try {
            ResultSet resultSet = sentencia.executeQuery(query);
            while (resultSet.next()) {
                int num = resultSet.getInt("num");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                String calle = resultSet.getString("calle");
                String numero = resultSet.getString("numero");
                String telefono = resultSet.getString("telefono");
                String colonia = resultSet.getString("colonia");
                String estado = resultSet.getString("estado");
                String codigoPostal = resultSet.getString("codigoPostal");
                String rfc = resultSet.getString("rfc");
                String fechaNacimiento = resultSet.getString("fechaNacimiento");

                clientes.add(new Cliente(num, nombre, apellido, calle, numero, colonia, estado, codigoPostal, rfc, telefono, fechaNacimiento));
            }
        } catch (SQLException e) {
            System.out.println("Hubo un problema al obtener los clientes " + e.getMessage());
        }
        return clientes;
    }


    @Override
    public Cliente buscarClientePorRfc(String rfc) {
        // NO ES NECESARIO
        return null;
    }

    @Override
    public void listarClientes() {
        query = "SELECT * FROM CLIENTES;";
        System.out.println(query);
        try {
            resultado = sentencia.executeQuery(query);
            while (resultado.next()) {
                System.out.println("Numero: " + resultado.getInt("numero"));
                System.out.println("Nombre: " + resultado.getString("nombre"));
                System.out.println("Telefono: " + resultado.getString("telefono"));
                System.out.println("=".repeat(50));
            }
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Hubo problemas al ejecutar el Query " + e.getMessage());
        }
    }
}
