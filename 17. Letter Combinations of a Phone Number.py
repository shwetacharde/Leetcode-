class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        d = {
            "2" : "abc",
            "3" : "def",
            "4" : "ghi",
            "5" : "jkl",
            "6" : "mno",
            "7" : "pqrs",
            "8" : "tuv",
            "9" : "wxyz"
        }
        
        ans = set()
        
        def helper(prefix, digits):
            if len(digits) == 0:
                ans.update(prefix)
                return
            
            curr = d[digits[0]]
            new_p = set()
            for char in curr:
                for pre in prefix:
                    new_p.add(pre+char)
            if len(new_p) == 0:
                helper(curr, digits[1:])
            else:
                helper(new_p, digits[1:])
        
        helper([], digits)
        return ans
