import java.util.ArrayList;
import java.util.List;

public class StudentService {

    public void getAllStudents(){
        StudentRepository studentRepository =new StudentRepository();
        List<Student> studentList = new ArrayList<>();
        studentList = studentRepository.getAllStudents();
        studentList.forEach(System.out::println);
    }
}
