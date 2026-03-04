package JavaSession4_Strings;

public class titleCase {
        public static void main(String[] args) {

            String str = "hello world from java";
            String[] words = str.split(" ");
            String result = "";

            for (int i = 0; i < words.length; i++) {

                String word = words[i];

                if (word.length() > 0) {

                    result = result +
                            Character.toUpperCase(word.charAt(0)) +
                            word.substring(1).toLowerCase() + " ";
                }
            }

            System.out.println(result.trim());
        }
    }

