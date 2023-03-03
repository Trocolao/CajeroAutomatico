package cajero;
public class Cajero{
    public static float _dinero;
    static Billete bill500=new Billete(500);
    static Billete bill200=new Billete(200);
    static Billete bill100=new Billete(100);
    static Billete bill50=new Billete(50);
    static Billete bill20=new Billete(20);
    static Billete bill10=new Billete(10);
    static Billete bill5=new Billete(5);
    static Moneda mon2e =new Moneda(2);
    static Moneda mon1e =new Moneda(1);
    static Moneda mon50cen =new Moneda(0.5f);
    static Moneda mon20cen =new Moneda(0.2f);
    static Moneda mon10cen =new Moneda(0.1f);
    static Moneda mon5cen =new Moneda(0.05f);
    static Moneda mon2cen =new Moneda(0.02f);
    static Moneda mon1cen =new Moneda(0.01f);

    public static void getDinero(float dinero) {
        _dinero= dinero;
    }

    public static int getCen1() {
        int cen1 = (int)(getRestoMonedas2cen()/mon1cen.getValor());
        return cen1;
    }

    public static float getRestoMonedas2cen() {
        float restoMonedas2cen1 = (getRestomonedas5cen()% mon2cen.getValor());
        float restoMonedas2cen= (float) (Math.round(restoMonedas2cen1*100.0)/100.0);
        return restoMonedas2cen;
    }

    public static int getCen2() {
        int cen2 = (int)(getRestomonedas5cen()/ mon2cen.getValor());
        return cen2;
    }

    public static float getRestomonedas5cen() {
        float restoMonedas5cen1 = (getRestoMonedas10cen()% mon5cen.getValor());
        float restoMonedas5cen= (float) (Math.round(restoMonedas5cen1*100.0)/100.0);
        return restoMonedas5cen;
    }

    public static int getCen5() {
        int cen5 = (int)(getRestoMonedas10cen()/ mon5cen.getValor());
        return cen5;
    }

    public static float getRestoMonedas10cen() {
        float restoMonedas10cen1 = (getRestoMonedas20cen()% mon10cen.getValor());
        float restomonedas10cen= (float) (Math.round(restoMonedas10cen1*100.0)/100.0);
        return restomonedas10cen;
    }

    public static int getCen10() {
        int cen10 = (int)(getRestoMonedas20cen()/ mon10cen.getValor());
        return cen10;
    }

    public static float getRestoMonedas20cen() {
        float restoMonedas20cen1 = (getRestoMonedas50cen()% mon20cen.getValor());
        float restomonedas20cen= (float) (Math.round(restoMonedas20cen1*100.0)/100.0);
        return restomonedas20cen;
    }

    public static int getCen20() {
        int cen20 = (int)(getRestoMonedas50cen()/ mon20cen.getValor());
        return cen20;
    }

    public static float getRestoMonedas50cen() {
        float restoMonedas50cen1 = getRestomonedas1e()% mon50cen.getValor();
        float restoMoneas50cen= (float) (Math.round(restoMonedas50cen1*100.0)/100.0);
        return restoMoneas50cen;
    }

    public static int getCen50() {
        int cen50 =(int) (getRestomonedas1e()/ mon50cen.getValor());
        return cen50;
    }
    public static float getRestomonedas1e(){
        float restoMonedas1e= getRestoMonedas2e()% mon1e.getValor();
        return restoMonedas1e;
    }

    public static int getMonedas1() {
        int monedas1= (int) getRestoMonedas2e();
        return monedas1;
    }

    public static float getRestoMonedas2e() {
        float restoMonedas2e= getRestoBilletes5() % mon2e.getValor();
        return restoMonedas2e;
    }

    public static int getMonedas2() {
        int monedas2 = (int)(getRestoBilletes5() / mon2e.getValor());
        return monedas2;
    }

    public static float getRestoBilletes5() {
        float restoBilletes5= getRestobilletes10() %bill5.getValor();
        return restoBilletes5;
    }

    public static int getBilletes5() {
        int billetes5 = (int)(getRestobilletes10() / bill5.getValor());
        return billetes5;
    }

    public static float getRestobilletes10() {
        float restoBilletes10= getRestoBilletes20() %bill10.getValor();
        return restoBilletes10;
    }

    public static int getBilletes10() {
        int billetes10 = (int)(getRestoBilletes20() / bill10.getValor());
        return billetes10;
    }

    public static float getRestoBilletes20() {
        float restoBillete20= getRestoBilletes50() %bill20.getValor();
        return restoBillete20;
    }

    public static int getBilletes20() {
        int billetes20 = (int)(getRestoBilletes50() / bill20.getValor());
        return billetes20;
    }

    public static float getRestoBilletes50() {
        float restobilletes50= getRestoBilletes100() %bill50.getValor();
        return restobilletes50;
    }

    public static int getBilletes50() {
        int billetes50 = (int)(getRestoBilletes100() / bill50.getValor());
        return billetes50;
    }

    public static float getRestoBilletes100() {
        float restoBilletes100= getRestoBilletes200() %bill100.getValor();
        return restoBilletes100;
    }

    public static int getBilletes100( ) {
        int billetes100 = (int)(getRestoBilletes200() / bill100.getValor());
        return billetes100;
    }

    public static float getRestoBilletes200() {
        float restoBilletes200= getRestoBilletes500() %bill200.getValor();
        return restoBilletes200;
    }

    public static int getBilletes200() {

        int billetes200 = (int) (getRestoBilletes500() / bill200.getValor());
        return billetes200;
    }

    public static float getRestoBilletes500() {

        float restoBilletes500= _dinero %bill500.getValor();
        return restoBilletes500;
    }

    public static int getBilletes500() {

        int billetes500 = (int)(_dinero / bill500.getValor());
        return billetes500;
    }

    public static String tostr(){
        return "Dinero: total " +_dinero+ " euros \n"+
                "Billetes de " +bill500.getValor()+" : "  +getBilletes500()+"\n"+
                "Billetes de "+bill200.getValor()+" : " +getBilletes200()+"\n"+
                "Billetes de "+bill100.getValor()+" : " +getBilletes100()+"\n"+
                "Billetes de "+bill50.getValor()+" : " +getBilletes50()+"\n"+
                "Billetes de "+bill20.getValor()+" : " +getBilletes20()+"\n"+
                "Billetes de "+bill10.getValor()+" : " +getBilletes10()+"\n"+
                "Billetes de "+bill5.getValor()+" : " +getBilletes5()+"\n"+
                "Monedas de "+ mon2e.getValor()+" euros "+" : " +getMonedas2()+"\n"+
                "Monedas de "+ mon1e.getValor()+" euros "+" : " +getMonedas1()+"\n"+
                "Monedas de "+ mon50cen.getValor()+" euros "+" : " +getCen50()+"\n"+
                "Monedas de "+ mon20cen.getValor()+" euros "+" : " +getCen20()+"\n"+
                "Monedas de "+ mon10cen.getValor()+" euros "+" : " +getCen10()+"\n"+
                "Monedas de "+ mon5cen.getValor()+" euros "+" : " +getCen5()+"\n"+
                "Monedas de "+ mon2cen.getValor()+" euros "+" : " +getCen2()+"\n"+
                "Monedas de "+ mon1cen.getValor()+" euros "+" : " +getCen1()+"\n";
    }
}
