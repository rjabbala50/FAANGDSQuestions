

/* subsets 
*/

import java.util.*;


class getSubsets {
	

	protected void printAllSubsets(int[] nums) {
	
		List<List<Integer>> result = new ArrayList<>() ;
		
		result.add(new ArrayList<Integer>()) ;
			
		for(int n :nums) {
			int size = result.size() ;
			for (int j=0;j<size;j++) {
				List<Integer> prev = new ArrayList<>(result.get(j)) ;
				prev.add(n) ;
				result.add(prev) ;
			}
		}
		System.out.println(result) ;
	}	
}



public class subsets {
	public static void main(String[] args)
	{
		int[] set = {1,2,3} ;
		getSubsets g = new getSubsets() ;
		g.printAllSubsets(set) ;
	}

	



}
