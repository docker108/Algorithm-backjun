package back_5stage;

import java.util.Scanner;

public class stage5_07 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt();
		
		double[] array = new double[start];
		
		int[] compare;
		
		for (int i = 0; i < array.length; i++) {
			
			double student = sc.nextDouble();
			compare = new int[(int)student];
			
			double average = 0;
			int total = 0;
			double result = 0;
			int count = 0;
			
			for (int j = 0; j < compare.length; j++) {
				
				compare[j] = sc.nextInt();
				total += compare[j];
				
			}
			
			average = total/student;
			
			for (int j = 0; j < compare.length; j++) {
				if(compare[j]>average) {
					count++;
				}
			}
			result = (double)Math.round((100/student*count)*1000) / 1000; 
			
			array[i] = result;
			
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(String.format("%.3f", array[i])+"%");
		}
		
		
		sc.close();
	} 
	
}