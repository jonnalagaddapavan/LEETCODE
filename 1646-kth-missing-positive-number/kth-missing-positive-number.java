class Solution {
    public int findKthPositive(int[] arr, int k) {
         HashSet<Integer> list = new HashSet<>();
          int max = 0;
       for(int num : arr)
       {
        if(num>max)
        {
            max = num;
        }
       }
        int p = max+k;
        for(int i=1;i<=p;i++)
       {
        list.add(i);
       }
        for(int i=0;i<arr.length;i++)
       {
        if(list.contains(arr[i]))
        {
            list.remove(arr[i]);
        }
       }
        ArrayList<Integer> l = new ArrayList<>(list);
        int re = l.get(k-1);
        return re;
    }
}
