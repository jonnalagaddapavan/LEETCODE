class Solution {
    public int findGCD(int[] nums) {
        int s = Arrays.stream(nums).min().getAsInt();
        int b = Arrays.stream(nums).max().getAsInt();
        while(b!=0)
        {
            int temp = b;
            b = s%b;
            s = temp;
        }
        return s;
    }
}