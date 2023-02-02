class Solution {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        String rev=new StringBuilder(s).reverse().toString();
        if(s.equals(rev)){
            return true;
        }
        else{
            return false;
        }
    }
}
