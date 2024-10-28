class Solution(object):
    def countCompleteDayPairs(self, hours):
        """
        :type hours: List[int]
        :rtype: int
        """
        reminder_count =[0]*24
        for hour in hours:
            reminder=hour % 24
            reminder_count[reminder] +=1
        count = 0
        count += (reminder_count[0]*(reminder_count[0]-1)) // 2
        count += (reminder_count[12]*(reminder_count[12]-1)) // 2
        
        for i in range(1,12):
            count += reminder_count[i]*reminder_count[24-i]
        return count
    
        hours = list(map(int, input("Enter hours separated by spaces: ").split()))
        solution = Solution()
        print(solution.countCompleteDayPairs(hours))
