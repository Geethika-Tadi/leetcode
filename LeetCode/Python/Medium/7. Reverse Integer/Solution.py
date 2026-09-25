class Solution(object):
    def reverse(self, x):
        if x < 0:
            return -int(str(-x)[::-1])
        else:
            return int(str(x)[::-1])  