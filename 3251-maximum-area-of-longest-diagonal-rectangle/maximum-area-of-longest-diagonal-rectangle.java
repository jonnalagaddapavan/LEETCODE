class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
     ArrayList<Integer> l1 = new ArrayList<>();
      int sum1 = 0;
      int r = 0;
      for(int i=0;i<dimensions.length;i++)
      {
        for(int j=0;j<dimensions[i].length;j++)
        {
          l1.add(dimensions[i][j]);
        }
        int temp = 0;
        for(int num : l1)
        {
          temp+=num*num;
        }
        int p = 1;
        for(int num : l1)
        {
          p=p*num;
        }
        if(temp>sum1 || (temp==sum1 && p>r))
        {
          sum1 = temp;
          r = p;
        }
        l1.clear();
      }
      return r;
    }
}