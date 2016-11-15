package Core.Module03.Homework.Task3_3;

public class CollegeStudent extends Student {
    private String collegeName;
    private int rating;
    private long id;

    CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    CollegeStudent(String lastName, Course[] coursesTaken, String collegeName, int rating, long id) {

        super(lastName, coursesTaken);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;

    }

    public String getCollegeName() {
        return collegeName;
    }

    public int getRating() {
        return rating;
    }

    public long getId() {
        return id;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setId(long id) {
        this.id = id;
    }
}