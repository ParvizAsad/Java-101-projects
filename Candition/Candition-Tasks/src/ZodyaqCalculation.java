public class ZodyaqCalculation {
    public static void main(String[] args) {
        int year = Util.intInput("Doğum ilinizi daxil edin: ");
        int mod = year % 12;
        switch (mod) {
            case 0:
                System.out.println("Meymun");
                break;
            case 1:
                System.out.println("Xoruz");
                break;
            case 2:
                System.out.println("It");
                break;
            case 3:
                System.out.println("Donuz");
                break;
            case 4:
                System.out.println("Siçan ");
                break;
            case 5:
                System.out.println("Öküz ");
                break;
            case 6:
                System.out.println("Kaplan ");
                break;
            case 7:
                System.out.println("Dovşan ");
                break;
            case 8:
                System.out.println("Əjdaha ");
                break;
            case 9:
                System.out.println("İlan");
                break;
            case 10:
                System.out.println("At");
                break;
            case 11:
                System.out.println("Qoyun");
                break;
            default:
                System.out.println("Yanlış deger");

        }
    }
}
