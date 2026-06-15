package ProblemSolving;
public class LongestSubstring {

    public static void main(String[] args ) {
        String s = "pwwkew" ;

        int max = 0 ;
        for (int i = 0 ; i < s.length() ; i++) {

            String temp = "" ;
            for (int j = i ; j < s.length() ; j++) {

                char ch = s.charAt(j) ;

                if (temp.indexOf(ch) != -1) {
                    break ;
                }
                temp = temp + ch ;
                if (temp.length() > max) {
                    max = temp.length() ;
                }
            }
        }
        System.out.println("Output = " + max) ;
    }
}
