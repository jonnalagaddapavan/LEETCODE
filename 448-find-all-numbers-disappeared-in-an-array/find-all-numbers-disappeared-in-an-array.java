class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=1;i<nums.length+1;i++)
        {
            set.add(i);
        }
        for(int i : nums)
        {
            if(set.contains(i))
            {
                set.remove(i);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        return list;
    }
}