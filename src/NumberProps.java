// Hoàn thiện hàm kiểm tra số nguyên tố isPrime
// Sinh viên có thể viết thêm các hàm khác nếu cần, tuy nhiên cần giữ nguyên khuôn mẫu hàm isPrime
// Số nguyên tố là số chia hết cho 1 và chính nó
public class NumberProps {

    //Sinh viên hoàn thiện hàm isPrime, giữ nguyên nguyên mẫu hàm
    public static boolean isPrime(int k) {
        if (k < 2) return false;
        for (int i = 2; i <= Math.sqrt(k); i++) {
            if (k % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        boolean c = isPrime(k);
        System.out.println(c);
    }
}
