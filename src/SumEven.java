// Chương trình tính tổng các số chẵn nhỏ hơn n, với n được nhập từ đối dòng lệnh
class SumEven {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                sum += i;
        }

        System.out.println(sum);
    }
}