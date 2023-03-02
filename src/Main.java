import cajero.Cajero;
import cajero.Dinero;

public class Main {
    public static void main(String[] args) {
        Cajero ej1=  new Cajero();
        ej1.getDinero(3456.32F);
        System.out.println(ej1.tostr());
    }
}