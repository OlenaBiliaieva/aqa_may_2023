package school.comparators;

import school.subj.Subject;

import java.util.Comparator;

public class SubjectComparatorByName implements Comparator<Subject> {
    @Override
    public int compare(Subject o1, Subject o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
