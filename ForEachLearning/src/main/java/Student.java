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

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getStdClass() {
        return stdClass;
    }

    public void setStdClass(Integer stdClass) {
        this.stdClass = stdClass;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
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
