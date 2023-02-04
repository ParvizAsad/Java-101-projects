import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        KDV Tutarı Hesaplayan Program
//        Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını
//        ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
//        (Not : KDV tutarını 18% olarak alın)
//        KDV'siz Fiyat = 10;
//        KDV'li Fiyat = 11.8;
//        KDV tutarı = 1.8;
//        Ödev
//        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
//                tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
        System.out.println("Tutarı daxil edin: ");
        Scanner scanner = new Scanner(System.in);
        double tutar = scanner.nextDouble();
        double kdvDahil;
        double kdv;
        if (tutar>0 && tutar<=1000){
            kdv =(tutar*18)/100;
            kdvDahil = tutar + kdv;
            System.out.println("KDV'siz Fiyat: " + tutar);
            System.out.println("KDV'li Fiyat: " + kdvDahil);
            System.out.println("KDV tutarı: "+kdv);
        } else if (tutar>1000) {
            kdv =(tutar*8)/100;
            kdvDahil = tutar + kdv;
            System.out.println("KDV'siz Fiyat: " + tutar);
            System.out.println("KDV'li Fiyat: " + kdvDahil);
            System.out.println("KDV tutarı: "+kdv);
        }
        else {
            System.out.println("Yanlış tutar girdiniz");
        }


    }
}
