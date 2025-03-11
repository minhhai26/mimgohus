// Bài lập trình kiểm tra một số có là số siêu nguyên tố không
// kết quả in ra True nếu số là số siêu nguyên tố, False nếu số không là số siêu nguyên tố
import java.util.Scanner;
class SuperPrime {
    //Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (!isPrime(n)) {
            System.out.println("False");
            return;
        }
        //Kiểm tra từng thành phần của số
        while (n > 0) {
            if (!isPrime(n)) {
                System.out.println("False");
                return;
            }
            n /= 10; // Cắt bỏ chữ số bên phải
        }
        System.out.println("True");
    }
}