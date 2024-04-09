package ejemplo;

public class Robot implements Comunicarse {
    String marca;
    int autonomia;


    @Override
    public void hablar() {
        System.out.println("Que se le ofrece?");
    }
}
