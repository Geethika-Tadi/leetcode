class Solution(object):
    def mostCommonWord(self, paragraph, banned):
        """
        :type paragraph: str
        :type banned: List[str]
        :rtype: str
        """
        paragraph = paragraph.lower()
        for ch in "!?',;.:":
            paragraph = paragraph.replace(ch, " ")
        words = paragraph.split()
        count = {}
        for word in words:
            if word not in banned:
                count[word] = count.get(word, 0) + 1
        return max(count, key=count.get)