package core.module08.homework;

public class User extends AbstractEntity{
    private String name;

    public User(long id, String name) {
        super(id);
        this.name = name;

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                "id='" + getId() + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
