package service.impl;

import bean.Student;
import org.springframework.stereotype.Service;
import service.StudentService;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


    @Override
    public List<Student> getAllStudents() {
        List<Student> list = returnlist();
//        List<Integer> ages = list.stream().map(student -> student.getAge()).collect(Collectors.toList());

        List<Student> listStudent = new ArrayList<>();
        //Stream入口方式一
//        list.stream().map(student -> Stream.of(student).filter(student1 -> student1.getAge() > 19).peek(student1 -> listStudent.add(student1)).count());


        //Stream入口方式二
        list.stream().filter(student -> student.getAge() > 19)
                .peek(student -> listStudent.add(student)
                ).count();
        return listStudent;
    }

    public static List<Student> returnlist(){
        List<Student> list = new ArrayList<>();
        Student stu = new Student();
        stu.setAge(20);
        stu.setName("小红");
        stu.setSex("女");
        list.add(stu);

        Student stu1 = new Student();
        stu1.setAge(21);
        stu1.setName("小明");
        stu1.setSex("男");
        list.add(stu);

        Student stu2 = new Student();
        stu2.setAge(22);
        stu2.setName("小刚");
        stu2.setSex("男");
        list.add(stu);

        return list;
    }
}
