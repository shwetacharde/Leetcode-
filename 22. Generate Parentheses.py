class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        if n == 1:
            return ["()"]
        temp = self.generateParenthesis(n-1)
        ans = set()
        for pat in temp:
            for i in range(len(pat)):
                t1 = ["("]
                t1.append(pat[:i])
                t1.append(")")
                t1.append(pat[i:])
                ans.add("".join(t1))
            # print(t1, pat)
            
        return list(ans)
