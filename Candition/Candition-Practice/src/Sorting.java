import java.util.ArrayList;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {

        int length = Util.intInput("Sıralamaq istədiyiniz element sayını daxil edin:");
        List<Integer> intList = new ArrayList<>();
        int temp;

        for (int i = 0; i < length; i++) {
            intList.add(Util.intInput((i + 1) + " -ci elementi daxil edin:"));
        }

        for (int k=(length-1); k>=0; k--)
        {
            for(int j=1; j<=k; j++){
                if (intList.get(j-1)>intList.get(j)){
                    temp = intList.get(j-1);
//                    System.out.println(intList.indexOf(j-1));
//                    System.out.println(intList.indexOf(j));
                    intList.set(j-1, intList.get(j)) ;
                    intList.set(j, temp);
                }
            }
        }

        for (int value: intList) {
            System.out.print(value + " |");
        }
    }

}
