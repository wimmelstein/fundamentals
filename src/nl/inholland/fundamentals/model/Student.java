package nl.inholland.fundamentals.model;

public class Student extends Person {

    private String group;

    public Student(String name, String email, String group) {
        super(name, email);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return String.format("Student: name=%s, email=%s, group=%s", super.getName(), super.getEmail(), this.getGroup());
    }
}
