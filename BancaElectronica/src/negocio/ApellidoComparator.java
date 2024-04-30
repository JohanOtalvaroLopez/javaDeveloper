package negocio;

import java.util.Comparator;

public class ApellidoComparator implements Comparator<Cliente> {
    @Override
    public int compare(Cliente c1, Cliente c2) {
        return c1.getApellido().compareTo(c2.getApellido()) ;
    }
}
