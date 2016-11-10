package Core.Module03.Homework.Task3_3;

public class Student {
    private String firstName;
    private String lastName;
    private int group;
    private Course[] coursesTaken;
    private int age;

    Student() {

    }
    Student(String firstName, String lastName,int group){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }
    Student(String lastName, Course[] coursesTaken){
        this.lastName = lastName;
        this.coursesTaken = coursesTaken;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGroup() {
        return group;
    }

    public Course[] getCoursesTaken() {
        return coursesTaken;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setCoursesTaken(Course[] coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
