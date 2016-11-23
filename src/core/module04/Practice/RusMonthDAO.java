package core.module04.Practice;

public class RusMonthDAO implements MonthDAO {
//    String[] arrayRus = new String[100];
    String[] arrayRus = {"Январь", "Февраль","Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
    @Override
    public boolean addWord(String word) {
//        TODO
        return false;
    }

    @Override
    public boolean updateWord(String src, String dest) {
//        TODO
        return false;
    }

    @Override
    public boolean delete(String wordToDelete) {
//        TODO
        return false;
    }

    @Override
    public String[] getList() {
        return arrayRus;
    }
}
