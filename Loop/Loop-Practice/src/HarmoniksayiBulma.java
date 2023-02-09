public class HarmoniksayiBulma {
    public static void main(String[] args) {
        int n= Util.intInput("Sayini daxil eidn: ");
        double sum=0;
        double temp;

        for (double i=1; i<=n;i++){
           sum+=(1/i);
        }
        System.out.println(sum);

    }
}
