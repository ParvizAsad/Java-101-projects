public class AsalSayiBulma {
    public static void main(String[] args) {
        int n=Util.intInput("Ədəd daxil edin: ");
        int count=0;

        for (int i=1;i<=n; i++){
            if (n%i==0){
                count++;
            }
        }
        if (count>2){
            System.out.println("Asal sayi deyildir");
        }
        else {
            System.out.println("Asal sayidir!");
        }


    }
}
