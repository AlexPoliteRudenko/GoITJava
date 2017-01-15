package core.module09.practice;

import java.util.Map;

import static core.module09.practice.UserPersonApp.*;

public class PersonController {
    static PersonDao personDao = new PersonDaoImpl();
    public static void save(Map<String, String> requestParams2) throws Exception {
        String name = requestParams2.get(FIRST_NAME);
        String lastName = requestParams2.get(LAST_NAME);
        String email = requestParams2.get(EMAIL);
        Person person = new Person(name, lastName, email);
        if ((name.isEmpty() || name == null) || (email.isEmpty() || email == null)) {
            throw new Exception("Name and Email must be filled!");
        }
        personDao.save(person);
    }

    public String findByEmail(Map<String, String> requestParams) {

        return "";
    }
}
