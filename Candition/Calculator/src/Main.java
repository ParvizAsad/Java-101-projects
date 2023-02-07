import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("A ededini daxil edin:");
       double a = scanner.nextDouble();
        System.out.println("B ededini daxil edin:");
        double b = scanner.nextDouble();
        System.out.println("Operatoru daxil edin: ");
        System.out.println("Nümunə: +,-,*,/ ");
        char operator = scanner.next().charAt(0);
        double result=0;

    switch (operator){
        case '+':
            result=a+b;
            break;
        case '-':
            result=a-b;
            break;
        case '*':
            result=a*b;
            break;
        case '/':
            result=a/b;
            break;
    }

        System.out.println("Netice: " + result );

    }
}