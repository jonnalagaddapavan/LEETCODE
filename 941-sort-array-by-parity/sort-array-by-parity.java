class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr = new int[nums.length];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2 == 0)
            {
                list.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++)
        {
           if (nums[i] % 2 != 0) {
                list.add(nums[i]);
            }

        }
         System.out.println(list);
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = list.get(i);
        }
        return arr;
    }
}