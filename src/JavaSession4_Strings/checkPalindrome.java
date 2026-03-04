package JavaSession4_Strings;

public class checkPalindrome {

        public static void main(String[] args) {

            String str = "Madam";
            str = str.toLowerCase();

            int l = 0;
            int r = str.length() - 1;
            boolean isPalindrome = true;

            while (l < r) {

                if (str.charAt(l) != str.charAt(r)) {
                    isPalindrome = false;
                    break;
                }

                l++;
                r--;
            }

            System.out.println(isPalindrome);
        }
    }

