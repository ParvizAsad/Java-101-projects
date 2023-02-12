public class RecursivePrime {
    public static void main(String[] args) {
     //  int a = Util.intInput(" ");
        int i = 2;
        int number=2;
        do {
             number = Util.intInput("Rəqəm daxil eidn ");
            if (isPrime(number,i)){
                System.out.println("Asal sayidir");
            }else {
                System.out.println("Asal sayi deyildir ");
            }
        }while (number>=0);

    }
    static boolean isPrime(int number , int i ){
        if(number<=2){
            return (number==2) ? true : false ;
        }
        if (number==i){
            return true;
        }
        if (number % i == 0 ){
            return false;
        }
        return isPrime(number,i+1);
    }

}
