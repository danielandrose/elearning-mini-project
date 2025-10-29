package com.jocata.elearning_mini_project.controller;

import com.jocata.elearning_mini_project.service.CourseService;
import com.jocata.elearning_mini_project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/{courseName}")
    public int getCountByCourseName(@PathVariable String courseName){

        if(!courseName.isBlank() && !courseName.isEmpty()){
            return courseService.getCountByCourseName(courseName);
        }
        else{
            return -1;
        }
    }
}
