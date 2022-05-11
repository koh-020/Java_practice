
public class Chapter08 {
	public static void main(String args[]) {
//		問題1
		int num1 = 1;
		while (num1 < 5) {
			int num2 = num1 * num1;
			num1 ++;
			System.out.println(num2);
		}
//		問題2
		int[] array1 = { 10, 15, 30, 39 };
		for (int i = 0; i < array1.length; i++ ) {
			System.out.println(array1[i]);
		}
//		問題3
		for ( int number : array1) {
			if (number % 2 == 0) {
				continue;
			}
			System.out.println(number);
		}
		
	}
}
