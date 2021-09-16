/*
 * Find min and max from Array
 */

class GetMinimum  {
	protected int getMin(int[] input, int size) {
		int min=65535;
	
		for (int val:input) 
			if( val<min )
				min = val ;
		return min ;
   	}	
}

public class FindMinMax {
	public static void main(String[] args) {
		int[] input = {2,3,9,4};
		GetMinimum gm = new GetMinimum() ;
		System.out.println("Min Elt: "+gm.getMin(input,4)) ;
	}
}










