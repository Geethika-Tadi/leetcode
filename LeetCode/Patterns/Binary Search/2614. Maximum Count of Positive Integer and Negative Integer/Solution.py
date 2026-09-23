class Solution(object):
    def maximumCount(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count=0
        count1=0
        for num in nums:
            if num>0:
                count+=1
            elif num<0:
                count1+=1
        if count>count1:
            return count
        else:
            return count1
        