class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] nums1 = new int[nums.length];
        int[] merge = new int[nums.length+nums1.length];
        for(int i=0;i<nums.length;i++)
        {
            nums1[i] = nums[i];
        }
        System.arraycopy(nums, 0, merge, 0, nums.length);
        System.arraycopy(nums1, 0, merge, nums.length, nums1.length);
        return merge;
        
    }
}