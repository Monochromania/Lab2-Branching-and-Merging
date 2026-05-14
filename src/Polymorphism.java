public class Polymorphism {

    /**
     * Returns the role.
     * @param p the person whose role is to be returned
     * @return the role of the person
     */
    public static String getStudentRole(Person p) {
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