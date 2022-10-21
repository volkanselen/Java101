import java.util.Scanner;

public class KalansizSayilariToplama{
    public static void main(String[] args){
        int a,toplam=0;
        Scanner input=new Scanner(System.in);

        do {
            System.out.print("Çift bir sayı giriniz : ");
            a=input.nextInt();
            if ((a % 2 == 0) && (a %4==0) ) {

                toplam += a;


            }
        }while(a%2==0);

        System.out.println("2 ve 4 ün katları olan sayıların toplamı : " +toplam);








        }






    }



