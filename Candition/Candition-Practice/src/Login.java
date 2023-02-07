import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String correntName = "Admin";
        String correntPassword = "Admin123";
        String username, password, newPass;
        char answer;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Username daxil edin: ");
        username = scanner.nextLine();
        System.out.println("Password daxil edin: ");
        password = scanner.nextLine();

        if (username.equals(correntName) && (password.equals(correntPassword))) {
            System.out.println("Uğurlu giriş!");
        } else {
            System.out.println("Username və ya password yanlışdır!");
            System.out.println("Şifrənizi sıfırlamaq istəyirsiniz? " +
                    "\n  Cavabınız: bəli-dirsə 'B' " +
                    "\n  Cavabınız: xeyr-dirsə 'X' ");
            answer = scanner.next().charAt(0);
            switch (answer) {
                case 'B':
                    System.out.println("Yeni şifrəni daxil edin:");
                    newPass = scanner.nextLine();
                    if (newPass == correntPassword && newPass == password) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                    }
                    break;
                case 'X':
                    System.exit(0);
                    break;
                default:
                    System.out.println("Yanlış seçim etdiniz!");
            }
        }
    }
}
