package Tasks;

public class Kombinasyon {
//    N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı
//    grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu
//    C(n,r) şeklinde gösterilir.
//
//    Java ile kombinasyon hesaplayan program yazınız.
//
//    Tasks.Kombinasyon formülü
//    C(n,r) = n! / (r! * (n-r)!)
    public static void main(String[] args) {

        int r = Util.intInput("r: ");
        int n = Util.intInput("n: ");
        int c=0;
        if (n>r){
            c=faktoryal(n)/(faktoryal(r)*faktoryal(n-r));
            System.out.println("C: "+c);
        }
        else {
            System.out.println("n r-dən böyük olmalıdır!");
        }



    }

    static int faktoryal(int a){
        int multiplication=1;
        for (int i =1; i<=a;i++){
            multiplication*=i;
        }
        return multiplication;
    }
}
