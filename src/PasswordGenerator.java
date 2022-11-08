import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the password");
        int length = sc.nextInt();
        System.out.println(generatepassword(length));
    }

    public static char[] generatepassword(int length) {
        System.out.println("Your Password");
        String charCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String num = "134567890";
        String symbols = "!@#$%^&*+_-=?/~<>";

        String passSymbols = charCaps + chars + num + symbols;
        Random random = new Random();

        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            password[i] = passSymbols.charAt(random.nextInt(passSymbols.length()));
        }
        return password;
    }
}
