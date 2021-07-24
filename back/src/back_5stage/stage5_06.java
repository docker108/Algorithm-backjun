package back_5stage;

import java.util.Scanner;

public class stage5_06 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt();
		
		int[] array = new int[start];
		
		
		for (int i = 0; i < array.length; i++) {
			
			String[] compare = sc.next().split("");
			int result = 0;
			int success = 0;
			
			for (int j = 0; j < compare.length; j++) {
				
				if(compare[j].equals("O")) {
					success++;
					result += success;
				}else if (compare[j].equals("X")){
					success = 0;
				}
				
			}
			array[i] = result;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		sc.close();
	} 
	
}
