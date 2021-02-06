public class Palindrome {

    public static boolean isPalindrome(int x) {
        if(x<0)
            return false;
        else{
            String xStr = Integer.toString(x);
            for(int i=0;i<xStr.length();i++){
                if(xStr.charAt(i) != xStr.charAt(xStr.length()-i-1))
                    return false;
            }

        }
        return true;
    }

    public static void main(String args[]){
        System.out.println(isPalindrome(12211));
    }
}
