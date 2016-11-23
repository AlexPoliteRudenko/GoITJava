package core.module04.Practice;

public class EngMonthDAO implements MonthDAO {
    @Override
    public boolean addWord(String word) {
        return false;
    }

    @Override
    public boolean updateWord(String src, String dest) {
        return false;
    }

    @Override
    public boolean delete(String wordToDelete) {
        return false;
    }

    @Override
    public String[] getList() {
        return new String[0];
    }
}
