package practice;

public class Chapter15_1 {
	public static void main(String[] args) {

		int answer = yuclid(148, 28);
		System.out.println("最大公約数は" + answer);
	}
	public static int yuclid(int n1, int n2) {
		
		int a = n1 % n2;
		while (a != 0) {
			a = n1 % n2;
			n1 = n2;
			n2 = a;
			if( a == 0) {
				return n1;
			}
		}
		return n2;
	}
	
	
	
	
//	解答例（再帰呼び出し）
	int a;
	int b;
	
	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a%b);
	}
	

}
