package JavaSession4_Strings;

public class countWords {

        public static void main(String[] args) {

            String str = "I love India";

            str = str.trim();
            String[] words = str.split("\\s+");

            System.out.println(words.length);
        }
    }


