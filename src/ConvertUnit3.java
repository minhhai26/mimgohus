//Đổi nhiệt độ từ thang Celsius sang thang Fahrenheit
public class ConvertUnit3 {
    public static void main(String[] args) {

        double x = Double.parseDouble(args[0]);
        double y = x * 9 / 5 + 32; // Note: thang Fahrenheit theo công thức: C/5 = (F-32)/9

        System.out.printf("%.2f\n", y);
    }
}
