class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> list = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] ch = s.toCharArray();
        int i = 0;
        int j = ch.length-1;
        while(i<j)
        {
            while(i<j && !list.contains(ch[i]))
            {
                i++;
            }
            while(i<j && !list.contains(ch[j]))
            {
                j--;
            }

            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

            i++;
            j--;
        }
        System.out.println(ch);
        String str = new String(ch);
        return str;
    }
}