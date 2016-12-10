package core.module07.homework;

import java.util.Comparator;

public class SortByIncreasePriceAndCity implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        if (o1.getPrice() != o2.getPrice()) {
            return o1.getPrice() - o2.getPrice();
        } else {
            if (o1.getUser().getCity().compareTo(o2.getUser().getCity()) != 0) {
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
        }
        return 0;
    }
}
