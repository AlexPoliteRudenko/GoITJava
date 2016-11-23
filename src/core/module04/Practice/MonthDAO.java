package core.module04.Practice;

public interface MonthDAO {
    boolean addWord(String word);
    boolean updateWord(String src, String dest);
    boolean delete(String wordToDelete);
    String[] getList();
}
