public class Fibonacci {

    static int n1 = 0, n2 = 1, n3, n = 10;

    public static void main(String[] args) {
        System.out.println("Fibonacci Series : ");
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 2; i < n; i++) {
            n3 = n2 + n1;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }


        /*System.out.println("\nUsing recursion Fibonacci Series :");
        Fibonacci fibonacci = new Fibonacci();
        System.out.print(n1+" "+n2+" ");
        fibonacci.usingRecursion(n-2);*/
    }

    public void usingRecursion(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + " ");
            usingRecursion(count - 1);
        }
    }
}
