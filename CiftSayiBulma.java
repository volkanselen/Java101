import java.util.Scanner;

public class CiftSayiBulma {

    public static void main(String[] args){
        int a;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz");
        a=input.nextInt();
        // 2 ye bölünen tam sayıları yazdırma
        for(int b=0; b<a; b++){
            if(b%2==0){
                System.out.println(b);
            }

        }


        // 3 ve 4 e tam bölünen sayıları yazdırma \\
        for(int b=0; b<a; b++){
            if((b%3==0) || (b%4==0)){
                System.out.println(b);
            }

        }






    }
}
