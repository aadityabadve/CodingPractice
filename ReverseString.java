package graph;

public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "i";
		char[] strarr = str.toCharArray();
		int strSize = str.length();
		char temp;
		for(int i = 0; i< strSize/2; i++){
			temp = strarr[i];
			strarr[i] = strarr[strSize - i - 1];
			strarr[strSize - i - 1] = temp;
		}
		System.out.println(strarr);
		
	}

}
