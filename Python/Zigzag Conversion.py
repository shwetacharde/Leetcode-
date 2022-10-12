class Solution:
    def convert(self, s: str, numRows: int) -> str:
        arr = [[""]*len(s) for _ in range(numRows)]
        idx = 0
        j = 0
        while idx < len(s):
            for i in range(numRows):
                if idx < len(s):
                    arr[i][j] = s[idx]
                    idx += 1
                else:
                    break
            if idx >= len(s):
                break
            for i in range(numRows-2, 0, -1):
                if idx < len(s):
                    j += 1
                    arr[i][j] = s[idx]
                    idx += 1
                else:
                    break
            j += 1
        # print(arr)
        ans = []
        for i in range(numRows):
            ans.append("".join(arr[i]))
        return "".join(ans)
