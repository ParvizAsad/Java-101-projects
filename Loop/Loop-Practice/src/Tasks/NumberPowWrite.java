package Tasks;

import java.util.ArrayList;
import java.util.List;

public class NumberPowWrite {
//    Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

    public static void main(String[] args) {
        int n=Util.intInput("Mehdudiyyət şərtini daxil edin: ");
        int pow=Util.intInput("qüvvəti daxil edin: ");

        List<Integer> powList= new ArrayList<>();

        for(int i =1; i<=n; i*=pow){
            powList.add(i);
        }
        System.out.println(n + " -ə qədər " + pow+  " -nin qüvvəti olan " + powList.size() + " ədədin siyahısı : ");
        for (int num :powList ) {
            System.out.println(num);
        }

    }
}
