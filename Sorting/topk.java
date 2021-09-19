/* Top k elements  
*/


import java.util.Queue;
import java.util.List;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.lang.Math ;
import java.util.Collections ;


class topkBuilder { 

	private Queue<Integer> maxHeap ;
		
	protected topkBuilder() {
		this.maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder()) ;
	}
	private void insert(int[] input ) 
	{
		int inputLength = input.length-1 ;
		int index = -1 ;
		while( index++ < inputLength ){
			Integer data = input[index] ;
			if(!maxHeap.contains(data)){
				maxHeap.offer(data) ;	
			}
		}
	}
	private List<Integer> fetch(int topk)
	{
		List<Integer> output = new ArrayList<>() ;
		if(maxHeap.size() <= 0) {
			//dont return null 
			return output ;
		}
		if(maxHeap.size() == 1) {
			output.add(maxHeap.poll()) ;
			return output;
		}
		if(maxHeap.size() < topk) {
			System.out.println(" Requesting more than container elements") ;
			return output ;
		}

		int index = -1;
		int heapsize = Math.min(topk,maxHeap.size())-1 ;
		while( index++ < heapsize) {
			output.add(maxHeap.poll()) ;	
		}
		return output ;
	}
	protected List<Integer> getTopK(int[] input, int k) {
		this.insert(input) ;
		return this.fetch(k) ;
	}
}

public class topk {
	public static void main(String[] args) {
		topkBuilder topk = new topkBuilder() ;
		int[] input = {4,2,6,1,3,5,8} ;
		System.out.println("  "+ topk.getTopK(input,-2)) ;
	}
}
