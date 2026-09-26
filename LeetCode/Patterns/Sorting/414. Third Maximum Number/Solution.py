class Solution:
    def thirdMax(self, nums):
        a = sorted(set(nums), reverse=True)
        if len(a) < 3:
            return a[0]
        return a[2]   