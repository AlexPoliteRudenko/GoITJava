package core.module08.homework;

import java.util.List;

public interface AbstractDAO<T extends AbstractEntity> {
    T save(T t);
    void delete(T t);
    void deleteAll(List <? extends T> tList);
    void saveAll(List <? extends T> tList);
    List <? extends T> getList();
    void daleteById(long id);
    T get(long id);
}
