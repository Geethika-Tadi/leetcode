class Solution:

    def frequencySort(self, A: List[int]) -> List[int]:

        count = Counter(A)

        A.sort(key=lambda x: (count[x], -x))

        return A  