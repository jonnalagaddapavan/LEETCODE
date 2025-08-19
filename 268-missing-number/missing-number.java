class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int m = 0;
        TreeSet<Integer> set = new TreeSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        for(int i=0;i<=n;i++)
        {
            if(!set.contains(i))
            {
                m = i;
            }
        }
        return m;

    }
}