import java.util.Scanner;

public class MaximumFinder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers separated by spaces: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double biggestNumber = maximum(number1, number2, number3);

        System.out.println("Biggest number is: " + biggestNumber);

    }

    public static double maximum(double x, double y, double z) {

        double maximumValue = x;

        if(y > maximumValue) {
            maximumValue = y;
        }

        if(z > maximumValue) {
            maximumValue = z;
        }

        return maximumValue;

    }

}
