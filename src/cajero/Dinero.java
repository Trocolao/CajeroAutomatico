package cajero;

public class Dinero {
    static float dinero;

    public Dinero(float dinero) {
        this.dinero = dinero;
    }

    public static float getDinero() {
        return dinero;
    }

    public static void setDinero(float dinero) {
        Dinero.dinero = dinero;
    }
    @Override
    public  String toString() {
        return "Dinero{" +
                "dinero=" + dinero +
                '}';
    }

}
