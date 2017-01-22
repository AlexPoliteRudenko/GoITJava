package core.module11.practice;

import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task01 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();
        List<String> words = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter numbers int, double or else line. For exit print 'q'");

        try {
            while (true) {
                String line = reader.readLine();
                try {
                    integers.add(Integer.parseInt(line));
                } catch (NumberFormatException e) {
                    try {
                        doubles.add(Double.parseDouble(line));
                    } catch (NumberFormatException e1) {
                        if (line.equals("q")) {
                            break;
                        }
                        words.add(line);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(integers);
        System.out.println(doubles);
        System.out.println(words);

    }
}
