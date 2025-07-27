class Solution {
    public int findNumbers(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        for(int num : nums)
        {
            while(num>0)
            {
                num = num/10;
                count1++;
            }
            System.out.println(count1);
            if(count1%2==0)
            {
                count2++;
                count1 = 0;
            }
            else{
                count1 = 0;
            }
        }
        return count2;
    }
}