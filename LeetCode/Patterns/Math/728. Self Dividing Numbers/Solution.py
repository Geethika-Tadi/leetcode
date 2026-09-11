class Solution(object):
    def check(self, num):
        temp = num
        while temp > 0:
            digit = temp % 10
            if digit == 0 or num % digit != 0:
                return False
            temp //= 10

        return True

    def selfDividingNumbers(self, left, right):
        ans=[]
        for i in range(left, right+1):
            if self.check(i):
                ans.append(i)
        return ans
        