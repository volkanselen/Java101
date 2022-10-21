import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args){
        int a,b,faktoriyel=1;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        a =input.nextInt();

        for (b=a;b>0;b--){

            faktoriyel*=b;

        }
        System.out.print(a+" Sayısının Faktoriyeli : "+faktoriyel);



    }
}
