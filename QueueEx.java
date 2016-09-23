package Collecxions;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueEx {

	private static final String UNUSED = "unused";

	public static void main(String[] args) {
		@SuppressWarnings(value = { })
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("A");
		queue.add("B");
		queue.add("C");
		queue.add("D");
		queue.add("E");
		queue.add("F");
	System.out.println("Head:"+queue.element());
	System.out.println("Head:"+queue.peek());
	System.out.println("iterating the queue element:");
	Iterator<String> itr=queue.iterator();
	while(itr.hasNext()){
		//System.out.println(itr.next());
		queue.remove();
		queue.poll();
		System.out.println("after removing two elements:");
		Iterator<String> itr2=queue.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
			
		}
		
			
	}
			
	
	
	
	}

	public static String getUnused() {
		return UNUSED;
	}

}
