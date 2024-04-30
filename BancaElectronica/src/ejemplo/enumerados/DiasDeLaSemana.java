package ejemplo.enumerados;

public enum DiasDeLaSemana {

    Lunes(1), Martes(2), Miercoles(3), Jueves(4), Viernes(5), Sabado(6), Domingo(7);
    private int numero;
    private DiasDeLaSemana(int numero) {
        this.numero=numero;
    }

    public void imprime(){
        System.out.println("Dia de la semana: "+this.name()+" numero: "+this.numero);
    }
}
