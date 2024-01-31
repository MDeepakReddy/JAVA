import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = scanner.nextInt();
        isLeapYear(year);
        scanner.close();

    }

    public static boolean isLeapYear(int year) {
        if((year > 0)&&(year < 9999)){
            if(year%4 == 0){
                if(year%100 == 0){
                    if(year%400 == 0){
                        System.out.println("true");
                        return true;
                    }
                    else{
                        System.out.println("false");
                        return false;
                    }
                }
                else{
                    System.out.println("true");
                    return true;
                }
            }
            else{
                System.out.println("false");
                return false;
            }
        }
        else{
            System.out.println("Invalid entry");
            return false;
        }

    }
}
