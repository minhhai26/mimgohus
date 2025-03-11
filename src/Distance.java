// Chuong trinh in ra khoang cach cua 2 diem
class Distance {
    public static void main(String[] args) {
        // Nhập vào 4 số thực x1, y1, x2, y2 từ đối dòng lệnh
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        // Tính  và in ra khoảng cách Euclid giữa hai điểm (x1, y1) và (x2, y2).
        double result = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        //Kết quả được làm tròn đến 2 số phần thập phân, sử dụng công thức Math.round(a * 100.0) / 100.0 để làm tròn số a
        System.out.println(Math.round(result * 100.0) / 100.0);
    }
}