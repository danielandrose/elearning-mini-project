package com.jocata.elearning_mini_project.dao;

import com.jocata.elearning_mini_project.bean.CourseBean;
import com.jocata.elearning_mini_project.entity.Course;

import java.util.List;

public interface StudentDao {

    public List<Course> getStudentById(int studentId);
}
