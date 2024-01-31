package one.com;

public class Array_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array_variable [] = new int[10];
		for(int i = 0;i<10;i++) {
			array_variable[i] = i/2;
			array_variable[i]++;
			System.out.print(array_variable[i]+" ");
			i++;
		}
		double num[] = {5.5,10.1,11};
		double result = 0;
		for(int i = 0;i<3;i++) {
			result = result+num[i];
		}
		System.out.println("\n"+result/4);
		int var1 = 0;
		int var2 = 0;
		
		System.out.println(var1>var2);
		
		StringBuffer s1 = new StringBuffer("TcsNextStep");
		s1.setCharAt(1,'r');
		s1.setCharAt(7,'c');
		System.out.println(s1);

	}

}
