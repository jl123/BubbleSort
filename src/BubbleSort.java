import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class BubbleSort
{
   static public void sort(int[] nums)
   {
      boolean swapped;

      do
      {
         swapped = false;
         for (int i = 0; i < nums.length - 1; i++)
         {
            if (nums[i] > nums[i + 1])
            {
               int temp = nums[i];
               nums[i] = nums[i + 1];
               nums[i + 1] = temp;
               swapped = true;
            }
         }
      }while (swapped == true);
   }

   public static void main(String[] args)
   {
      int size = 100;
      int[] nums = new int[size];
      Random ran = new Random();

      for (int i = 0; i < nums.length; i++)
      {
         nums[i] = ran.nextInt(1000);
      }
      for (int i : nums)
      {
         System.out.print(i + " ");
      }
      sort(nums);
      System.out.println();
      System.out.println();
      for (int i : nums)
      {
         System.out.print(i + " ");
      }
   }
}
