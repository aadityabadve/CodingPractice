public class RemoveDuplicates {
	/* Author: Aaditya Badve
	 * This method is to remove duplicate chars from char array (string). This method
	 * takes space of O(1) and run time of O(n^2)
	 */
	public static void main(String argv[]) {
		 char[] str = { 'c', 'c', 'v', 'a', 'b', 'b', 'r', 'e', 'b', 'n'
		 ,'r', 'a' };
		//char[] str = { 'a', 'a', 'a', 'a', 'a', 'a' };
		int store = 0;
		int trav = 0;
		boolean charFound = false;
		for (int i = 0; i < str.length; i++) {
			charFound = false;
			for (trav = i - 1; trav >= 0; trav--) {
				if (str[trav] == str[i]) {
					charFound = true;
					break;
				}
			}
			if (!charFound) {
				str[store] = str[i];
				store++;
			}
		}

		for (int i = 0; i < store; i++) {
			System.out.println(str[i]);
		}
	}
}
