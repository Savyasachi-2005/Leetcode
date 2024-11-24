class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialize pointers for nums1, nums2, and the merged array
        int a = m - 1; // Pointer for the last element in nums1 (excluding extra space)
        int b = n - 1; // Pointer for the last element in nums2
        int c = m + n - 1; // Pointer for the last position in nums1 (including extra space)
        
        // Merge nums1 and nums2 starting from the back
        while (a >= 0 && b >= 0) {
            if (nums1[a] > nums2[b]) {
                // If nums1's element is larger, place it at the current position of nums1
                nums1[c--] = nums1[a--];
            } else {
                // Otherwise, place nums2's element at the current position of nums1
                nums1[c--] = nums2[b--];
            }
        }
        
        // If there are remaining elements in nums2, copy them to nums1
        while (b >= 0) {
            nums1[c--] = nums2[b--];
        }
        
        // Note: No need to handle remaining elements of nums1 as they are already in place
    }
}
