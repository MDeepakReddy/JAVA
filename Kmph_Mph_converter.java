import java.util.Scanner;

public class converter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kilometers = scanner.nextDouble();
        double Kilometers = scanner.nextDouble();
        toMilesPerHour(kilometers);
        printConversion(Kilometers);
        scanner.close();
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        else {
            long rounded = Math.round(kilometersPerHour/1.609);
            System.out.println(rounded);
            return rounded;

        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
        else {
            long rounded = Math.round(kilometersPerHour/1.609);
            System.out.println(kilometersPerHour+" km/h = "+rounded+" mi/h");

        }

    }
}