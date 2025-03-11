/**
 * Program to calculate the average of three (double) numbers
 * The arguments are entered from command line
 * Use the function Double.parseDouble(String strNumber) to
 * convert a string in (real) number format to its value
 */
class AverageThree {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double avg = (a + b + c) / 3;
        System.out.println(avg);
    }
}