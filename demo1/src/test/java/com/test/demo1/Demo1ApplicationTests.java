package com.test.demo1;

import bean.Student;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import service.StudentService;
import service.impl.StudentServiceImpl;

import javax.annotation.security.RunAs;
import java.util.List;
import java.util.stream.Stream;

@SpringBootTest
@RunWith(SpringRunner.class)
class Demo1ApplicationTests {

    @Test
    void contextLoads() {
        StudentServiceImpl studentService = new StudentServiceImpl();
        List<Student> list = studentService.getAllStudents();
        list.stream().peek(student -> System.out.println(student.getName())).count();
    }

}
