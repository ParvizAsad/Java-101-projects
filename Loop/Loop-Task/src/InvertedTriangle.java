public class InvertedTriangle {
    public static void main(String[] args) {
        int n = Util.intInput("Mərtəbə sayini daxil edin:");
        int star = n;
        int temp;
        int mod=0;

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
