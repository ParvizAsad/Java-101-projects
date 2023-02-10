public class FibonachiSiralamasi {
    public static void main(String[] args) {
        int n = Util.intInput("Element sayini daxil edin: ");
        int temp;
        int[] fibonachiList = new int[n];
        fibonachiList[0] = 0;
        fibonachiList[1] = 1;
        if (n > 2) {
            for (int i = 2; i < n; i++) {
                fibonachiList[i] = fibonachiList[i - 1] + fibonachiList[i - 2];
            }
        }
        for (int j = 0; j < n; j++) {
            System.out.print(fibonachiList[j] + " ");
        }
    }


}
