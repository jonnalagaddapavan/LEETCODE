class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max = 0;
        int n = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue()>max)
            {
                max = entry.getValue();
                n = entry.getKey();
            }
            System.out.println(max);
            System.out.println(n);
        }
        return n;
    }
}