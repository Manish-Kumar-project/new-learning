public class Student {
    private Integer studentId;
    private String firstName;
    private String lastName;
    private String gmail;
    private Integer age;
    private Integer stdClass;
    private Integer marks;
    private Double total;

    public Student(Integer studentId, String firstName, String lastName, String gmail, Integer age, Integer stdClass, Integer marks, Double total) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gmail = gmail;
        this.age = age;
        this.stdClass = stdClass;
        this.marks = marks;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gmail='" + gmail + '\'' +
                ", age=" + age +
                ", stdClass=" + stdClass +
                ", marks=" + marks +
                ", total=" + total +
                '}';
    }
}
