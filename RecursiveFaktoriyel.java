import java.util.Scanner;

public class RecursiveFaktoriyel {

    static int faktoriyel(int a){

        if(a==1)
            return 1;

        else;
        System.out.println(a);
        return a*faktoriyel(a-1);

    }

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a;
        System.out.println("Bir sayi giriniz");
        a= scan.nextInt();
        System.out.println(faktoriyel(a));






    }

}

