package graph;

public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 5;
		if(num == 0 || num == 1)
			System.out.println(num);
		long sum = 0;
		long temp1 = 0;
		long temp2 = 1;
		long temp;
		for(int i = 2; i< num; i++){
			sum = temp1 + temp2;
			temp = temp1;
			temp1 = temp2;
			temp2 = temp + temp1;
		}
		System.out.println(sum);
	}
}
 