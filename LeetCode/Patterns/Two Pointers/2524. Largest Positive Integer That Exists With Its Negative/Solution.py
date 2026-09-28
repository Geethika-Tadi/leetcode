
class Solution:
    def findMaxK(self, nums: list[int]) -> int:
        res = -1
        arr = set(nums)
        for num in nums:
            if num > res and -num in arr:
                res = num
        return res
        