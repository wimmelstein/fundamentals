package nl.inholland.fundamentals.model;

public class Student {

    private String name;
    private boolean present;

    public Student(String name, boolean present) {
        this.name = name;
        this.present = present;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", present=" + present +
                '}';
    }
}
