package core.module03.homework.task3_3;

import java.util.GregorianCalendar;

public class Solution {
    //    solution for task 3.3
    public static void main(String[] args) {
        GregorianCalendar startDate1 = new GregorianCalendar(2016, 7, 20);
        GregorianCalendar startDate2 = new GregorianCalendar(2016, 9, 20);
        GregorianCalendar startDate3 = new GregorianCalendar(2016, 11, 2);
        GregorianCalendar startDate4 = new GregorianCalendar(2017, 1, 20);
        GregorianCalendar startDate5 = new GregorianCalendar(2017, 3, 20);

        Course course1 = new Course(startDate1, "Course 1");
        Course course2 = new Course(startDate2, "Course 2");
        Course course3 = new Course(startDate3, "Course 3");
        Course course4 = new Course(startDate4, "Course 4");
        Course course5 = new Course("Course 5", 160, "Andriy");

        Course[] coursesTaken = new Course[5];
        coursesTaken[0] = new Course(startDate5, "Course 6");
        coursesTaken[1] = course1;
        coursesTaken[1] = course2;
        coursesTaken[1] = course3;
        coursesTaken[1] = course4;
        Student student1 = new Student("Alex", "Rudenko", 9);
        Student student2 = new Student("Rudenko", coursesTaken);

        CollegeStudent student3 = new CollegeStudent("Bogdsn", "Kushlyk", 8);
        CollegeStudent student4 = new CollegeStudent("Kushlyk", coursesTaken, "Bodya", 2, 2784564730948L);
        CollegeStudent student6 = new CollegeStudent("Gayducheck", coursesTaken);


        SpecialStudent student7 = new SpecialStudent("Bondar", coursesTaken, 54783728594372834L);
        SpecialStudent student8 = new SpecialStudent("Ivan", "Ivanov", 7);
        SpecialStudent student9 = new SpecialStudent("Baranov", coursesTaken, "Baran", 10, 547836473625098L);
    }
}
