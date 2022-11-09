import java.util.Scanner;

public class RecursiveUsAlma {

    static int usal(int a,int b){
        if(a==1) {
            System.out.println("1 sayısının kuveeti her zaman 1 olur ! ");
            return 1;
        }

        else if (b==0) {
            System.out.println("Bir sayının 0. kuvveti her zaman 1 dir");
            return 1;
        }
        else;
        return a*usal(a,b-1);




    }

    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int a;
        int b;
        System.out.print("Bir sayı giriniz : ");
        a= input.nextInt();
        System.out.print("Girdiğniz sayının kaç üssü olsun ? ");
        b=input.nextInt();
        System.out.print("Sonuç : " +usal(a,b));
    }
}
