package com.jocata.elearning_mini_project.service;

import com.jocata.elearning_mini_project.bean.CourseBean;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface StudentService {

    public List<CourseBean> getStudentById(int studentId);
}
