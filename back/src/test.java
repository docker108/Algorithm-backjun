
public class test {
	
    public static long solution(int price, int money, int count) {
        long answer = money;

        for (int cnt = 0; cnt < count; ++cnt) {
            answer -= (price * (cnt + 1));
        }
        
        System.out.println(answer);
        System.out.println(-answer+1);
        System.out.println(answer+1);
        return (answer > 0 ? 0 : -answer);
    }
	
	public static void main(String[] args) {
		
		solution(3, 5, 1);
		
		
	}

}
