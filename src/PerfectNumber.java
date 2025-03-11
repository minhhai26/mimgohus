//Viet chuong trinh kiem tra mot so nguyen duong n nhap tu ban phim co phai la so hoan hao hay khong
import java.util.Scanner;

class PerfectNumber {
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        if (sum == n)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPerfect(n));
    }

}