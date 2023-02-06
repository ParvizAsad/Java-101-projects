import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
//    Armut : 2,14 TL
//    Elma : 3,67 TL
//    Domates : 1,11 TL
//    Muz: 0,95 TL
//    Patlıcan : 5,00 TL

    public static void main(String[] args) {
        Product armud = new Product(1, "Armud", 2.14);
        Product elma = new Product(2, "Elma", 3.67);
        Product domates = new Product(3, "Domates", 1.11);
        Product muz = new Product(4, "Muz", 0.95);
        Product patlıcan = new Product(5, "Patlıcan", 5.00);
        double totalPrice = 0;
        List<Product> products = new ArrayList<Product>();
        products.add(armud);
        products.add(elma);
        products.add(domates);
        products.add(muz);
        products.add(patlıcan);
        double kg;
        for (Product product : products) {
            kg = doubleInput(product.name + " neçə kg?");
            totalPrice += kg * product.price;
        }
        System.out.println("Toplam: " + totalPrice + " Tl");


    }

    static double doubleInput(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        double cmd = scanner.nextInt();
        return cmd;
    }


}