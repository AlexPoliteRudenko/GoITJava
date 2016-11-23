package core.module04.Practice;

public class ServiceLogic {
    public static void main(String[] args) {
        MonthDAO monthDAO;

        String user = "american";
        String monthToAdd = null;
        switch (user) {
            case "american":
                monthDAO = getRusMonthDAO();
                monthToAdd = "Трябрь";
                break;
            case "russian":
                monthDAO = getEngMonthDAO();
                monthToAdd = "Трябрь";
                break;

        }

    }

    public static MonthDAO getRusMonthDAO() {
        return new RusMonthDAO();
    }

    public static MonthDAO getEngMonthDAO() {
        return new EngMonthDAO();
    }
}
