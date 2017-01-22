package core.module11.homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class Task01 {
    static void Solution() {
        String var = readFileToString("src/core/module11/homework/test.txt");
        Map<String, String> map = getMapWithReplaceParameters();
        String replaceResult = replacer(map, var);
        System.out.println(replaceResult);
    }

    static Map<String, String> getMapWithReplaceParameters() {
        Map<String, String> map = new HashMap<>();
        map.put("some", "this");
//        map.put("this", "some");
        map.put("text", "information");
//        map.put("information", "text");
        return map;
    }

    static String readFileToString(String pathname) {
        String line;
        StringBuilder buffer = new StringBuilder("");
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(pathname)))) {
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
                buffer.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer.toString();
    }

    static String replacer(Map<String, String> map, String var) {

        for (Map.Entry<String, String> entry : map.entrySet()) {
            var = var.replaceAll(entry.getKey(), entry.getValue());
        }
        return var;
    }

}
