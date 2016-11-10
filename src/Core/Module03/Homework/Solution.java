package Core.Module03.Homework;

import java.util.Date;

public class Solution {
    //    Solution for task 3.3
    Date startDate1 = new Date(116, 7, 20);
    Date startDate2 = new Date(116, 9, 20);
    Date startDate3 = new Date(116, 11, 2);
    Date startDate4 = new Date(117, 1, 20);
    Date startDate5 = new Date(117, 3, 20);

    Course course1 = new Course(startDate1, "Course 1", 160, "Andriy");
    Course course2 = new Course(startDate2, "Course 2", 160, "Pasha");
    Course course3 = new Course(startDate3, "Course 3", 160, "Anna");
    Course course4 = new Course(startDate4, "Course 4", 160, "Illia");
    Course course5 = new Course(startDate5, "Course 5", 160, "Boris");
    Course course6 = new Course();

    Course[] coursesTaken = new Course[5];
    Student student0 = new Student();
    Student student1 = new Student("Alex", "Rudenko", 9);
    Student student2 = new Student("Rudenko", coursesTaken);

    CollegeStudent student3 = new CollegeStudent("Bogdsn", "Kushlyk", 8);
    CollegeStudent student4 = new CollegeStudent("Kushlyk", coursesTaken);
    CollegeStudent student5 = new CollegeStudent();
    CollegeStudent student6 = new CollegeStudent("Kush", 99, 458734987546732987L);


    SpecialStudent student7 = new SpecialStudent(54783728594372834L, "rem@i.ua");
    SpecialStudent student8 = new SpecialStudent("Ivan", "Ivanov", 7);
    SpecialStudent student9 = new SpecialStudent("Baranov", coursesTaken);



}
