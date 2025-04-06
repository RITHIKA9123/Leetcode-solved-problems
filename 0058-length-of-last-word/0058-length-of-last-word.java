class Solution {
    public int lengthOfLastWord(String s) {
       
        String[] word=s.split(" ");
         int n=word.length;
        String len=word[n-1];
        return len.length();
    }
}