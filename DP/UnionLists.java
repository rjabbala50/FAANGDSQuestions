/* Get Union of two lists. 
*/

import java.util.ArrayList;
import java.util.HashSet ;
import java.util.List ;
import java.util.Set ;
import java.lang.Math ;

class Union {
	protected List<Integer> union(List<Integer> list1, List<Integer> list2) {

		List<Integer> result = new ArrayList<Integer>() ;
		Set<Integer> hashset = new HashSet<Integer>() ;
		
		int index=-1;
		while(index++ < Math.max(list1.size()-1,list2.size()-1)) {
			int val =0;
			if(index < list1.size()) {
				val = list1.get(index) ;
				hashset.add(val) ;
			}
			if(index < list2.size()) {
				val = list2.get(index) ;			
				if(!list1.contains(val))
					hashset.add(val) ;
			}
		}
		
		/*
		index=0-1;
		while(index++<list2.size()-1) {
			hashset.add(list2.get(index)) ;
		}
		*/
		return new ArrayList<Integer>(hashset)  ;
	}
	protected List<Integer> intersection(List<Integer> list1, List<Integer> list2) {
		
		List<Integer> result = new ArrayList<Integer>() ;
		
		int index=-1 ;
		while(index++<Math.min(list1.size()-1,list2.size()-1)) {
			if( (index == list1.size()-1)  || (index == list2.size()-1)) 
				break ;
			if(list2.contains(list1.get(index)))
				result.add(list1.get(index)) ;
		}
		return result ;
	}
}

public class UnionLists {
	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>() ;
		list1.add(1) ;
		list1.add(2) ;
		list1.add(2) ;
		list1.add(4) ;

		List<Integer> list2 = new ArrayList<>() ;
		list2.add(2) ;
		list2.add(6) ;
		list2.add(7) ;	
		
		Union u = new Union() ;
		System.out.println("Union..."+u.union(list1, list2)) ;
		System.out.println("Intersection..."+u.intersection(list1, list2)) ;
	}
}
