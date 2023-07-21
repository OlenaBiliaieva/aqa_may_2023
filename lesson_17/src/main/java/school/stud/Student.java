package school.stud;

import school.comparators.SubjectComparatorByHours;
import school.comparators.SubjectComparatorByName;
import school.subj.Subject;
import school.wrapper.IntegerWraper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    private String name;
    private List<Subject> subjectList;

    public Student(String name, List<Subject> subjectList) {
        this.name = name;
        this.subjectList = subjectList;
    }

    public String getName() {
        return name;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public List<String> sortSubjectName() {
        List<String> result = new ArrayList<>();
        for (Subject s : subjectList) {
            result.add(s.getName());
        }
        Collections.sort(result);
        return result;
    }

    public List<Subject> sortSubjectByName() {
        List<Subject> subjects = new ArrayList<>(subjectList);
        Collections.sort(subjects, new SubjectComparatorByName());
        return subjects;
    }

    public List<Subject> sortSubjectByHours() {
        List<Subject> subjects = new ArrayList<>(subjectList);
        Collections.sort(subjects, new SubjectComparatorByHours());
        return subjects;
    }

    public int getHours() {
        List<IntegerWraper> hours = new ArrayList();
        for (Subject s : subjectList) {
            hours.add(new IntegerWraper(s.getHours()));
        }
        int summ = 0;
        for (IntegerWraper integerWraper : hours) {
            summ += integerWraper.getValue();
        }
        return summ;
    }


}
