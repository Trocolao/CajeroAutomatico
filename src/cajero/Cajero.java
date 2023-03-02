package cajero;

public class Cajero {


    public void retirarinero(float dinero){
        float decimal=dinero % 1;
        float centimos1=decimal*100;

        float centimos = Math.round(centimos1);
        int billetes500= (int) (dinero/500);
        float resto1=dinero%500;
        int billetes200= (int) (resto1/200);
        float resto2=resto1%200;
        int billetes100= (int) (resto2/100);
        float resto3=resto2%100;
        int billetes50= (int) (resto3/50);
        float resto4=resto3%50;
        int billetes20= (int) (resto4/20);
        float resto5=resto4%20;
        int billetes10= (int) (resto5/10);
        float resto6=resto5%10;
        int billetes5= (int) (resto6/5);
        float resto7=resto6%5;
        int monedas2= (int) (resto7/2);
        float resto8=resto7%2;
        int monedas1= (int) (resto8/1);
        float resto9=resto8%1;
        int cen50= (int) (centimos/50);
        float resto10=centimos%50;
        int cen20= (int) (resto10/20);
        float resto11=resto10%20;
        int cen10= (int) (resto11/10);
        float resto12=resto11%10;
        int cen5= (int) (resto12/5);
        float resto13=resto12%5;
        int cen2= (int) (resto13/2);
        float resto14=resto13%2;
        int cen1= (int) (resto14/1);


        System.out.println("El dinero devuelto es el siguiente: "+billetes500+ " bilettes de 500\n"+
                billetes200+ " bilettes de 200 \n"+
                billetes100+ " bilettes de 100\n"+
                billetes50+ " bilettes de 50\n"+
                billetes20+ " bilettes de 20\n"+
                billetes10+ " bilettes de 10\n"+
                billetes5+ " bilettes de 5\n"+
                monedas2+ " monedas de 2 euros\n" +
                monedas1+ " monedas de 1 euro \n"+
                cen50+ " monedas de 50 centimos \n"+
                cen20+ " monedas de 20 centimos\n"+
                cen10+ " monedas de 10 centimos\n"+
                cen5+ " monedas de 5 centimos\n"+
                cen2+ " monedas de 2 centimos\n"+
                cen1+ " monedas de 1 centimo"

        );



        /*float billetes20=resto2/100;
        float resto5=resto2%100;
        float monedas2=resto2/100;
        float resto6=resto2%100;
        float monedas1=resto2/100;
        float resto7=resto2%100;
        float monedas50=resto2/100;
        float resto8=resto2%100;
        float monedas20=resto2/100;
        float resto9=resto2%100;
        float monedas10=resto2/100;
        float resto10=resto2%100;
        float monedas5=resto2/100;
        float resto11=resto2%100;
        float monedas2c=resto2/100;
        float resto12=resto2%100;
        float monedas1c=resto2/100;
        float resto13=resto2%100;
        float billetes100=resto2/100;
        float resto3=resto2%100;
        float billetes100=resto2/100;
        float resto3=resto2%100;*/



    }


}
