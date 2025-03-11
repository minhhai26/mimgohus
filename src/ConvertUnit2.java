// Viết chương trình đổi đơn vị từ km -> dặm
class ConvertUnit2 {
    public static void main(String[] args) {

        double x = Double.parseDouble(args[0]);
        double y = x * 1000 / 1609; // Lưu ý: (1 dặm = 1609 m)

        System.out.printf("%.2f\n", y); // Sử dụng printf để ép kiểu in
    }
}