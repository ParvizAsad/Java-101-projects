public class AdvancedCalculation {
    public static void main(String[] args) {
        int cmd;
        do {
            cmd = Util.intInput("Bir əməliyyat seçiniz:" +
                    "\n 1. Toplama" +
                    "\n 2. Çıxma" +
                    "\n 3. Vurma" +
                    "\n 4. Bölme" +
                    "\n 5. Üsdü qüvvət" +
                    "\n 6. Faktoriyal" +
                    "\n 7. Mod almaq" +
                    "\n 8. Dördbucağın sahəsin" +
                    "\n 0. Çıxış" +
                    "Əməliyyatın kodu: ");


            switch (cmd) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println(plus());
                    break;
                case 2:
                    System.out.println( minus());
                    break;
                case 3:
                    System.out.println( times());
                    break;
                case 4:
                    System.out.println(devide());
                    break;
                case 5:
                    System.out.println(  power());
                    break;
                case 6:
                    System.out.println( factorial());
                    break;
                case 7:
                    System.out.println(mod());
                    break;
                case 8:
                    System.out.println(area());
                    break;
                default:
                    System.out.println("Yanlış komanda daxil etdiniz! ");
                    break;


            }


        } while (cmd != 0);
    }

    static double plus() {
        double a = Util.intInput("1-ci ədədi daxil edin: ");
        double b = Util.intInput("2-ci ədədi daxil edin: ");
        return a + b;
    }

    static double minus() {
        double a = Util.intInput("1-ci ədədi daxil edin: ");
        double b = Util.intInput("2-ci ədədi daxil edin: ");
        return a - b;
    }

    static double times() {
        double a = Util.intInput("1-ci ədədi daxil edin: ");
        double b = Util.intInput("2-ci ədədi daxil edin: ");
        return a * b;
    }

    static double devide() {
        double a = Util.intInput("1-ci ədədi daxil edin: ");
        double b = Util.intInput("2-ci ədədi daxil edin: ");
        return a / b;
    }

    static double power() {
        double a = Util.intInput("1-ci ədədi daxil edin: ");
        double b = Util.intInput("2-ci ədədi daxil edin: ");
        return Math.pow(a, b);
    }

    static double factorial() {
        double a = Util.intInput("Ədədi daxil edin: ");
        double b = 1;
        for (int i = 1; i < a; i++) {
            b *= i;
        }

        return b;
    }

    static double mod() {
        double a = Util.intInput("1-ci ədədi daxil edin: ");
        double b = Util.intInput("2-ci ədədi daxil edin: ");
        return a % b;
    }

    static double area() {
        double a = Util.intInput("Uzunluq: ");
        double b = Util.intInput("En: ");

        return a * b;

    }
}
