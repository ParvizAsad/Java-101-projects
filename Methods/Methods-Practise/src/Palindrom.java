

public class Palindrom {
//    Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle
//    aynı olan sayılardır.
//    Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
    public static void main(String[] args) {
     int num = Util.intInput("Yoxlamaq istədiyiniz ədədi daxil edin:");
        if (num==reverseNumber(num)){
            System.out.println("Palindrom sayidir!");
        }
        else{
            System.out.println("Palindrom sayi deyildir!");
        }

    }

    static int reverseNumber(int a){
        int mod=0;
        int temp=0;

        while (a!=0){//123
            mod=a%10;//3 2 1
            temp=temp*10+mod;//0+3 3*10+2 32*10+1
            a=a/10;// 12 1
        }

        return temp;

    }



}
