package Core.Module03.Homework;

public class SpecialStudent extends CollegeStudent {
    private long secretKey;
    private String email;


    public SpecialStudent(long secretKey, String email) {
        this.secretKey = secretKey;
        this.email = email;
    }

    public SpecialStudent(String lastName, Course[] coursesTaken) {

        super(lastName, coursesTaken);
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
    public SpecialStudent(String firstName, String lastName, int group) {

        super(firstName, lastName, group);
    }
}
