class AverageEvens {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double sum = 0;
        double countEven = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                countEven++;
                sum += i;
            }
        }
        double average = sum / countEven;
        System.out.println(average);
    }
}