// Viết chương trình tính exp theo công thức khai triển Taylor được mô tả trong file Đề bài Bai3_exp.
// Bài khó quá ạ huhu
public class Exp {
    // Hàm tính e^x bằng khai triển Taylor
    public static double expTaylor(double x, int terms) {
        double sum = 1.0; // Giá trị khởi đầu là 1 (tương ứng với số hạng đầu tiên)
        double term = 1.0; // Biến lưu số hạng hiện tại

        for (int i = 1; i < terms; i++) {
            term *= x / i; // Tính số hạng tiếp theo
            sum += term;   // Cộng dồn vào tổng
        }

        return sum;
    }

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        int n = Integer.parseInt(args[1]);
        double result = expTaylor(x, n);
        System.out.println(Math.round(result * 100.0) / 100.0);

    }
}