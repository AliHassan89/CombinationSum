/**

 Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique
 combinations in C where the candidate numbers sums to T.

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
 
This algorithm has time complexity O((n+k)!) where n is the size of candidates, 
and k is the max repeated times for each candidates
and space complexity O(m) where m is the size of array for the solution.

 */
package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    Arrays.sort(candidates);
    List<List<Integer>> result = new ArrayList<>();
    getResult(result, new ArrayList<Integer>(), candidates, target, 0);

    return result;
  }

  private void getResult(List<List<Integer>> result, List<Integer> cur, int candidates[], int target, int start){
    if(target > 0){
      for(int i = start; i < candidates.length && target >= candidates[i]; i++){
        cur.add(candidates[i]);
        getResult(result, cur, candidates, target - candidates[i], i);
        cur.remove(cur.size() - 1);
      }
    }
    else if(target == 0 ){
      result.add(new ArrayList<Integer>(cur));
    }
  }
}
