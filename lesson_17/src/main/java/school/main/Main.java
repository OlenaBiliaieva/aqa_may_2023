package school.main;

import school.stud.Student;
import school.subj.Subject;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Subject> subjectList = new ArrayList<>();
        subjectList.add(new Subject(10,"Math"));
        subjectList.add(new Subject(12,"Biologi"));
        Student student = new Student("Olha", subjectList);
        //System.out.println(student.sortSubjectName());

        System.out.println(student.sortSubjectByName());
        System.out.println(student.getHours());
    }
}
