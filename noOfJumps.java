import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int result = noOfJumps(n);
        System.out.println(result);
    }

    public static int noOfJumps(int n) {
        int jumps = 0;
        while(n>1){
            if(n%2 == 0){
                n = n/2;
                jumps++;
            }
            else{
                n = n-1;
                jumps++;
            }
        }
        return (jumps+1);

    }


}
