import java.util.HashSet;
import java.util.Set;

/**
 * 
 */

/**
 * @author Aaditya Badve
 * program finds longest substring with all unique characters in given string. 
 * 
 */
public class LongestSubstringInString {
	public static void main(String[] args) {
		String s = "shdfgagkkhjvvc";
		getUniqueChars(s);
	}

	private static void getUniqueChars(String s) {
		char[] str = s.toCharArray();
		short start = 0;
		short end = 0;
		for (short i = 0; i < str.length; i++) {
			for (short j = i; j < str.length; j++) {
				if (isUnique(str, i, j)) {
					if (j - i > end - start) {
						end = j;
						start = i;
					}
				}
			}
		}
		for (short k = start; k <= end; k++) {
			System.out.println(str[k]);
		}
	}

	private static boolean isUnique(char[] str, short i, short j) {
		Set<Character> set = new HashSet<Character>();
		for (short k = i; k <= j; k++) {
			if (set.contains(str[k]))
				return false;
			else
				set.add(str[k]);
		}
		return true;
	}

}
