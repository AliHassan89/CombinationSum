package test.java;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

import java.util.ArrayList;
import java.util.List;
import main.java.CombinationSum;
import org.junit.Test;

public class CombinationSumTest {

  private static final CombinationSum combinationSum = new CombinationSum();

  @Test
  public void checkForEmptyInputArray(){
    //given
    int[] arr = {};
    int target = 1;

    //when
    List<List<Integer>> results = combinationSum.combinationSum(arr, target);

    //then
    assertThat(results.size(), equalTo(0));
  }

  @Test
  public void checkWhenTargetCannotBeAchievedUsingArrayValues(){
    //given
    int[] arr = {3,6,8};
    int target = 1;

    //when
    List<List<Integer>> results = combinationSum.combinationSum(arr, target);

    //then
    assertThat(results.size(), equalTo(0));
  }

  @Test
  public void checkForCorrectInput(){
    //given
    int[] arr = {2, 3, 6, 7};
    int target = 7;

    List<Integer> result_1 = new ArrayList<>();
    result_1.add(2);
    result_1.add(2);
    result_1.add(3);

    List<Integer> result_2 = new ArrayList<>();
    result_2.add(7);

    //when
    List<List<Integer>> results = combinationSum.combinationSum(arr, target);

    //then
    assertThat(results.size(), equalTo(2));
    assertThat(results.get(0), equalTo(result_1));
    assertThat(results.get(1), equalTo(result_2));
  }
}
