package core.module05.Practice;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class RemoveSymbol {
    public static void main(String[] args) {
        String line ="Fine homework. Great to deal with you.";
        System.out.println(removeSymbolFromString(line, " "));
    }

    private static String removeSymbolFromString(String list, String symbol) {
        if (symbol == null) {
            return list;
        }
//        char symbolChar = symbol.charAt(0);
        String newString = list.replaceAll(symbol, "");
        return newString;

    }
}
