class Solution {
    public int numberOfSteps(int num) {
        int n = num;
        int c = 0;
        while(n>0)
        {
            if(n%2==1){
                n-=1;
            }else{
                n/=2;
            }
            c++;
        }
        return c;
    }
}