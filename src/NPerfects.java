// Bài thực hành in ra các số hoàn hảo nhỏ hơn n với n được nhập từ bàn phím
//Kết quả in trên một dòng các số được cách nhau bởi một dấu cach

import java.util.Scanner;

class NPerfects {
    // Hàm kiểm tra số n có phải là số hoàn hảo hay không
    // nếu n là số hoàn hảo thì trả về true, ngược lại trả về false
    static boolean isPerfect(int n) {
        //begin edit
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        if (sum == n) return true;
        else return false;
        //end edit
    }

    // hàm in ra các số hoàn hảo nhỏ hơn n trên cùng dòng
    static void printNPerfect(int n) {
        for (int j = 1; j < n; j++)
            if (isPerfect(j)) {
                System.out.print(j + " ");
            }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printNPerfect(n);
    }
}