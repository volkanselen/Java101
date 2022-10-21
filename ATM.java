
import java.util.Objects;
import java.util.Scanner;

public class ATM {

    public static void main(String[] args ){

        String username, password; //username = volkan, password = volkan1234
        int a,c,d,e=3, bakiye=10000;
        boolean kontrol=true;
        Scanner input=new Scanner(System.in);


        while(kontrol){
            System.out.print("Kullanıcı adını giriniz : ");
            username= input.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            password= input.nextLine();


            if ((!Objects.equals(username,"volkan")) || (!Objects.equals(password, "volkan1234"))){

                kontrol=true;
                e--;
                System.out.println("Hatalı giriş. Tekrar deneyiniz." + e +" giriş hakkınız kaldı : ");
                if(e==0){
                    System.out.println("Hesabınız bloke olmuştur, Banka ile iletişime geçiniz");
                    return;


                }
            }else break;
        }

        do{
            System.out.println("Yapmak istediğiniz işlemi seçiniz : ");
            System.out.println("Para çekme için 1'e basınız. ");
            System.out.println("Para yüklemek için 2'ye basınız. ");
            System.out.println("Bakiye sorgulamak için 3'e basınız. ");
            System.out.println("Bakiyenizin tamamını çekmek için 4'e basınız. ");
            System.out.println("Çıkmak için 5'e basınız.");
            a= input.nextInt();

            if(a==1){
                System.out.println("Tutar giriniz : ");
                c= input.nextInt();
                bakiye=bakiye-c;
                if(bakiye <0) {

                    System.out.println("Bakiyeniz yetersizdir. Tekrar deneyiniz !!! .");
                    continue;
                }
                if(c>5000){
                    System.out.println("Günlük en fazla 5 bin TL çekebilirsiniz, Tekrar deneyiniz !!!");
                    continue;
                }

                System.out.println("Mevcut bakiyeniz : "+ bakiye);
                break;
            }
            if (a==2){
                System.out.print("Tutar giriniz : ");
                c= input.nextInt();
                bakiye=bakiye+c;
                System.out.println("Mevcut bakiyeniz : "+ bakiye);
                break;
            }
            if(a==3){
                System.out.println("Mevcut bakiyeniz : "+ bakiye);
                break;
            }
            if(a==4){

                bakiye=bakiye-bakiye;
                System.out.println("Paranızın tamamı çekilmiştir, mevcut bakiyeniz : "+ bakiye);
                break;
            }




        }while (a!=5);

        System.out.println("İyi günler...");
        return;







    }
}
