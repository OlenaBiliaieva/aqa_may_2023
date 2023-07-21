package school.comparators;

import school.subj.Subject;

import java.util.Comparator;

public class SubjectComparatorByHours implements Comparator<Subject> {
    @Override
    public int compare(Subject o1, Subject o2) {
        return Integer.compare(o1.getHours(), o2.getHours());
    }
}
