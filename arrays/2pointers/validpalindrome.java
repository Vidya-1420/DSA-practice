
class Solution {
    public boolean isPalindrome(String s) {
       
  
        String s1= s.toLowerCase();
        String s2=s1.replaceAll("[^a-z0-9]","");

        int left=0,right=s2.length()-1;
        while(left<right){
            if(s2.charAt(left)==s2.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
           
        }
        return true;

        
    }
    
}
