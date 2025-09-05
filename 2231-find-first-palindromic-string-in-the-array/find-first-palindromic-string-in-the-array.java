class Solution {
    public Boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(String a : words){
            if(isPalindrome(a)){
                return a;
            }
        }
        return "";
    }
}