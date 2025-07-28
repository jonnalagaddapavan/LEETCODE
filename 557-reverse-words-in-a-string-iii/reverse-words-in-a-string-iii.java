class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        String s2 = new String(arr);
        System.out.println(s2);
        String[] arr1 = s2.trim().split("\\s+");
        int p1 = 0;
        int p2 = arr1.length-1;
        while(p1<p2)
        {
            String temp = arr1[p1];
            arr1[p1] = arr1[p2];
            arr1[p2] = temp;
            p1++;
            p2--;
        }
        String s3 = String.join(" ", arr1);
        return s3;
    }
}