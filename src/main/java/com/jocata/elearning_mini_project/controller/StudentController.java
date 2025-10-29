package com.jocata.elearning_mini_project.controller;

import com.jocata.elearning_mini_project.bean.CourseBean;
import com.jocata.elearning_mini_project.bean.StudentBean;
import com.jocata.elearning_mini_project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("{studentId}")
    public List<CourseBean> getStudentById(@PathVariable int studentId){
        if(studentId>0){
            return studentService.getStudentById(studentId);
        }
        else{
            return null;
        }
    }

}
