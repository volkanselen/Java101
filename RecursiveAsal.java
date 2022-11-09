import java.util.Scanner;
public class RecursiveAsal {
    static boolean asalsayi(int a,int i){


        if(i==a){

            System.out.print(a+"Asal sayıdır");
            return true;


        }

        if(i%a==0){

            System.out.println(a + "Asal sayı değildir");
            return false;



        }
        return asalsayi(a,i+1);






    }




    public static void main(String[] args){
        int a ,i=2;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz");
        a= input.nextInt();
        System.out.println(asalsayi(a,2));






    }
}
