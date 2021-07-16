package back_3stage;

import java.util.Scanner;

public class stage3_04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 효율성
		int num = sc.nextInt();
		int[] array = new int[num];
		
		for (int i = 0; i < num; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			array[i] = a+b; 
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		
		sc.close();
	}

}
