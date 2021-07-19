package back_3stage;

import java.util.Scanner;

public class stage3_08 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();

		int[] array = new int[num];
		
		int[] a = new int[num];
		int[] b = new int[num];
		
		for (int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			
			array[i] = a[i]+b[i];
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print("Case #"+(i+1)+": ");
			System.out.println(a[i]+" + "+b[i]+" = "+array[i]);
		}
		
		sc.close();
	}

}
