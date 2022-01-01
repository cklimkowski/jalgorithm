package algorithms.sorts;

import io.github.jalgorithm.algorithms.sorts.SelectionSort;

import java.util.Arrays;

public class SelectionSortTest {
  public static void main(String[] args) {
    int[] array = {100,-15,6,0,10,11,200,1};
    SelectionSort selectionSort = new SelectionSort(array);
    System.out.println(Arrays.toString(selectionSort.sort()));
  }
}
