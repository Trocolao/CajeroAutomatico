import cajero.Cajero;
import cajero.Dinero;

public class Main {
    public static void main(String[] args) {
        Dinero dinero1=new Dinero(4500.36f);
        Cajero cajero1=new Cajero(2,3,
                5,12,20,50,100,250,300,0,
                0,0,8,0,7);
        dinero1.getDinero();
        cajero1.getDineroCajero();
        cajero1.getDineroDevuelveCajero();
        System.out.println(cajero1.tostr());

        Dinero dinero2=new Dinero(5101);
        dinero2.getDinero();
        cajero1.getDineroCajero();
        cajero1.getDineroDevuelveCajero();
        System.out.println(cajero1.tostr());

        Dinero dinero3=new Dinero(12.47f);
        dinero3.getDinero();
        cajero1.getDineroCajero();
        cajero1.getDineroDevuelveCajero();
        System.out.println(cajero1.tostr());

        Dinero dinero4=new Dinero(1200.51f);
        dinero4.getDinero();
        cajero1.getDineroCajero();
        cajero1.getDineroDevuelveCajero();
        System.out.println(cajero1.tostr());


    }
}