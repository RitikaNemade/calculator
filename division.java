import java.util.*;

class division {

    static double divide(double a, double b) {
        if (b == 0.0) {
            System.out.println("Can't divide by 0");
            return 0.0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        double a = sc.nextDouble();

        System.out.print("Enter divisor: ");
        double b = sc.nextDouble();

        double res = divide(a, b);
        System.out.printf("Result: %.2f%n", res);

        sc.close();
    }
}
