class Solution(object):
    def heightChecker(self, heights):
        
        """
        :type heights: List[int]
        :rtype: int
        """
        excepted=sorted(heights)
        mismatched_count = 0
        for i in range(len(heights)):
            if heights[i] != excepted[i]:
                mismatched_count += 1
                
        return mismatched_count
