import java.util.Scanner;

public class PalindromSayi{


    static boolean isPol(int number) {


        int deger = number, tersnumber=0, sonnumber;
        while(deger!=0){
            sonnumber=deger%10;
            tersnumber=(tersnumber*10)+sonnumber;
            deger/=10;


        }
        if(number==tersnumber) {
            System.out.println("Pol sayi");
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args){
        System.out.println(isPol(101));






    }

}

