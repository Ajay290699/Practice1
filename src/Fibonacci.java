public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series : ");
        int n1 = 0, n2 = 1, n3, n = 10;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 2; i < n; i++) {
            n3 = n2 + n1;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }
}
