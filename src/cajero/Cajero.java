package cajero;

public class Cajero {
    public void retirarinero(float dinero){
        int cont500=0,cont200=0,cont100=0,cont50=0,cont20=0,cont10=0,cont5=0,cont2=0,cont1=0,cont05=0,
                cont02=0,cont01=0,cont005=0,cont002=0,cont001 =0;
        double decimal=dinero % 1;
        double centimos1=decimal*100;

        double centimos = Math.round(centimos1);


        while(dinero>=500){
            dinero-=500;
            cont500++;

        }
        while(dinero>=200){
            dinero-=200;
            cont200++;
        }
        while(dinero>=100){
            dinero-=100;
            cont100++;
        }
        while(dinero>=50){
            dinero-=50;
            cont50++;
        }
        while(dinero>=20){
            dinero-=20;
            cont20++;
        }
        while(dinero>=10){
            dinero-=10;
            cont10++;
        }
        while(dinero>=5){
            dinero-=5;
            cont5++;
        }
        while(dinero>=2){
            dinero-=2;
            cont2++;
        }
        while(dinero>=1){
            dinero-=1;
            cont1++;
        }
        while(centimos>=50){
            centimos-=50;
            cont05++;
        }
        while(centimos>=20){
            centimos-=20;
            cont02++;
        }
        while(centimos>=10){
            centimos-=10;
            cont01++;
        }
        while(centimos>=5){
            centimos-=5;
            cont005++;

        }
        while(centimos>=2){
            centimos-=2;
            cont002++;


        }
        while(centimos>=1){
           centimos-=1;
            cont001++;


        }

        System.out.println("El dinero devuelto es el siguiente: "+cont500+ " bilettes de 500\n"+
                cont200+ " bilettes de 200 \n"+
                cont100+ " bilettes de 100\n"+
                cont50+ " bilettes de 50\n"+
                cont20+ " bilettes de 20\n"+
                cont10+ " bilettes de 10\n"+
                cont5+ " bilettes de 5\n"+
                cont2+ " monedas de 2 euros\n" +
                cont1+ " monedas de 1 euro \n"+
                cont05+ " monedas de 50 centimos \n"+
                cont02+ " monedas de 20 centimos\n"+
                cont01+ " monedas de 10 centimos\n"+
                cont005+ " monedas de 5 centimos\n"+
                cont002+ " monedas de 2 centimos\n"+
                cont001+ " monedas de 1 centimo"

        );
    }

    public static void main(String[] args) {
        Cajero cajero1=new Cajero();
        cajero1.retirarinero(0.9F);
        cajero1.retirarinero(0.87F);
        cajero1.retirarinero(0.88F);
        cajero1.retirarinero(4753.88F);
        cajero1.retirarinero(353.64F);



    }
}
