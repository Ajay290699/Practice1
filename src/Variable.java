import java.util.Scanner;

public class Variable{
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int y = sc.nextInt();
        int[] num = new int[y];
        System.out.println("enter th e elemet");
        for (i = 0; i < y; i++) {
            num[i] = sc.nextInt();
        }
        for (int j = 0; j < num.length ; j++) {
            System.out.print(num[j]+" ");
        }
        System.out.println();
        for (int k = num.length-1; k >=0 ; k--) {
            System.out.print(num[k]+" ");
        }
    }
}