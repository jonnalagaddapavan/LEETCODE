class Solution {
    public int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums)
        {
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        int freq = 0;
        int key = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue()>freq)
            {
                freq = entry.getValue();
                key = entry.getKey();
            }
        }
        list.add(key);
        HashSet<Integer> dup = new HashSet<>();
        for(int i=1;i<nums.length+1;i++)
        {
            dup.add(i);
        }
        for(int i : nums)
        {
            if(dup.contains(i))
            {
                dup.remove(i);
            }
        }
        for(int i : dup)
        {
            list.add(i);
        }
        System.out.println(list);
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr[i] = list.get(i);
        }
        return arr;
    }
}