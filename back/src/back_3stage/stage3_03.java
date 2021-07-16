package back_3stage;

import java.util.Scanner;

public class stage3_03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int num = sc.nextInt();
		int temp = 0;
		
		for (int i = 1; i <= num; i++) {
			
			temp += i;
		}
		System.out.println(temp);
		
		
		
		sc.close();
	}

}
