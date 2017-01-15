package core.module09.practice;

public interface PersonDao {
    void save(Person person);

    Person findByEmail(Person person);

}
