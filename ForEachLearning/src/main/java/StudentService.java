import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentService {

    public void getAllStudents(){
        StudentRepository studentRepository =new StudentRepository();
        List<Student> studentList = new ArrayList<>();
        studentList = studentRepository.getAllStudents();
        studentList.forEach(student -> {
            System.out.println(student.getStudentId()+" "+student.getFirstName()+" "+student.getLastName()+" "+student.getAge()+" "+student.getGmail()+" "+student.getMarks()+" "+student.getTotal());
        });
        List<Student> students = studentList.stream().filter(student -> student.getFirstName().equals("james"))
                .collect(Collectors.toList());
        studentList.forEach(System.out::println);
    }
}
