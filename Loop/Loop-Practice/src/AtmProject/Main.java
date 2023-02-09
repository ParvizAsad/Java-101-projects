package AtmProject;

public class Main {
    public static void main(String[] args) {

        int right = 3;
        boolean activity;
        double balance = 1500;
        while (right > 0) {
            String username = Util.stringInput("Adınızı daxil edin: ");
            String password = Util.stringInput("Parolunuzu daxil edin: ");
            activity = login(username, password);
            if (activity) {
                System.out.println("Uğurlu giriş!");
                System.out.println("Əməliyatlar" +
                        "\n1. Hesaba pul əlavə etmək" +
                        "\n2. Hesabdan pul çıxarmaq" +
                        "\n3. Balasım" +
                        "\n3. Çıxış et");
                int cmd = Util.intInput("Əməliyyatın kodunu daxil edin: ");
                switch (cmd) {
                    case 1:
                        double addMoney = Util.intInput("Daxil etmək istədiyiniz məbləği daxil edin: ");
                        balance += addMoney;
                        break;
                    case 2:
                        double removeMoney = Util.intInput("Çıxartmaq istədiyiniz məbləği daxil edin: ");
                        balance -= removeMoney;
                        break;
                    case 3:
                        System.out.println("Balansınız: " + balance);
                        break;
                    case 4:
                        System.out.println("Çıxış edildi!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Error!");
                }
            } else if (!activity) {
                --right;
                System.out.println("Ad və ya parol yanlışdır!");
                if (right == 0) {
                    System.out.println("Hesabınız bloklanıb. Bankla əlaqə saxlayın!");
                } else {
                    System.out.println("Qalan haqqınız: " + right);
                }
            }

        }

    }

    static boolean login(String username, String password) {
        if (username.equals("Admin") && password.equals("Admin123")) {
            return true;
        } else {
            return false;
        }
    }

}
