public class RecursiveFibonacci {
    public static void main(String[] args) {
        int n = Util.intInput("Element sayini daxil edin: ");

        System.out.println(recursiveMethod(n));
    }
    static int recursiveMethod(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return recursiveMethod(n - 1) + recursiveMethod(n - 2);
    }
}
