package ejemplo;

import java.util.ArrayList;

public class ProbarVoladores {
    public static void main(String[] args) {
        Oso o = new Oso("Polar","Blanco",4,"6 meses");
        Aguila a = new Aguila("Real","Cafe",2,"1.5mts");
        Helicoptero h = new Helicoptero("Boing",0);
        ArrayList<Volador> voladores = new ArrayList<>();
        voladores.add(a);
        voladores.add(h);
        for(Volador v:voladores){
            v.despegar();
            v.volar();
            v.aterrizar();
        }

    }
}
