package Tasks;

public class FindEvenNumber {
//    Ödev
//    Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
//    3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
    public static void main(String[] args) {
        int number = Util.intInput("Bir rəqəm daxil edin: ");
        int sum=0;
        int count=0;
        double average=0;

        for(int i=1; i<=number; i++){
            if (i%3==0 && i%4==0){
                sum+=i;
                count++;
            }
        }
        average=sum/count;
        System.out.println("Ortalama: "+ average);
    }
}
