class Solution {
    public boolean canSortArray(int[] nums) {
        int[] bits = new int[nums.length];
        
        // Calculate the number of set bits for each element in nums
        for (int i = 0; i < nums.length; i++) {
            bits[i] = countBits(nums[i]);
        }

        // Attempt to sort the nums array by swapping adjacent elements with the same set bit count
        for (int i = 0; i < bits.length - 1; i++) {
            for (int j = 0; j < bits.length - i - 1; j++) {
                if (bits[j] == bits[j + 1] && nums[j] > nums[j + 1]) {
                    // Swap both nums and bits arrays at positions j and j+1
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                    int tempBits = bits[j];
                    bits[j] = bits[j + 1];
                    bits[j + 1] = tempBits;
                }
            }
        }

        // Check if the array is sorted in non-decreasing order  
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        
        return true;
    }

    // Helper function to count set bits in an integer
    private int countBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}
