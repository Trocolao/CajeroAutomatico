package cajero;

import static cajero.Dinero.getDinero;

public class Cajero{
    static int unidades500;
    static int unidades200;
    static int unidades100;
    static int unidades50;
    static int unidades20;
    static int unidades10;
    static int unidades5;
    static int unidades2;
    static int unidades1;
    static int unidades05;
    static int unidades02;
    static int unidades01;
    static int unidades005;
    static int unidades002;
    static int unidades001;

    public Cajero(int unidades500, int unidades200, int unidades100, int unidades50,
                  int unidades20, int unidades10, int unidades5,
                  int unidades2, int unidades1,int unidades05, int unidades02,
                  int unidades01, int unidades005, int unidades002, int unidades001) {
        Cajero.unidades500 = unidades500;
        Cajero.unidades200 = unidades200;
        Cajero.unidades100 = unidades100;
        Cajero.unidades50 = unidades50;
        Cajero.unidades20 = unidades20;
        Cajero.unidades10 = unidades10;
        Cajero.unidades5 = unidades5;
        Cajero.unidades2 = unidades2;
        Cajero.unidades1 = unidades1;
        Cajero.unidades05 = unidades05;
        Cajero.unidades02 = unidades02;
        Cajero.unidades01 = unidades01;
        Cajero.unidades005 = unidades005;
        Cajero.unidades002 = unidades002;
        Cajero.unidades001 = unidades001;
    }


    public static int getUnidades500() {
        return unidades500;
    }

    public void setUnidades500(int unidades500) {
        Cajero.unidades500 = unidades500;
    }

    public static int getUnidades200() {
        return unidades200;
    }

    public void setUnidades200(int unidades200) {
        Cajero.unidades200 = unidades200;
    }

    public static int getUnidades100() {
        return unidades100;
    }

    public void setUnidades100(int unidades100) {
        Cajero.unidades100 = unidades100;
    }

    public static int getUnidades50() {
        return unidades50;
    }

    public void setUnidades50(int unidades50) {
        Cajero.unidades50 = unidades50;
    }

    public static int getUnidades20() {
        return unidades20;
    }

    public void setUnidades20(int unidades20) {
        Cajero.unidades20 = unidades20;
    }

    public static int getUnidades10() {
        return unidades10;
    }

    public void setUnidades10(int unidades10) {
        Cajero.unidades10 = unidades10;
    }

    public static int getUnidades5() {
        return unidades5;
    }

    public void setUnidades5(int unidades5) {
        Cajero.unidades5 = unidades5;
    }

    public static int getUnidades2() {
        return unidades2;
    }

    public void setUnidades2(int unidades2) {
        Cajero.unidades2 = unidades2;
    }

    public static int getUnidades1() {
        return unidades1;
    }

    public void setUnidades1(int unidades1) {
        Cajero.unidades1 = unidades1;
    }

    public static int getUnidades05() {
        return unidades05;
    }

    public static void setUnidades05(int unidades05) {
        Cajero.unidades05 = unidades05;
    }

    public static int getUnidades02() {
        return unidades02;
    }

    public static void setUnidades02(int unidades02) {
        Cajero.unidades02 = unidades02;
    }

    public static int getUnidades01() {
        return unidades01;
    }

    public static void setUnidades01(int unidades01) {
        Cajero.unidades01 = unidades01;
    }

    public static int getUnidades005() {
        return unidades005;
    }

    public static void setUnidades005(int unidades005) {
        Cajero.unidades005 = unidades005;
    }

    public static int getUnidades002() {
        return unidades002;
    }

    public static void setUnidades002(int unidades002) {
        Cajero.unidades002 = unidades002;
    }

    public static int getUnidades001() {
        return unidades001;
    }

    public static void setUnidades001(int unidades001) {
        Cajero.unidades001 = unidades001;
    }

    public static float _dinero;
    public static float _dinero1;
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

    public void getDineroCajero() {
        _dinero=getUnidades500()*bill500.getValor()+getUnidades200()*bill200.getValor()
                +getUnidades100()*bill100.getValor()+getUnidades50()*bill50.getValor()+
                getUnidades20()*bill20.getValor()+getUnidades10()*bill10.getValor()
                +getUnidades5()*bill5.getValor()+getUnidades2()*mon2e.getValor()+getUnidades1()*mon1e.getValor()+
        getUnidades05()*mon50cen.getValor()+getUnidades02()*mon20cen.getValor()
                +getUnidades01()*mon10cen.getValor()+getUnidades005()*mon5cen.getValor()+
                getUnidades002()*mon2cen.getValor()+getUnidades001()*mon1cen.getValor();
    }
    public void getDineroDevuelveCajero(){
        float d=getBilletes500()*bill500.getValor()+getBilletes200()*bill200.getValor()
                +getBilletes100()*bill100.getValor()+getBilletes50()*bill50.getValor()+
                getBilletes20()*bill20.getValor()+getBilletes10()*bill10.getValor()
                +getBilletes5()*bill5.getValor()+getMonedas2()*mon2e.getValor()+getMonedas1()*mon1e.getValor()+
                getCen50()*mon50cen.getValor()+getCen20()*mon20cen.getValor()
                +getCen10()*mon10cen.getValor()+getCen5()*mon5cen.getValor()+
                getCen2()*mon2cen.getValor()+getCen1()*mon1cen.getValor();
        _dinero1=(float) (Math.round(d*100.0)/100.0);
    }

    public static int getCen1() {
        int cen1 = (int)(getRestoMonedas2cen()/mon1cen.getValor());
        if(cen1<=getUnidades001()){
            return cen1;
        }else{
            return getUnidades001();
        }
    }

    public static float getRestoMonedas2cen() {
        float restoMonedas2cen1 = (getRestomonedas5cen()% mon2cen.getValor());
        float restoMonedas2cen= (float) (Math.round(restoMonedas2cen1*100.0)/100.0);
        int cen2 = (int)(getRestomonedas5cen()/ mon2cen.getValor());
        if(cen2<=getUnidades002()){
            return restoMonedas2cen;
        }else{
            float d= restoMonedas2cen+(cen2-getUnidades002())*mon2cen.getValor();
            return (float) (Math.round(d*100.0)/100.0);
        }
    }

    public static int getCen2() {
        int cen2 = (int)(getRestomonedas5cen()/ mon2cen.getValor());
        if(cen2<=getUnidades002()){
            return cen2;
        }else{
            return getUnidades002();
        }
    }

    public static float getRestomonedas5cen() {
        float restoMonedas5cen1 = (getRestoMonedas10cen()% mon5cen.getValor());
        float restoMonedas5cen= (float) (Math.round(restoMonedas5cen1*100.0)/100.0);
        int cen5 = (int)(getRestoMonedas10cen()/ mon5cen.getValor());
        if(cen5<=getUnidades005()){
            return restoMonedas5cen;
        }else{
            float d= restoMonedas5cen+(cen5-getUnidades005())*mon5cen.getValor();
            return (float) (Math.round(d*100.0)/100.0);
        }
    }

    public static int getCen5() {
        int cen5 = (int)(getRestoMonedas10cen()/ mon5cen.getValor());
        if(cen5<=getUnidades005()){
            return cen5;
        }else{
            return getUnidades005();
        }
    }

    public static float getRestoMonedas10cen() {
        float restoMonedas10cen1 = (getRestoMonedas20cen()% mon10cen.getValor());
        float restomonedas10cen= (float) (Math.round(restoMonedas10cen1*100.0)/100.0);
        int cen10 = (int)(getRestoMonedas20cen()/ mon10cen.getValor());
        if(cen10<=getUnidades01()){
            return restomonedas10cen;
        }else{
            float d= restomonedas10cen+(cen10-getUnidades01())*mon10cen.getValor();
            return (float) (Math.round(d*100.0)/100.0);
        }
    }

    public static int getCen10() {
        int cen10 = (int)(getRestoMonedas20cen()/ mon10cen.getValor());
        if(cen10<=getUnidades01()){
            return cen10;
        }else{
            return getUnidades01();
        }
    }

    public static float getRestoMonedas20cen() {
        float restoMonedas20cen1 = (getRestoMonedas50cen()% mon20cen.getValor());
        float restomonedas20cen= (float) (Math.round(restoMonedas20cen1*100.0)/100.0);
        int cen20 = (int)(getRestoMonedas50cen()/ mon20cen.getValor());
        if(cen20<=getUnidades02()){
            return restomonedas20cen;
        }else{
            float d= restomonedas20cen+(cen20-getUnidades02())*mon20cen.getValor();
            return (float) (Math.round(d*100.0)/100.0);
        }
    }

    public static int getCen20() {
        int cen20 = (int)(getRestoMonedas50cen()/ mon20cen.getValor());
        if(cen20<=getUnidades02()){
            return cen20;
        }else{
            return getUnidades02();
        }
    }

    public static float getRestoMonedas50cen() {
        float restoMonedas50cen1 = getRestomonedas1e()% mon50cen.getValor();
        float restoMoneas50cen= (float) (Math.round(restoMonedas50cen1*100.0)/100.0);
        int cen50 =(int) (getRestomonedas1e()/ mon50cen.getValor());
        if(cen50<=getUnidades05()){
            return restoMoneas50cen;
        }else{
           float d= restoMoneas50cen+(cen50-getUnidades05())*mon50cen.getValor();
            return (float) (Math.round(d*100.0)/100.0);
        }
    }

    public static int getCen50() {
        int cen50 =(int) (getRestomonedas1e()/ mon50cen.getValor());
        if(cen50<=getUnidades05()){
            return cen50;
        }else{
            return getUnidades05();
        }
    }
    public static float getRestomonedas1e(){
        float restoMonedas1e= getRestoMonedas2e()% mon1e.getValor();
        int monedas1= (int) getRestoMonedas2e();
        if(monedas1<=getUnidades1()){
            return restoMonedas1e;
        }else{
            return restoMonedas1e+(monedas1-getUnidades1())*mon1e.getValor();
        }
    }

    public static int getMonedas1() {
        int monedas1= (int) getRestoMonedas2e();
        if(monedas1<=getUnidades1()){
            return monedas1;
        }else{
            return getUnidades1();
        }    }

    public static float getRestoMonedas2e() {
        float restoMonedas2e= getRestoBilletes5() % mon2e.getValor();
        int monedas2 = (int)(getRestoBilletes5() / mon2e.getValor());
        if(monedas2<=getUnidades2()){
            return restoMonedas2e;
        }else{
            return restoMonedas2e+(monedas2-getUnidades2())*mon2e.getValor();
        }
    }

    public static int getMonedas2() {
        int monedas2 = (int)(getRestoBilletes5() / mon2e.getValor());
        if(monedas2<=getUnidades2()){
            return monedas2;
        }else{
            return getUnidades2();
        }
    }

    public static float getRestoBilletes5() {
        float restoBilletes5= getRestobilletes10() %bill5.getValor();
        int billetes5 = (int)(getRestobilletes10() / bill5.getValor());
        if(billetes5<=getUnidades5()){
            return restoBilletes5;
        }else{
            return restoBilletes5+(billetes5-getUnidades5())*bill5.getValor();
        }
    }

    public static int getBilletes5() {
        int billetes5 = (int)(getRestobilletes10() / bill5.getValor());
        if(billetes5<=getUnidades5()){
            return billetes5;
        }else{
            return getUnidades5();
        }
    }

    public static float getRestobilletes10() {
        float restoBilletes10= getRestoBilletes20() %bill10.getValor();
        int billetes10 = (int)(getRestoBilletes20() / bill10.getValor());
        if(billetes10<=getUnidades10()){
            return restoBilletes10;
        }else{
            return restoBilletes10+(billetes10-getUnidades10())*bill10.getValor();
        }
    }

    public static int getBilletes10() {
        int billetes10 = (int)(getRestoBilletes20() / bill10.getValor());
        if(billetes10<=getUnidades10()){
            return billetes10;
        }else{
            return getUnidades10();
        }
    }

    public static float getRestoBilletes20() {
        float restoBillete20= getRestoBilletes50() %bill20.getValor();
        int billetes20 = (int)(getRestoBilletes50() / bill20.getValor());
        if(billetes20<=getUnidades20()){
            return restoBillete20;
        }else{
            return restoBillete20+(billetes20-getUnidades20())*bill20.getValor();
        }
    }

    public static int getBilletes20() {
        int billetes20 = (int)(getRestoBilletes50() / bill20.getValor());
        if(billetes20<=getUnidades20()){
            return billetes20;
        }else{
            return getUnidades20();
        }
    }

    public static float getRestoBilletes50() {
        float restobilletes50= getRestoBilletes100() %bill50.getValor();
        int billetes50 = (int)(getRestoBilletes100() / bill50.getValor());
        if(billetes50<=getUnidades50()){
            return restobilletes50;
        }else{
            return restobilletes50+(billetes50-getUnidades50())*bill50.getValor();
        }
    }

    public static int getBilletes50() {
        int billetes50 = (int)(getRestoBilletes100() / bill50.getValor());
        if(billetes50<=getUnidades50()){
            return billetes50;
        }else{
            return getUnidades50();
        }
    }

    public static float getRestoBilletes100() {
        float restoBilletes100= getRestoBilletes200() %bill100.getValor();
        int billetes100 = (int)(getRestoBilletes200() / bill100.getValor());
        if(billetes100<=getUnidades100()){
            return restoBilletes100;
        }else{
            return restoBilletes100+(billetes100-getUnidades100())*bill100.getValor();
        }
    }

    public static int getBilletes100( ) {
        int billetes100 = (int)(getRestoBilletes200() / bill100.getValor());
        if(billetes100<=getUnidades100()){
            return billetes100;
        }else{
            return getUnidades100();
        }

    }

    public static float getRestoBilletes200() {
        float restoBilletes200= getRestoBilletes500() %bill200.getValor();
        int billetes200 = (int) (getRestoBilletes500() / bill200.getValor());
        if(billetes200<=getUnidades200()){
            return restoBilletes200;
        }else{
            return restoBilletes200+(billetes200-getUnidades200())*bill200.getValor();
        }

    }

    public static int getBilletes200() {

        int billetes200 = (int) (getRestoBilletes500() / bill200.getValor());
        if(billetes200<=getUnidades200()){
            return billetes200;
        }else{
            return getUnidades200();
        }
    }

    public static float getRestoBilletes500() {

        float restoBilletes500= getDinero() %bill500.getValor();
        int billetes500 = (int)(getDinero() / bill500.getValor());
        if(billetes500<=getUnidades500()){
            return restoBilletes500;
        }else{
            return restoBilletes500+(billetes500-getUnidades500())*bill500.getValor();
        }

    }

    public static int getBilletes500() {

        int billetes500 = (int)(getDinero() / bill500.getValor());
        if(billetes500<=getUnidades500()){
            return billetes500;
        }else{
            return getUnidades500();
        }

    }

    public static String tostr(){
        if(getDinero()>_dinero){
            return "El cajero automático no dispone de más dinero, por favor acuda al más cercano\n";
        } else if (getDinero()!=_dinero1) {
            return "El cajero no dispone de los cambios disponibles para retirar su dinero, por favor acuda al más cercano\n";
        }
        return "Dinero: total " +getDinero()+ " euros \n"+
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
