class Triangle {
    static double getArea(double a, double b, double c) {
        return Math.sqrt(((a + b + c) / 2) * (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c));
    }

    public static void main(String[] args) {

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            double dienTich = getArea(a, b, c);
            System.out.println(dienTich);
        } else
            System.out.println("0");
    }
}