public class MükemmelSayiBulma {

    public static void main(String[] args) {
        int n = Util.intInput("Rəqəm daxil edin:");
        int temp = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                temp += i;
            }
        }

        if (temp == n) {
            System.out.println("Mükemmel sayidir");
        } else {
            System.out.println("Mükemmel sayi deyildir");
        }

    }


}
