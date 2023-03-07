import cajero.Cajero;
import cajero.Dinero;

public class Main {
    public static void main(String[] args) {
        Cajero cajero1=new Cajero(2,3,
                5,12,20,50,100,250,300,0,
                0,0,8,0,7);
        Cajero cajero2=new Cajero(2,1,
                3,50,20,50,100,250,300,10,
                43,12,8,32,7);

        Dinero dinero1=new Dinero(4500.36f);
        SacarDinero(dinero1,cajero1);
        SacarDinero(dinero1,cajero2);

        Dinero dinero2=new Dinero(5101);
        SacarDinero(dinero2,cajero1);
        SacarDinero(dinero2,cajero2);

        Dinero dinero3=new Dinero(12.47f);
        SacarDinero(dinero3,cajero1);
        SacarDinero(dinero3,cajero2);

        Dinero dinero4=new Dinero(1200.51f);
        SacarDinero(dinero4,cajero1);
        SacarDinero(dinero4,cajero2);

        Dinero dinero5=new Dinero(11200.51f);
        SacarDinero(dinero5,cajero1);
        SacarDinero(dinero5,cajero2);
    }

    private static void SacarDinero(Dinero dinero1, Cajero cajero1) {
        cajero1.setDineroaSacar(dinero1);
        System.out.println(cajero1.tostr());
    }
}