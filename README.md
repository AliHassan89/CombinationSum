# CombinationSum
Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique  combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.

 Note:
 All numbers (including target) will be positive integers.
 The solution set must not contain duplicate combinations.
 For example, given candidate set [2, 3, 6, 7] and target 7,
 A solution set is:
 [
 [7],
 [2, 2, 3]
 ]

# Solution:

1. An integer array and target value is received as function parameter.

2. Sort the array

3. Create a function which will be recursive function. The function will have following parameters
	* sorted array
	* target value
	* a list of list which will hold the results
	* a new list which will hold result 
	* start index
	
Calling the function will look like this: combinationSum(candidates, target, results, new ArrayList<Integer>(), 0);
Function declaration will look like this: combinationSum(int[] candidates, int target, List<List<Integer>> results, List<Integer> result, int start)

4. In the recursive function it is checked if the target value is greater than 0, if yes then we loop starting from the start position which is passed in as function parameter. It is checked in the loop condition if we have reached the end of sorted array of values and the target is greater than or equal to the i'th position of sorted array, and i is incremented.

5. In the loop we add the sorted array i'th value to the result and call the function making it a recursive call. In recursive call instead of passing target we will pass target - sortedArray[i].

6. In the next step we remove the last value from result.

7. Lastly if the target value is equal to 0 then we add the result in to list of lists.

This algorithm has time complexity 
```
O((n+k)!) 
where n is the size of candidates, and k is the max repeated times for each candidates
and space complexity 
O(m) where m is the size of array for the solution.
```
