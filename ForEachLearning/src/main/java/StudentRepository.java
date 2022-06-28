import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    List<Student> studentList = new ArrayList<>();

    public List<Student> getAllStudents(){
        studentList.add(new Student(1001,"james","jack","james@gmail.com",20,10,70,80.0));
        studentList.add(new Student(1008,"kane","john","kane@gmail.com",22,11,40,50.0));
        studentList.add(new Student(1004,"tim","jack","tim@gmail.com",18,12,60,70.0));
        studentList.add(new Student(1020,"cook","alex","cook@gmail.com",25,10,20,30.0));
        studentList.add(new Student(2080,"root","cook","root@gmail.com",24,11,40,50.0));
        studentList.add(new Student(1000,"anderson","test","anderson@gmail.com",11,10,42,52.0));
        studentList.add(new Student(1008,"test","hello","test@gmail.com",20,11,12,22.0));
        studentList.add(new Student(1020,"Hi","james","hi@gmail.com",22,12,10,20.0));

        return studentList;
    }
}
