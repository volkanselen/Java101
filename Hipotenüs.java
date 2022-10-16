import java.util.Scanner;

public class Hipotenüs {
    public static void main(String[] args){

        int kenar1, kenar2;
        double kenar3;
        Scanner input=new Scanner(System.in);

        System.out.print("Birinci Kenarı Giriniz");
        kenar1 =input.nextInt();
        System.out.print("İkinci Kenarı Giriniz");
        kenar2=input.nextInt();

        kenar3=Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
        System.out.print("Bu üçgenin Hipotenüsü " +kenar3+ " dır.");



    }

}
