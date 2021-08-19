package back.stage7;

import java.util.Scanner;

public class stage7_08 {
	public static void main(String[] args) {
		// 문제는 통과가 안된다....
		Scanner sc = new Scanner(System.in);
		
		String[] str = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		String st = sc.nextLine();
		
		for (int i = 0; i < str.length; i++) {
			
			if(st.contains(str[i])) {
				st = st.replace(str[i], "@");
			}
			System.out.println(st);
		}
		System.out.println(st.length());
		
		sc.close();
	}

}

/*
 * 
		// ??? 왜 안될까....
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);

			if (ch == 'c') {
				if (i < str.length() - 1) {
					if (str.charAt(i + 1) == '=') {
						i++;
					} else if (str.charAt(i + 1) == '-') {
						i++;
					}
				}
			} 
			
			else if (ch == 'd') {
				if (i < str.length() - 1) {
					if (str.charAt(i + 1) == 'z') {
						if (i < str.length() - 2) {
							if (str.charAt(i + 2) == '=') {
								i += 2;
							}
						}
					} 
					
					else if (str.charAt(i + 1) == '-') {
						i++;
					}
				}
			} 
			
			else if (ch == 'l') {
				if (i < str.length() - 1) {
					if (str.charAt(i + 1) == 'j') {
						i++;
					}
				}
			} 
			
			else if (ch == 'n') {
				if (i < str.length() - 1) {
					if (str.charAt(i + 1) == 'j') {
						i++;
					}
				}
			} 
			
			else if (ch == 's') {
				if (i < str.length()) {
					if (str.charAt(i + 1) == '=') {
						i++;
					}
				}
			} 
			
			else if (ch == 'z') {
				if (i < str.length() - 1) {
					if (str.charAt(i + 1) == '=') {
						i++;
					}
				}
			}

			count++;
		}
		System.out.println(count);
		sc.close();
	
 * 
 * */
