import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Sample {
    public static void main(String[] args) {
        int arr[] = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(new Solution().removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));

    }
}

class Solution {
    public int removeDuplicates(int[] nums) {

        int ptr1 = 0;
        int ptr2 = 0;
        int count = 0;
        while (ptr1 < nums.length) {
            if (nums[ptr1] != nums[ptr2]) {
                ptr2++;
                nums[ptr2] = nums[ptr1];

                count++;
            } else
                ptr1++;

        }
        return count;
    }
}