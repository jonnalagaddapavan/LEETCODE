class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> b = new ArrayList<>();
        for(int num : candies)
        {
            list.add(num);
        }
        int max = Collections.max(list);
        for(int num : candies)
        {
            int temp = num + extraCandies;
            if(temp>=max)
            {
                b.add(true);
            }
            else{
                b.add(false);
            }
        }
        return b;

    }
}