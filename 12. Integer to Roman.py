class Solution:
    def intToRoman(self, num: int) -> str:
        ans = []
        mcnt = (num//1000)
        ans.append('M'*mcnt)
        num -= mcnt*1000
        ccnt = (num//100)
        num -= ccnt*100
        if ccnt == 9:
            ans.append("CM")
        elif ccnt == 4:
            ans.append("CD")
        else:
            if ccnt >= 5:
                ccnt -= 5
                ans.append("D")
            ans.append("C"*ccnt)
        xcnt = num//10
        num -= xcnt*10
        if xcnt == 9:
            ans.append("XC")
        elif xcnt == 4:
            ans.append("XL")
        else:
            if xcnt >= 5:
                xcnt -= 5
                ans.append("L")
            ans.append("X"*xcnt)
        if num == 9:
            ans.append("IX")
        elif num == 4:
            ans.append("IV")
        else:
            if num >= 5:
                num -= 5
                ans.append("V")
            ans.append("I"*num)
        # print(num)
        return "".join(ans)
