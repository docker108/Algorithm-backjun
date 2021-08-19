package back.stage4;

import java.util.Scanner;

public class stage4_03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int cnt = 0;
		int num_copy = num;
		
		while(true) {
			num = ( (num%10)*10 + ((num/10) + (num%10))%10 );
			cnt++;
			
			if(num == num_copy) {
				break;
			}
		}
		sc.close();
		System.out.println(cnt);
	}

}
