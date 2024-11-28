package syafa.java.leetcode;

public class MergeSortedArray
{
    class Solution
    {
        public void merge(int[] nums1,int m,int[] nums2,int n)
        {
            int counter = 0;
            for (int i = m; i < nums1.length; i++)
            {
                nums1[i] = nums2[counter];
                counter++;
            }
            for (int i = 0; i < nums1.length; i++)
            {
                for (int j = 1 + i; j < nums1.length; j++)
                {
                    if (nums1[i] > nums1[j])
                    {
                        int tempSwap = nums1[j];
                        nums1[j] = nums1[i];
                        nums1[i] = tempSwap;
                    }
                }
            }
        }
    }
}