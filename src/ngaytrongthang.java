/**
 * Chương trình tính số ngày trong một tháng của một năm với
 * tháng/năm là các số nguyên tương ứng nhận từ đối dòng lệnh
 * Bổ sung thêm các hàm/phương thức khác nếu cần thiết
 */
public class ngaytrongthang {

    public static int SoNgay(int month, int year) {
        // Editing begin here
        if (month < 1 || month > 12 || year < 0)
            return 0;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 31;
            }
            case 4, 6, 9, 11 -> {
                return 30;
            }
            case 2 -> {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            }
            default -> {
                return 0;
            }
        }

    }

    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);
        int result = SoNgay(month, year);
        if (result == 0) {
            System.out.println("Incorrect!");
        } else {
            System.out.println(result);
        }
    }
}