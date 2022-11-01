import java.util.Scanner;

public class StarPatternProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of row for getting the pattern of star");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int k = 1; k <= num; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
