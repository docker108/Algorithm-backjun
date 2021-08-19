package back.stage5;

import java.util.Scanner;

public class stage5_05 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt();
		
		double MAX = 0;
		double RESULT = 0;
		
		double[] array = new double[start];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextDouble();
			
			if(MAX < array[i]) {
				MAX = array[i];
			}
		}
		for (int i = 0; i < array.length; i++) {
			array[i] = (array[i]/MAX)*100;
			RESULT += array[i];
		}
		
		System.out.println(RESULT/start);
		
		sc.close();
	} 
	
}

