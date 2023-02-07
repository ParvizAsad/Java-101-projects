import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik
//        Aynı program içerisinde koşullu ifadeler kullanılarak,
//        eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" ,
//        küçük ise "Sınıfta Kaldı" yazsın.

        Scanner input = new Scanner(System.in);

        double matematik = doubleInput("Matematik");
        double fizik = doubleInput("Fizik");
        double kimya = doubleInput("Kimya");
        double türkçe = doubleInput("Türkçe");
        double tarih = doubleInput("Tarih");
        double müzik = doubleInput("Müzik");

        double result = (matematik + fizik + kimya + türkçe + tarih + müzik) / 6;
        var checkValue = result > 60;
        String results = checkValue ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(results);

    }

    static String textInput(String text) {
        Scanner textInput = new Scanner(System.in);
        System.out.println(text + " inputunu daxil edin: ");
        String returnInput = textInput.nextLine();
        return returnInput;
    }

    static double doubleInput(String text) {
        Scanner doubleInput = new Scanner(System.in);
        System.out.println(text + " inputunu daxil edin: ");
        double returnInput = doubleInput.nextDouble();
        return returnInput;
    }
}
