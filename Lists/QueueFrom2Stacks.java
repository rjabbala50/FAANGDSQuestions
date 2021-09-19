/* Implement Queue from two stacks 
*/

import java.util.ArrayDeque ;
import java.util.Deque ;
import java.util.Vector;
import java.util.List ;
import java.lang.Math;

//Currently this Queue accepts only Integers. 
class CustomQueue {
	
	private static Deque<Integer> InStack;
        private static Deque<Integer> OutStack;

	public CustomQueue() {
		InStack = new ArrayDeque<Integer>() ;
         	OutStack = new ArrayDeque<>() ;
	}
	private void adjustHeadQueue() {
		List<Integer> vector = new Vector<Integer>() ;
		while(!OutStack.isEmpty()) {	
			vector.add(OutStack.pop()) ;	
		}	
		OutStack.push(InStack.pop());
		int listsize = vector.size() ;
		while(listsize>0){
			OutStack.push(vector.remove(listsize-1)) ;
			listsize-- ;
		}
	}
	protected void add(Integer ele) {
		InStack.push(ele) ;		
		adjustHeadQueue() ;
        }
	protected Integer remove()  {
		return OutStack.pop();	
	}
	protected Integer size()  {
		return OutStack.size() ;
	}	
	protected boolean isEmpty() {
		return (OutStack.size()==0)?true:false;
	}
}

public class QueueFrom2Stacks {
	
	public static void main(String[] args) {
		CustomQueue q = new CustomQueue() ;
		int count=0;
		//while(count++ < Integer.MAX_VALUE) {
		while(count++ < Math.pow(2,8)) {
			q.add(count) ;
		}
		System.out.println("\nqueue size: "+ q.size()) ;
		while( !q.isEmpty() )
			System.out.print (" "+q.remove()) ;
		System.out.println("\nqueue size: "+ q.size()) ;
	}
}
