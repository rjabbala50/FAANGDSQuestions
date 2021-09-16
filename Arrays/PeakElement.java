
/* Peak Element, Given
 * https://leetcode.com/problems/find-peak-element/
 162. Find Peak Element
Medium

A peak element is an element that is strictly greater than its neighbors.
Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
You may imagine that nums[-1] = nums[n] = -∞.
You must write an algorithm that runs in O(log n) time.

Example 1:
Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.

Example 2:
Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.

Constraints:

    1 <= nums.length <= 1000
    -231 <= nums[i] <= 231 - 1
    nums[i] != nums[i + 1] for all valid i.
*/

class  findPeak{

	protected int getPeak(int[] numArray, int size)
	{
		int index=0,peak=0 ;
		if( size<=1 ) 
		{
			System.out.println("/nPeak is inderminitstic: "+size) ;
			peak = -1 ;
		}

		index += 1 ;
		while( index<size )
		{
			if( numArray[index]>numArray[index-1] && numArray[index]>numArray[index+1] ) 
			{
				System.out.println("\nPeak found\n") ;
				return (peak=index) ;
			}
			index += 1 ;
		}
		System.out.println("\n Peak not found\n") ;
		return -1;
	}
}

public class  PeakElement {
	public static void main(String[] args)
	{
		int[] inputArray = {1,2,3,1} ;
		findPeak fp = new findPeak() ;
		System.out.println("Peak Index: "+fp.getPeak(inputArray,4));
	}
}

