package core.module08.homework;

import java.util.Iterator;

public class UserDAO<T extends AbstractEntity> extends AbstractDAOImpl<T> {

    @Override
    public void daleteById(long id) {
        Iterator iterator = getList().iterator();
        while (iterator.hasNext()) {
            T t =(T) iterator.next();
            if (t.id == id) {
                iterator.remove();
            }
        }
    }

    @Override
    public T get(long id) {
        for (T t : getList()) {
            if (t.id == id) {
                return t;
            }
        }

        return null;
    }
}
