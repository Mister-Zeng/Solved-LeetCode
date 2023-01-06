class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        s1 = 0
        s2 = len(t)
        
        if s2 < len(s):
            return False
        elif len(s) == 0:
            return True
        
        for i in t:
            if s[s1] == i:
                s1 += 1
        
            if s1 == len(s):
                return True
        
        return False