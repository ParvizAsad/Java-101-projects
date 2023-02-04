import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kilonuzu daxil edin: ");
        double kg =scanner.nextDouble();
        System.out.println("Bounuzu(m ilə) daxil edin: ");
        double boy =scanner.nextDouble();
        double index=kg/(boy*boy);
        System.out.println( "Sizin bədən indexiniz: " + index);
    }
}