class RightTriangle {
    static boolean isTriangle(double a, double b, double c) {
        return ((a + b) > c && (a + c) > b && (b + c) > a);
    }

    public static void main(String[] args) {

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        boolean result = isTriangle(a, b, c);

        System.out.println(result);
    }
}