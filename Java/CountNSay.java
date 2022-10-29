//leetcode daily problem 18th Oct 2022
//https://leetcode.com/problems/count-and-say/

class CountNSay {
    HashMap<Integer,String> hm=new HashMap<>();
    public String countAndSay(int n) {
        if(n==1)
            return "1";
        if(hm.containsKey(n))
            return hm.get(n);
        String prev=countAndSay(n-1);
        int count=0;
        char previous='a';
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<prev.length();i++)
        {
            char ch=prev.charAt(i);
            if(i>0&&prev.charAt(i-1)==ch)
                count++;
            else
            {
                if(previous!='a')
                {
                  sb.append(count);
                  sb.append(previous);  
                }
                previous=ch;
                count=1;
            }
        }
        sb.append(count);
        sb.append(previous);  
        hm.put(n,sb.toString());
        return sb.toString();
    }
}
