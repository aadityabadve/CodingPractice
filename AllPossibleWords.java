/*
 * Get all possible words: 
 * Given: incomplete word from Hangman game: ex - "H_L_"
 * output: all possible words that can be formed by filling empty spaces
 */

public class AllPossibleWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Character[] str = { 'h', null, 'L', null };
		printWords(str);

	}

	private static void printWords(Character[] str) {
		int ptr = 0;
		for (ptr = 0; ptr < str.length; ptr++) {
			if (str[ptr] == null)
				break;
		}
		if (ptr == str.length) {
			print(str);
			return;
		}
		for (int i = 0; i < 26; i++) {
			str[ptr] = (char) ('a' + i);
			printWords(str);
		}
	}

	private static void print(Character[] str) {
		StringBuffer s = new StringBuffer();
		for (Character ch : str) {
			s.append(ch);
		}
		System.out.println(s);
	}

}
