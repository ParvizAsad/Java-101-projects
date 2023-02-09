public class EvenCalculation {
//  Ödev
//  Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
//  girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

    public static void main(String[] args) {
        int num;
        int mod;
        int sum = 0;
        do {
            num = Util.intInput("Bir rəqəm daxil edin: ");
            mod = num % 2;
            if (num % 2 == 0 && num % 4 == 0) {
                sum += num;
            }
        } while (mod == 0);
        System.out.println("Total: " + sum);
    }
}
