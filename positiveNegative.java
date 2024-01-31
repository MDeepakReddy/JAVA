import java.util.Scanner;

public class positiveNegative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = scanner.nextInt();
        checkNumber(number);
        scanner.close();
    }
    public static void checkNumber(int number){
        if(number > 0){
            System.out.println("positive");
        }
        else if(number < 0){
            System.out.println("negative");
        }
        else if(number == 0){
            System.out.println("zero");
        }
    }
}
