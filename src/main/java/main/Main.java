package main;

import student.Student;

public class Main {

   
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setFirstName("Mihajlo");
        student1.setLastName("Pavlovic");
        student1.setYearOfBirth(1988);
        student1.getCourse().setName("QA");
        student1.getCourse().setNumberOfClasses(60);
        student1.getCourse().setCodeName("/");
        student1.getComputer().setOperatingSystem("Linux");
        student1.getComputer().setProcessTact(4.0);
        student1.getComputer().setMemory(16.0);
        student1.getComputer().setHardDrive(2000);
        student1.info();
    }
    
}
