public class LeapYearCalculation {

    public static void main(String[] args) {
        int year=Util.intInput("Il daxil edin: ");
        int mod = year%4;

        if (mod==0){
            System.out.println("Bu il sıçrayış ilidir. ");
        }
        else {
            System.out.println("Bu il sıçrayış ili deyildir. ");
        }

    }

}
