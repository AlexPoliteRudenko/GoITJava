package core.module05.practice;

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
