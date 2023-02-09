package Tasks;

public class Armstrong {
    //    Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
    public static void main(String[] args) {
        int a = Util.intInput("Ədədi daxil edin: ");
        boolean check = true;
        int multip;
        int mod;
        int sum = 0;
        while (check) {
            if (a / 10 != 0) {
                sum += a % 10;
               a = a / 10;
            } else {
                sum += a % 10;
                check = false;
            }
        }
        System.out.println(sum);

    }
}
