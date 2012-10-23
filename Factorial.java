package graph;

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 100;
		long sum = 1;
		for(int i = 1; i<= num; i++){
			sum = sum * i;
		}
		System.out.println("f"+ sum);
	}
}
