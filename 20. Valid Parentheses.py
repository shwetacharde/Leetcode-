class Solution:
    def isValid(self, s: str) -> bool:
        st = []
        d = {")": "(", "}":"{", "]":"["}
        for char in s:
            if char in "([{":
                st.append(char)
            elif char in ")}]":
                if st and st[-1] == d[char]:
                    st.pop()
                else:
                    return False
        # print(st)
        if st:
            return False
        return True
                
