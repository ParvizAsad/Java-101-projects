import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Alan Formülü : π * r * r;
//        Çevre Formülü : 2 * π * r;
//        Ödev
//        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
//        𝜋 sayısını = 3.14 alınız.
//        Formül : (𝜋 * (r*r) * 𝛼) / 360
        double pi = 3.14;
        double a;
        double r;
        double alan;
        double cevre;
double result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("a inputunu daxil edin: ");
        a=scanner.nextDouble();
        System.out.println("r inputunu daxil edin: ");
        r=scanner.nextDouble();
alan =pi*r*r;
cevre=2*pi*r;
result = (pi*(r*r)*a)/360;
        System.out.println("Alan: " + alan);
        System.out.println("Çevre: " + cevre);
        System.out.println("Daire diliminin alanı : " + result);
    }
}