package com.test.demo1;

import com.test.demo1.bean.Student;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.test.demo1.service.impl.StudentServiceImpl;

import java.util.List;

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
