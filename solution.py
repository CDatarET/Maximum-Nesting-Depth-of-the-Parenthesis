class Solution:
    def maxDepth(self, s: str) -> int:
        top = 0
        m = 0

        for x in s:
            if x == "(":
                top += 1
            elif x == ")":
                top -= 1
            
            m = max(m, top)

        return m
