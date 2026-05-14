public class Polymorphism {
    // TODO TASK 1: Fix the bugs in this code to pass PolymorphismTest.java

    /**
     * Returns the role.
     * @param p the person whose role is to be returned
     * @return the role of the person
     */
    public static String getStudentRole(Person p) {
        // TODO: right now for student, it is not returning the role to be student.
        return p.getRole();
    }
}

class Person {
    private final String role = "General";
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getRole(){
        return this.role;
    }
}

class Student extends Person {
    private final String role = "Student";
    private final String studentId;

    public Student(String name, String studentId) {
        super(name);
        this.studentId = studentId;
    }

    public String getRole(){
        return this.role;
    }
}