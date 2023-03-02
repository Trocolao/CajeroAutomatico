package cajero;

public class Cajero{
    public static float _dinero;
    static Billetes bill500=new Billetes(500);
    static Billetes bill200=new Billetes(200);
    static Billetes bill100=new Billetes(100);
    static Billetes bill50=new Billetes(50);
    static Billetes bill20=new Billetes(20);
    static Billetes bill10=new Billetes(10);
    static Billetes bill5=new Billetes(5);
    static Monedas mon2e =new Monedas(2);
    static Monedas mon1e =new Monedas(1);
    static Monedas mon50cen =new Monedas(0.5f);
    static Monedas mon20cen =new Monedas(0.2f);
    static Monedas mon10cen =new Monedas(0.1f);
    static Monedas mon5cen =new Monedas(0.05f);
    static Monedas mon2cen =new Monedas(0.02f);
    static Monedas mon1cen =new Monedas(0.01f);


    public static void getDinero(float dinero) {
        _dinero= dinero;
    }

    public static int getCen1() {
        int cen1 = (int)(getResto14()/mon1cen.getValor());
        return cen1;
    }

    public static float getResto14() {
        float resto141 = (getResto13()% mon2cen.getValor());
        float resto14= (float) (Math.round(resto141*100.0)/100.0);
        return resto14;
    }

    public static int getCen2() {
        int cen2 = (int)(getResto13()/ mon2cen.getValor());
        return cen2;
    }

    public static float getResto13() {
        float resto131 = (getResto12()% mon5cen.getValor());
        float resto13= (float) (Math.round(resto131*100.0)/100.0);
        return resto13;
    }

    public static int getCen5() {
        int cen5 = (int)(getResto12()/ mon5cen.getValor());
        return cen5;
    }

    public static float getResto12() {
        float resto121 = (getResto11()% mon10cen.getValor());
        float resto12= (float) (Math.round(resto121*100.0)/100.0);
        return resto12;
    }

    public static int getCen10() {
        int cen10 = (int)(getResto11()/ mon10cen.getValor());
        return cen10;
    }

    public static float getResto11() {
        float resto111 = (getResto10()% mon20cen.getValor());
        float resto11= (float) (Math.round(resto111*100.0)/100.0);
        return resto11;
    }

    public static int getCen20() {
        int cen20 = (int)(getResto10()/ mon20cen.getValor());
        return cen20;
    }

    public static float getResto10() {
        float resto101 = getResto9()% mon50cen.getValor();
        float resto10= (float) (Math.round(resto101*100.0)/100.0);
        return resto10;
    }

    public static int getCen50() {

        int cen50 =(int) (getResto9()/ mon50cen.getValor());
        return cen50;
    }
    public static float getResto9(){
        float resto9=getResto8()% mon1e.getValor();
        return resto9;
    }

    public static int getMonedas1() {
        int monedas1= (int) getResto8();
        return monedas1;
    }

    public static float getResto8() {
        float resto8= getResto7() % mon2e.getValor();
        return resto8;
    }

    public static int getMonedas2() {
        int monedas2 = (int)(getResto7() / mon2e.getValor());
        return monedas2;
    }

    public static float getResto7() {
        float resto7= getResto6() %bill5.getValor();
        return resto7;
    }

    public static int getBilletes5() {
        int billetes5 = (int)(getResto6() / bill5.getValor());
        return billetes5;
    }

    public static float getResto6() {
        float resto6= getResto5() %bill10.getValor();
        return resto6;
    }

    public static int getBilletes10() {
        int billetes10 = (int)(getResto5() / bill10.getValor());
        return billetes10;
    }

    public static float getResto5() {
        float resto5= getResto4() %bill20.getValor();
        return resto5;
    }

    public static int getBilletes20() {
        int billetes20 = (int)(getResto4() / bill20.getValor());
        return billetes20;
    }

    public static float getResto4() {
        float resto4= getResto3() %bill50.getValor();
        return resto4;
    }

    public static int getBilletes50() {
        int billetes50 = (int)(getResto3() / bill50.getValor());
        return billetes50;
    }

    public static float getResto3() {
        float resto3= getResto2() %bill100.getValor();
        return resto3;
    }

    public static int getBilletes100( ) {
        int billetes100 = (int)(getResto2() / bill100.getValor());
        return billetes100;
    }

    public static float getResto2() {
        float resto2= getResto1() %bill200.getValor();
        return resto2;
    }

    public static int getBilletes200() {

        int billetes200 = (int) (getResto1() / bill200.getValor());
        return billetes200;
    }

    public static float getResto1() {

        float resto1= _dinero %bill500.getValor();
        return resto1;
    }

    public static int getBilletes500() {

        int billetes500 = (int)(_dinero / bill500.getValor());
        return billetes500;
    }

    public static int getCentimos() {

        float decimal= _dinero % 1;
        float centimos1=decimal*100;
        int centimos = Math.round(centimos1);
        return centimos;
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
