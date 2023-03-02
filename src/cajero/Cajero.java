package cajero;

public class Cajero{
    public static float _dinero;

    public static void getDinero(float dinero) {
        _dinero= dinero;
    }

    public static int getCen1() {
        int cen1 = (int)(getResto14());
        return cen1;
    }

    public static float getResto14() {
        float resto14 = (getResto13()%2);
        return resto14;
    }

    public static int getCen2() {
        int cen2 = (int)(getResto13()/2);
        return cen2;
    }

    public static float getResto13() {
        float resto13 = (getResto12()%5);
        return resto13;
    }

    public static int getCen5() {
        int cen5 = (int)(getResto12()/5);
        return cen5;
    }

    public static float getResto12() {
        float resto12 = (getResto11()%10);
        return resto12;
    }

    public static int getCen10() {
        int cen10 = (int)(getResto11()/10);
        return cen10;
    }

    public static float getResto11() {
        float resto11 = (getResto10()%20);
        return resto11;
    }

    public static int getCen20() {
        int cen20 = (int)(getResto10()/20);
        return cen20;
    }

    public static float getResto10() {
        float resto10 = getCentimos()%50;
        return resto10;
    }

    public static int getCen50() {

        int cen50 = (getCentimos()/50);
        return cen50;
    }

    public static int getMonedas1() {
        int monedas1= (int) getResto8();
        return monedas1;
    }

    public static float getResto8() {
        float resto8= getResto7() %2;
        return resto8;
    }

    public static int getMonedas2() {
        int monedas2 = (int)(getResto7() / 2);
        return monedas2;
    }

    public static float getResto7() {
        float resto7= getResto6() %5;
        return resto7;
    }

    public static int getBilletes5() {
        int billetes5 = (int)(getResto6() / 5);
        return billetes5;
    }

    public static float getResto6() {
        float resto6= getResto5() %10;
        return resto6;
    }

    public static int getBilletes10() {
        int billetes10 = (int)(getResto5() / 10);
        return billetes10;
    }

    public static float getResto5() {
        float resto5= getResto4() %20;
        return resto5;
    }

    public static int getBilletes20() {
        int billetes20 = (int)(getResto4() / 20);
        return billetes20;
    }

    public static float getResto4() {
        float resto4= getResto3() %50;
        return resto4;
    }

    public static int getBilletes50() {
        int billetes50 = (int)(getResto3() / 50);
        return billetes50;
    }

    public static float getResto3() {
        float resto3= getResto2() %100;
        return resto3;
    }

    public static int getBilletes100( ) {
        int billetes100 = (int)(getResto2() / 100);
        return billetes100;
    }

    public static float getResto2() {
        float resto2= getResto1() %200;
        return resto2;
    }

    public static int getBilletes200() {

        int billetes200 = (int) (getResto1() / 200);
        return billetes200;
    }

    public static float getResto1() {

        float resto1= _dinero %500;
        return resto1;
    }

    public static int getBilletes500() {

        int billetes500 = (int)(_dinero / 500);
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
                "Billetes de 500: "+getBilletes500()+"\n"+
                "Billetes de 200: "+getBilletes200()+"\n"+
                "Billetes de 100: "+getBilletes100()+"\n"+
                "Billetes de 50: "+getBilletes50()+"\n"+
                "Billetes de 20: "+getBilletes20()+"\n"+
                "Billetes de 10: "+getBilletes10()+"\n"+
                "Billetes de 5: "+getBilletes5()+"\n"+
                "Monedas de 2 euros: "+getMonedas2()+"\n"+
                "Monedas de 1 euro: "+getMonedas1()+"\n"+
                "Monedas de 50 centimos: "+getCen50()+"\n"+
                "Monedas de 20 centimos: "+getCen20()+"\n"+
                "Monedas de 10 centimos: "+getCen10()+"\n"+
                "Monedas de 5 centimos: "+getCen5()+"\n"+
                "Monedas de 2 centimos: "+getCen2()+"\n"+
                "Monedas de 1 centimo: "+getCen1()+"\n";
    }
}
