class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i) == ' ' && count ==0){
                continue;
            }
            if(s.charAt(i) == ' '){
                break;
            }
            count++;
        }
        return count;
    }
}
