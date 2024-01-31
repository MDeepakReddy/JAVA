import java.util.Scanner;

public class megabyteconverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Total No Of KiloBytes: ");
        int kilobytes = scanner.nextInt();
        printMegaBytesAndKiloBytes(kilobytes);
        scanner.close();

    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        else{
            int megabytes = kiloBytes / 1024;
            int remaining_kb = kiloBytes % 1024;
            System.out.println(kiloBytes+" KB = "+megabytes+" MB and "+remaining_kb+" KB");
        }
    }
}
