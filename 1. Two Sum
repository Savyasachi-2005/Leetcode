class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        
        new = {}
        for i,num in enumerate(nums):
            c=target-num
            if c in new:
                return new[c],i
            new[num] = i
        return []        
