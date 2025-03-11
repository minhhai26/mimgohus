//Viết chương trình cho phép đọc 3 tham số từ đối dòng lệnh và trả về kết quả là true nếu 3 giá trị bằng nhau và là false nếu ngược lại.
// - Chú ý giá trị của tham số là kiểu xâu ký tự (String) chứ không bắt buộc phải là số.

class TripleEquals {
    public static void main(String[] args) {

        String a = args[0];
        String b = args[1];
        String c = args[2];
        boolean s = a.equals(b) && b.equals(c) && a.equals(c);

        System.out.println(s);
    }
}