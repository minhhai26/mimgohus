/**
 * Chương trình tìm phân số tối giản với đầu vào là tử số và mẫu số kiểu int được nhập qua đối dòng lệnh.
 * Chương trình tính và in ra kết quả dạng N/D (Ví dụ: Đầu vào: 4  18, in ra: 2/9)
 * Cần giữ lại các phương thức trong khung dưới đây, có thể bổ sung thêm các hàm/phương thức khác nếu cần
 **/
public class SimplifyFrac {

    // Tính và in ra phân số tối giản dưới dạng N/D
    public static void printSimplest(int Nume, int Denom) {
        // Đảm bảo mẫu số luôn dương để định dạng chuẩn
        if (Denom < 0) {
            Nume = -Nume;
            Denom = -Denom;
        }

        // Tìm ước chung lớn nhất để rút gọn
        int G = UCLN(Math.abs(Nume), Math.abs(Denom));

        // Rút gọn phân số
        int n = Nume / G;
        int d = Denom / G;

        System.out.println(n + "/" + d);
    }

    // Tìm ước chung lớn nhất bằng thuật toán Euclid
    public static int UCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String args[]) {
        // Đọc dữ liệu từ dòng lệnh
        int Nume = Integer.parseInt(args[0]);
        int Denom = Integer.parseInt(args[1]);

        // Gọi hàm in phân số tối giản
        printSimplest(Nume, Denom);
    }
}