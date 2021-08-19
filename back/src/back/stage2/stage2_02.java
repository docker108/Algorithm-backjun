package back.stage2;

import java.util.Scanner;

public class stage2_02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		// 90 100 a 80 89 b 70 79 c 60 69 d 나머지 f
		sc.close();
		
		if(score >=0 && score <=100) {
			
			if(score >= 90) {
				System.out.println("A");
			}else if (score >=80) {
				System.out.println("B");
			}else if (score >= 70) {
				System.out.println("C");
			}else if (score >= 60) {
				System.out.println("D");
			}else {
				System.out.println("F");
			}
		}
		else {
			return;
		}
		
	}

}
