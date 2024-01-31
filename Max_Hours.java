package one.com;
import java.util.*;

public class Max_Hours{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int[] hours = new int[n];
		int[] dmg = new int[n];
		for(int i=0;i<n;i++) {
			hours[i] = sc.nextInt();
		}
		for (int j=0;j<n;j++) {
			dmg[j] = sc.nextInt();
		}
		sc.close();
		
		int output = maximumhours(n,c,hours,dmg);
		System.out.print(output);
		
	}
	
	public static int maximumhours(int n, int c, int[] hours, int[] dmg) {
		int[] out = new int[n];int temp;
		for(int i=0;i<n;i++) {
			int[] dmg1 = new int[n];
			for(int k=0;k<n;k++) {
				dmg1[k] = dmg[k];
			}
			for(int j=0;j<c;j++) {
				dmg1[j+i]=0; 
			}
			for(int l=0;l<n;l++) {
				if(hours[l]*dmg1[l] == 0){
					out[i] += hours[l];
				}
			}
			
		}
		for(int m=0;m<n;m++) {
			for(int o=1;o<n;o++) {
				if(out[m]<out[o]) {
					temp = out[m];
					out[m] = out[o];
					out[o] = temp;
				}
				
			}
			
		}
		return out[0];
	}
	

}

