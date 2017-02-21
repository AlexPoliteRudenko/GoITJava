package core.module11.homework;


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Task04 {
    static void solution() {
        String pathname = "src/core/module11/homework/test.txt";
        String var = Task01.readFileToString(pathname);
        int containTimes = checkWord("some", var);
        System.out.println(containTimes);
        String line= null;
        String line1 = "abc";
    }

    private static int checkWord(String word, String text) {
//        int counter = 0;
//        Pattern p = Pattern.compile(word);
//        Matcher m = p.matcher(text);
//        while (m.find()) {
//            counter++;
//        }
//        return counter;

        return (int)Arrays.stream(text.split("[\n ,\\.]")).filter(s->s.equals(word)).count();

    }
}
