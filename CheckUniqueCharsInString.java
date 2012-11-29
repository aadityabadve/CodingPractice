import java.util.BitSet;

// check if string has all unique characters 
public class CheckUniqueCharsInString {
	public static void main(String[] args) {
		String s = "qwertyuiopas 1234567890!@#$%^&*()";
		//boolean[] check = new boolean[256];
		BitSet set = new BitSet(256);
		for (char chr : s.toCharArray()) {
			if (set.get((int)chr)) {
				System.out.println("not unique");
				return;
			} else
				set.set((int)chr);
		}
		System.out.println("All unique");
	}
}
