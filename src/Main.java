import cajero.Cajero;
import cajero.Dinero;

public class Main {
    public static void main(String[] args) {
        Cajero ej1=  new Cajero();
        ej1.getDinero(3456.29F);
        System.out.println(ej1.tostr());

        Cajero ej2=  new Cajero();
        ej2.getDinero(0.39F);
        System.out.println(ej2.tostr());

        Cajero ej3=  new Cajero();
        ej3.getDinero(0.43F);
        System.out.println(ej3.tostr());

        Cajero ej4=new Cajero();
        ej4.getDinero(0.62f);
        System.out.println(ej4.tostr());

        Cajero ej5=new Cajero();
        ej5.getDinero(0.97f);
        System.out.println(ej5.tostr());

        Cajero ej6=new Cajero();
        ej6.getDinero(0.88f);
        System.out.println(ej6.tostr());
    }
}