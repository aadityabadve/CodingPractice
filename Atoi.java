/**
 * 
 */

/**
 * @author AadityaBadve
 * class implements same as atoi method in c++
 * 
 */
public class Atoi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "127368";
		int mult = 1;
		int num = 0;
		char[] arr = s.toCharArray();
		for (int i = s.length() - 1; i >= 0; i--) {
			num = num + mult * (arr[i] - '0');
			mult *= 10;
		}
		System.out.println(num);
	}

}
