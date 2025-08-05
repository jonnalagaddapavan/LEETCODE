class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max = -1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            int value = entry.getValue();
            int key = entry.getKey();
            if(key == value)
            {
                max = Math.max(max,key);
            }
        }
        return max;
    }
}