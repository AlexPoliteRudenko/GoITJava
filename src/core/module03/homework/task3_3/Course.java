package core.module03.homework.task3_3;

import java.util.GregorianCalendar;

public class Course {
    private GregorianCalendar startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

    Course(String name, int hoursDuration, String teacherName){
        this.name = name;
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }

    public Course(GregorianCalendar startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

    public GregorianCalendar getStartDate() {
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

    public void setStartDate(GregorianCalendar startDate) {
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
