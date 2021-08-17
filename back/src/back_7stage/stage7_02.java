package back_7stage;

import java.util.Scanner;

public class stage7_02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String value = sc.next();
		
		int total = 0;
		for (int i = 0; i < count; i++) {
			
			total += value.charAt(i)-'0';
		}
		
		System.out.println(total);
		
		sc.close();
	}

}
