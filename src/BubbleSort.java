import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/***************
 * Bubble sort -- both ascendng and descending
 */
public class BubbleSort
{
   boolean printAfterPass;
   BubbleSort(boolean printAfterPass) { this.printAfterPass = printAfterPass; }

   BubbleSort(){ this.printAfterPass = false; }

   public void sortAscending(int[] nums)
   {
      boolean swapped;
      for(int j = nums.length - 1; j > 1; j--)
      {
         for (int i = 0; i < nums.length - 1; i++)
         {
            if (nums[i] > nums[i + 1])
            {
               swap(nums, i);
            }
         }
         if (printAfterPass)
         {
            System.out.println("PASS STARTED AT : " + j);
            printArray(nums);
         }
      }
   }

   public void sortDescending(int[] nums)
   {
      boolean swapped;
      for(int j = nums.length - 1; j > 1; j--)
      {
         for (int i = 0; i < nums.length - 1; i++)
         {
            if (nums[i] < nums[i + 1])
            {
               swap(nums, i);
            }
         }
         if (printAfterPass)
         {
            System.out.println("PASS STARTED AT : " + j);
            printArray(nums);
         }
      }
   }

   private static void swap(int[] nums, int i)
   {
      int temp = nums[i];
      nums[i] = nums[i + 1];
      nums[i + 1] = temp;
   }

   private static void printArray(int[] nums)
   {
      for (int i : nums)
      {
         System.out.print(i + " ");
      }
      System.out.println("\n");
   }
   private static int[] getRandomArray(int size, int bound)
   {
      int[] nums = new int[size];
      Random ran = new Random();

      for (int i = 0; i < size; i++)
      {
         nums[i] = ran.nextInt(bound);
      }
      return nums;
   }

   public static void main(String[] args)
   {
      int size = 20;
      int randomBound = 100;

      BubbleSort sort = new BubbleSort();
      //ASCENDING SORT
      int[] nums = getRandomArray(size, randomBound);

      System.out.println("UNSORTED ARRAY");
      printArray(nums);

      sort.sortAscending(nums);

      System.out.println("SORTED ARRAY -- Ascending");
      printArray(nums);

      //DESCENDING SORT
      nums = getRandomArray(size, randomBound);

      System.out.println("UNSORTED ARRAY");
      printArray(nums);

      sort.sortDescending(nums);

      System.out.println("SORTED ARRAY - Descending");
      printArray(nums);
   }
}
