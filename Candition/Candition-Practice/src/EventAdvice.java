import java.util.Scanner;

public class EventAdvice {
    public static void main(String[] args) {

//        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
//        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
//        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
//        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

        int answer = Util.intInput("Temperaturu daxil edin: ");
        if (answer<=5){
            System.out.println("Kayak");
        } else if (answer>5 && answer<=15) {
            System.out.println("Sinema");
        } else if (answer>15 && answer<=25) {
            System.out.println("Piknik");
        } else if (answer>25) {
            System.out.println("Yüzme");
        }
        else {
            System.out.println("Yanlış dəyər daxil etdiniz!");
        }


    }
}
