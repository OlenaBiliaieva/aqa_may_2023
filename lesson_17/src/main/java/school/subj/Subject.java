package school.subj;

import java.util.Objects;

public class Subject implements Comparable<Subject> {

    private int hours;
    private String name;


    public Subject(int hours, String name) {
        this.hours = hours;
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return hours == subject.hours && Objects.equals(name, subject.name);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "hours=" + hours +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Subject o) {
        return Integer.compare(hours, o.hours);
    }
}
