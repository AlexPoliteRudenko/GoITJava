package Core.Module03.Homework.Task3_3;

public class SpecialStudent extends CollegeStudent {
    private long secretKey;
    private String email;

    SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    SpecialStudent(String lastName, Course[] coursesTaken, String collegeName, int rating, long id) {
        super(lastName, coursesTaken, collegeName, rating, id);
    }

    SpecialStudent(String lastName, Course[] coursesTaken, long secretKey) {
        super(lastName, coursesTaken);
        this.secretKey = secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public long getSecretKey() {

        return secretKey;
    }

    public String getEmail() {
        return email;
    }
}
