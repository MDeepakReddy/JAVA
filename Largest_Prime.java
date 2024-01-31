package one.com;

import java.util.Scanner;

public class Largest_Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int res = secondLargestPrime(arr);
		System.out.println(res);
		
	}
	public static boolean isPrime(int a) {
		int r = 0;
		for(int i = 1;i <= a;i++) {
			if(a % i == 0) {
				r++;
			}
			
		}
		if(r == 2) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static int secondLargestPrime(int[] values) {
		int[] k = new int[values.length];
		int temp,c = 0;
		for(int i = 0;i<values.length;i++) {
			boolean prime = isPrime(values[i]);
			if(prime == true) {
				k[c++] = values[i];
			}
		}
		for(int j = 0;j < values.length;j++) {
			for(int l=j+1;l<values.length;l++) {
				if(k[j]<k[l]) {
				    temp = k[j];
				    k[j] = k[l];
				    k[l] = temp;
				}
			}
		}
		//System.out.println(k[1]);
		return k[1];
	}

}
