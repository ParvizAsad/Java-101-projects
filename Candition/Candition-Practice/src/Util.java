import java.util.Scanner;

public class Util {


    static int intInput(String text){
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        int input = scanner.nextInt();
        return input;
    }

    static String stringInput(String text){
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        String input = scanner.nextLine();
        return input;
    }

    static double doubleInput(String text){
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
         double input= scanner.nextDouble();
        return input;
    }

    static char charInput(String text){
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        char input = scanner.next().charAt(0);
        return input;
    }

}
