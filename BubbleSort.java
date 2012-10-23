package graph;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr1 = {12, 2, 35, -111, 171, 32, 371, 5};
		
		for(int i = arr1.length - 1; i > 0; i--){
			for(int j = 0; j < i; j ++){
				if(arr1[j] > arr1[i]){
					int temp = arr1[j];
					arr1[j] = arr1[i];
					arr1[i] = temp;
				}
			}
		}
		for(int i = 0; i < arr1.length; i++){
			System.out.println(arr1[i]);
		}
	}
}
