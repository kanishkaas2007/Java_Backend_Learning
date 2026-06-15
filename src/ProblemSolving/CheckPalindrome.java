package ProblemSolving;
public class CheckPalindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();

        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        if (s.equals(rev)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
