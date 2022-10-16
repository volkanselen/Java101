import java.util.Scanner;

public class SinifiGecme {

    public static void main(String[] args){
        int matematik, fizik, turkce, kimya, muzik;
        double ortalama;

        int ders_sayisi=0, toplamnot=0,gecme_notu=55;

        Scanner input=new Scanner(System.in);

        System.out.print("Matematik dersiniz giriniz : ");
        matematik=input.nextInt();
        if(matematik<0 || matematik>100){
            System.out.println("0 ile 100 arasında girilmeyen notlar ortalamaya dahil edilmez");

        }else {
            ders_sayisi+=1;
            toplamnot+=matematik;
        }
        System.out.print("Fizik dersiniz giriniz : ");
        fizik= input.nextInt();
        if( fizik<0 || fizik>100){
            System.out.println("0 ile 100 arasında girilmeyen notlar ortalamaya dahil edilmez");
        }else {

            ders_sayisi += 1;
            toplamnot += fizik;
        }
        System.out.print("Türkçe dersini giriniz : ");
        turkce= input.nextInt();
        if(turkce<0 || turkce>100){
            System.out.println("0 ile 100 arasında girilmeyen notlar ortalamaya dahil edilmez");
        }else{
            ders_sayisi+=1;
            toplamnot+=turkce;
        }
        System.out.print("Kimya dersini giriniz : ");
        kimya=input.nextInt();
        if(kimya<0 || kimya>100){
            System.out.println("0 ile 100 arasında girilmeyen notlar ortalamaya dahil edilmez");
        }else {
            ders_sayisi+=1;
            toplamnot+=kimya;

        }
        System.out.print("Müzik dersini giriniz : ");
        muzik=input.nextInt();
        if(muzik<0 || muzik>100){
            System.out.println("0 ile 100 arasında girilmeyen notlar ortalamaya dahil edilmez");
        }else{
            ders_sayisi+=1;
            toplamnot+=muzik;
        }

        System.out.println("Ortalamaya dahil edilen ders sayısı = "+ders_sayisi);

        ortalama = (toplamnot/ ders_sayisi);
        System.out.println("Ortalamanız = " +ortalama);
        if(ortalama>gecme_notu){

            System.out.println("Sınıfı geçtiniz");

        }else if((gecme_notu-10)<ortalama){
            System.out.println("Şartlı geçtiniz");

        }else System.out.println("Sınıfta kaldınız");




    }
}
