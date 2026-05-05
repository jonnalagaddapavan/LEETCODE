class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        
        int f = 0;
        boolean isodd = false;
        for(char c : ch)
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(HashMap.Entry<Character,Integer> entry : map.entrySet())
        {
            if(entry.getValue()>1)
            {
                if(entry.getValue()%2==0)
                {
                    f = f + entry.getValue();
                }
                else
                {
                     f = f + entry.getValue()-1;
                     isodd = true;
                }
               
            }
            else
            {
                f+=entry.getValue()-1;
                isodd = true;
            }

        }
        if(isodd)
        {
            f+=1;
        }
        
        return f;
    }
}