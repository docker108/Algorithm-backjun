package back.stage3;

import java.util.Scanner;

public class stage3_11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int X = sc.nextInt();
		
		int[] array = new int[num];
		
		for (int i = 0; i < num; i++) {
			array[i] = sc.nextInt();
			if(array[i] < X) {
				System.out.print(array[i]+" ");
			}
		}
		
		
		sc.close();
	}

}
