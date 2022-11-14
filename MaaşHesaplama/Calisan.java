public class Calisan {
    String isim;
    int maas;
    int haftaliksaat =0;
    int baslangic=0;

    Calisan(String isim,int maas, int haftaliksaat, int baslangic){

        this.isim=isim;
        this.maas=maas;
        this.haftaliksaat=haftaliksaat;
        this.baslangic=baslangic;

    }
    void calisanlist(){




    }
    int vergihesap(int maas){
        int vergi=0;
        if(this.maas>1000){
            vergi =(maas*3)/100;
            return vergi;
        } else if (this.maas<1000 && this.maas>0){
            return vergi;
        }else
            return 0;

    }
    int bonus(int haftaliksaat){
        int bonusucret=0;
        if(this.haftaliksaat>40){
            haftaliksaat-=40;
            bonusucret=haftaliksaat*30;
            return bonusucret;

        } else if (this.haftaliksaat<40) {
            bonusucret=0;
            return 0;
        }else
            return 0;

    }
    int zamyil(int baslangic){
        int year=2021;
        int zam;
        int calismayili;
        calismayili=year-baslangic;
        if(calismayili<10){
            zam=(maas*5)/100;
            return zam;
        } else if (calismayili>=10 && calismayili<20) {
            zam =(maas*10)/100;
            return zam;
        }
        else if(calismayili>=20){
            zam=(maas*15)/100;
            return zam;
        }else

            return 0;
    }

    void tostring(){
        int topmaas;
        System.out.println("İsmi : "+this.isim);
        System.out.println("Maaşı : "+this.maas);
        System.out.println("Çalışma Saati : "+this.haftaliksaat);
        System.out.println("Başlangıç yılı : "+this.baslangic);
        System.out.println("Çalışanın verdiği vergi : "+ vergihesap(maas));
        System.out.println("Çalışanın aldığı bonus ücret : "+ bonus(haftaliksaat));
        System.out.println("Çaloşanın aldığı zam : "+ zamyil(baslangic));
        topmaas=this.maas-vergihesap(maas)+bonus(haftaliksaat)+zamyil(baslangic);
        System.out.println("Toplam alınan maaş = "+topmaas);



    }


}
