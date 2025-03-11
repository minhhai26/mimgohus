//Bài thực hành  lập trình In ra n số nguyên tố đầu tiên với n được nhập từ bàn phím. 
//kết quả in ra trên 1 dòng, các số cách nhau bởi 1 dấu cách
import java.util.Scanner;

class NPrimes {

    public static boolean Check(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int count = 0;
        int check = 2;

        while (count < num) {
            if (Check(check)) {
                System.out.print(check + " ");
                count++;
            }
            check++;
        }
    }
}