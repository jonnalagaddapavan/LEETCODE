class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        Arrays.sort(letters);
        char tar = target;
        TreeSet<Character> set = new TreeSet<>();
        for(char c : letters)
        {
            set.add(c);
        }
        System.out.println(set);
        if(set.contains(target))
        {
            set.remove(target);
        }
        for(char ch : set)
        {
            if(ch > tar)
            {
                tar = ch;
                break;
            }
        }
        System.out.println(tar);
        if(tar == target)
        {
            return letters[0];
        }
        return tar;
    }
}