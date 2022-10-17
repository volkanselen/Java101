import java.util.Scanner;


public class FlightTicket {
    public static void main(String[] args){

        int km, yas, tip ;
        double ntutar,yasindirimi,tipindirim, mesafe =0.10;





        Scanner input=new Scanner(System.in);

        System.out.print("Kaç km gideceksiniz ?");
        km=input.nextInt();
        ntutar= (km*mesafe);


        System.out.print("Kaç yaşındasınız");
        yas=input.nextInt();

        System.out.print("Tek yön = 1, Gidiş-dönüş = 2");
        tip=input.nextInt();


        if( (km >0 && yas>0) && (tip ==1 || tip ==2)) {

            if (yas < 12) {
                yasindirimi = ntutar * 0.50;

            } else if (yas >= 12 && yas <= 24) {

                yasindirimi = ntutar * 0.10;
            } else if (yas > 65) {
                yasindirimi = ntutar * 0.30;
            } else
                yasindirimi = 0;
            System.out.println("Yaş indiriminiz"+yasindirimi);

            ntutar = ntutar - yasindirimi;

            if (tip == 2) {

                tipindirim = (ntutar * 0.20);
                System.out.println("Gidiş-Dönüş indiriminiz"+tipindirim);
                ntutar= ntutar-tipindirim;

            }else
                tipindirim=0;




        }


        System.out.println("Ücretiniz"+ntutar);






    }
}
