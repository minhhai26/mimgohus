import java.util.Scanner;

class ArithSequence {
    public static void CSC(int a, int d, int n) {
        int Sn = a + d * (n - 1);
        System.out.println(Sn);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        CSC(a, d, n);
    }
}