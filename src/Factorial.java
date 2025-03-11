import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int result = 1;

        if (n % 2 == 0) { // Nếu n là số chẵn, tính tích các số chẵn từ 2 đến n
            for (int i = 2; i <= n; i += 2) {
                result *= i;
            }
        } else { // Nếu n là số lẻ, tính tích các số lẻ từ 1 đến n
            for (int i = 1; i <= n; i += 2) {
                result *= i;
            }
        }

        System.out.println(result);
    }
}
