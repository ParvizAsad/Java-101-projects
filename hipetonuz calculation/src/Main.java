import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a = doubleInput("a");
        double b = doubleInput("b");
        double c= Math.sqrt(a*a+b*b);
        System.out.println("Hipetonuz: "+c);
        double u = (a+b+c)/2;

        double d =Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Sahəsi: "+d);
    }

    static double doubleInput(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(text + " inputunu daxil edin: ");
        double returnValue = scanner.nextDouble();
        return returnValue;
    }
}
