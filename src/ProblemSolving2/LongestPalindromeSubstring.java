package ProblemSolving2;
public class LongestPalindromeSubstring {
    public static void main(String[] args) {

        String s = "babad";
        String longest = "";

        for(int i = 0; i < s.length(); i++) {
            for(int j = i; j < s.length(); j++) {
                String word = s.substring(i, j + 1);

                if(check(word)) {
                    if(word.length() > longest.length()) {
                        longest = word;
                    }
                }
            }
        }
        System.out.println(longest);
    }

    public static boolean check(String str) {

        String reverse = "";
        for(int i = str.length()-1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        if(str.equals(reverse))
            return true;
        else
            return false;
    }
}
