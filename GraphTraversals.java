package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GraphTraversals {

	public static Map<Integer, List<Integer>> g = new HashMap<Integer, List<Integer>>();
	public static Queue q = new Queue();
	public static Map<Integer, Integer> path = new HashMap<Integer, Integer>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		createGraph();
		DFSearch(2, 1, new ArrayList<Integer>(), new HashSet<Integer>());
		BFSearch(1, 6);
		print(1, 6);
	}

	private static void DFSearch(Integer start, Integer end, List<Integer> acc,
			Set<Integer> visited) {
		if (start == end) {
			acc.add(end);
			System.out.println(acc);
		}
		acc.add(start);
		for (Integer node : g.get(start)) {
			if (!visited.contains(node)) {
				visited.add(node);
				DFSearch(node, end, acc, visited);
			}
		}
	}
	
	private static void BFSearch(Integer start, Integer end){
		if (start == end) {
			
			return;
		}
		for(Integer node: g.get(start)){
			if(!path.containsKey(node)){				
				path.put(node, start);
				q.enqueue(node);
			}
		}
		while(q.hasElements()){
			Integer node = q.dequeue();
			BFSearch(node, end);
		}
	}
	
	private static void print(Integer start, Integer end){
		Integer x = end;
		do{
			System.out.println(x);
			x = path.get(x);
		}while(x != start);
		System.out.println(start);
	}

	private static void addEdge(Integer n1, Integer n2) {
		if (g.containsKey(n1)) {
			g.get(n1).add(n2);
		} else {
			List<Integer> list = new ArrayList<Integer>();
			list.add(n2);
			g.put(n1, list);
		}
	}

	public static void createGraph() {
		addEdge(1, 2);
		addEdge(1, 6);
		addEdge(2, 3);
		addEdge(3, 6);
		addEdge(3, 4);
		addEdge(4, 6);
		addEdge(4, 7);
		addEdge(5, 4);
		addEdge(6, 7);
		addEdge(7, 5);
	}

}
