package graph;

import java.util.ArrayList;
import java.util.List;

public class Queue {
	List<Integer> q = new ArrayList<Integer>();
	int pop = 0;
	int push = 0;
	
	public void enqueue(Integer ele){
		q.add(push++,  ele);
	}
	public Integer dequeue(){
		if(pop >= push)
			return null;
		return q.get(pop++);
	}
	public boolean hasElements(){
		if(pop >= push)
			return false;
		return true;
	}
}
