package Core.Module03.Homework.Task3_3;

import java.util.Date;

public class Course {
    private Date startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;
    Course(Date startDate, String name, int hoursDuration, String teacherName){
        this.startDate = startDate;
        this.name = name;
        this.hoursDuration = hoursDuration;
        this. teacherName = teacherName;
    }

    public Course() {
    }

    public Date getStartDate() {
        return startDate;
    }

    public String getName() {
        return name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
