package graph;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> arr1 = new ArrayList<Integer>();
		{12, 2, 35, -111, 171, 32, 371, 5};
		QuickSort qs = new QuickSort();
		int[] arr = qs.quickSort(arr1);
	}

	private int[] quickSort(int[] arr1) {
		if(arr1.length <= 1){
			return arr1;
		}
		int pivot = (int) arr1.length / 2;
		List<Integer> smaller = new ArrayList<Integer>();
		List<Integer> greater = new ArrayList<Integer>();
		for(int i = 0; i < arr1.length; i++){
			if(arr1[i] < arr1[pivot])
				smaller.add(arr1[i]);
			else
				greater.add(arr[i]);
		}
	}
	
}
