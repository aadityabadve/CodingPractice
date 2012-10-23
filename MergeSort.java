package graph;
import java.util.ArrayList;
import java.util.List;
public class MergeSort {
	public static void main(String[] args) {
		List<Integer> array1 = new ArrayList<Integer>();
		int[] arr1 = {12, 2, 35, -111, 171, 32, 371, 5};
		for (int i = 0; i < arr1.length; i++)
			array1.add(arr1[i]);
		System.out.println(mergeSortRec(array1));
	}
	private static List<Integer> mergeSortRec(List<Integer> array) {
		int middle;
		if (array.size() <= 1)
			return array;
		middle = array.size() / 2;
		return merge(mergeSortRec(array.subList(0, middle)),
				mergeSortRec(array.subList(middle, array.size())));
	}

	public static List<Integer> merge(List<Integer> array1, List<Integer> array2) {
		
		List<Integer> newArr = new ArrayList<Integer>();
		int pointer1 = 0;
		int pointer2 = 0;
		while (pointer1 < array1.size() && pointer2 < array2.size()) {
			if (array1.get(pointer1) < array2.get(pointer2)) {
				newArr.add(array1.get(pointer1));
				pointer1 += 1;
			} else {
				newArr.add(array2.get(pointer2));
				pointer2 += 1;
			}
		}
		if (pointer1 < array1.size())
			while (pointer1 < array1.size()) {
				newArr.add(array1.get(pointer1));
				pointer1 += 1;
			}
		if (pointer2 < array2.size())
			while (pointer2 < array2.size()) {
				newArr.add(array2.get(pointer2));
				pointer2 += 1;
			}
		return newArr;
	}
}
