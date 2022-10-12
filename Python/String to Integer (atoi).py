class Solution:
    def myAtoi(self, s: str) -> int:
        pos = []
        rel = "1234567890"
        issign = False
        for char in s:
            if char == " ":
                if pos:
                    break
                continue
            elif (char == "+" or char == "-"):
                if issign or pos:
                    break
                issign = True
                pos.append(char)
            # print(char)
            elif char in rel:
                pos.append(char)
            else:
                break
        if not pos or (len(pos) == 1 and pos[0] in "+-"):
            return 0
        ans = int("".join(pos))
        if ans < -2**31:
            ans = -2**31
        if ans > (2**31-1):
            ans = 2**31-1
        return ans
