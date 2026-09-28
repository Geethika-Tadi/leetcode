class Solution:
    def intersection(self, nums1, nums2):
        set1 = set(nums1)
        ans = set()

        for x in nums2:
            if x in set1:
                ans.add(x)

        return list(ans)
        