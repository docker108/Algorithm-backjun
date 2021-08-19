package back.stage8;

import java.util.Scanner;

public class stage8_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int FixedCost = sc.nextInt(); // 고정비용
		int VariableCost = sc.nextInt(); // 가변 비용
		
		int Price = sc.nextInt(); // 가격
		
		
		if( VariableCost >= Price) {
			System.out.println("-1");
		} else {
			System.out.println(FixedCost/(Price-VariableCost)+1);
		}
		 
		
	
		sc.close();
	}
	
}
