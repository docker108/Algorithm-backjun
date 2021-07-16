package back_3stage;

import java.util.Scanner;

public class stage3_05 {
	
	public static void main(String[] args) {
		
		// 순서대로 숫자 찍기
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		
		
		
		sc.close();
	}

}
