/*   386. Lexicographical Numbers
Medium
Given an integer n, return all the numbers in the range [1, n] sorted in lexicographical order.
You must write an algorithm that runs in O(n) time and uses O(1) extra space. 

Example 1:
Input: n = 13
Output: [1,10,11,12,13,2,3,4,5,6,7,8,9]

Example 2:
Input: n = 2
Output: [1,2]

*/


import java.util.Scanner ;


class Order {
	private Map<Integer,List<Integer>> lex = new HashMap<>() ;
	protected void printOrder(int num) {

		if(num/10 == 0)	{
			for(int i=0;i<=num;i++)
				lex.put(i,new ArrayList(i));
			return ;
		}
		else 
			for(int i=0;i<=9;i++)
				lex.put(i,new ArrayList(i));
	
		for(int rem=0;rem<num%10;rem++){
			lex.put(num/10,lex.get(num/10).add((10*(num/10))+rem));
		}
	}
}

public class LexicoGraphicalOrder {
	public static void main(String[] args) {
		Order o = new Order() ;		
		Scanner st = new Scanner(System.in) ;
		while(true) {
			o.printOrder(st.nextInt()) ;
		}
	}
}
