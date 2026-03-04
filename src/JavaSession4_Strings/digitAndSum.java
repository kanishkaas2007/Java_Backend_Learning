package JavaSession4_Strings;

public class digitAndSum {
        public static void main(String[] args) {

            String str = "12345";
            int sum = 0;

            for (int i = 0; i < str.length(); i++) {

                char ch = str.charAt(i);

                if (Character.isDigit(ch)) {

                    sum = sum + (ch - '0');
                }
            }

            System.out.println(sum);
        }
    }

