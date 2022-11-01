package Recursion;

import java.util.Scanner;

public class RecusrionFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to get factorial");
        int num = sc.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial of " + num + " =" + fact);
    }

    public static long factorial(int num) {
        if (num >= 1) {
            return num * factorial(num - 1);
        }
        return 1;
    }
}
