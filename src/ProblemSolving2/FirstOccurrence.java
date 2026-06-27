package ProblemSolving2;

public class FirstOccurrence {

    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";
        int index = -1;

        for(int i = 0; i <= haystack.length() - needle.length(); i++) {
            String temp = haystack.substring(i, i + needle.length());

            if(temp.equals(needle)) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
