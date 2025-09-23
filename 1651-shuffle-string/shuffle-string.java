class Solution {
    public String restoreString(String s, int[] indices) {
        HashMap<Integer,Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(indices[i],s.charAt(i));
        }
        ArrayList<Integer> li = new ArrayList<>(map.keySet());
        Collections.sort(li);
        char[] arr = new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            arr[i] = map.get(li.get(i));
        }
        String str = new String(arr);
        return str;

    }
}