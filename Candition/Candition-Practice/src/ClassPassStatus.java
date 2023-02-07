import java.util.Scanner;

public class ClassPassStatus {

    public static void main(String[] args) {
        double Matematik, Fizik, Türkçe, Kimya, Müzik;

        Matematik = intInput("Matematik Puanını giriniz:");
        Fizik = intInput("Fizik Puanını giriniz:");
        Türkçe = intInput("Türkçe Puanını giriniz:");
        Kimya = intInput("Kimya Puanını giriniz:");
        Müzik = intInput("Müzik Puanını giriniz:");
        double sum = (Matematik + Fizik + Türkçe + Kimya + Müzik);
        double average = sum / 5;

        String s = (average > 55) ? "Təbriklər keçdiniz!" : "Keçmədiniz!";
        System.out.println(s + " Sizin ortalama balınız: " + average);

    }

    static double intInput(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        double input = scanner.nextDouble();
        if (input > 100 && input < 0) {
            System.out.println("Belə bir puan ola bilməz!");
            input = 0;
        }
        return input;
    }


}
