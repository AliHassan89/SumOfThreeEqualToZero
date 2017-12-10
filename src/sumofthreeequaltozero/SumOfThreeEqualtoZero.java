/*

Given an array S of n integers, are there elements a, b, c in S such that 
a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]

 */
package sumofthreeequaltozero;

import java.util.*;
/**
 *
 * @author Ali
 */
public class SumOfThreeEqualtoZero 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> results = threeSum(arr);
        
    }
    
    public static List<List<Integer>> threeSum(int[] nums) 
    {
        int l,r;
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> single = new ArrayList<>();
        Arrays.sort(nums);
        
        for (int i=0; i<nums.length; i++)
        {
            l = i + 1; 
            r = nums.length - 1;
            
            while (l < r)
            {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0)
                {
                    single.addAll(Arrays.asList(nums[i], nums[l], nums[r]));
                    if (!results.contains(single))
                    {
                        results.add(single);
                    }
                    single = new ArrayList<>();
                }
                if (sum < 0)
                    l++;
                else
                    r--;
            }
        }
        
        return results;
    }
    
}
