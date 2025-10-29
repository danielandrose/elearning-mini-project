package com.jocata.elearning_mini_project.service;

import com.jocata.elearning_mini_project.bean.CourseBean;
import com.jocata.elearning_mini_project.dao.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    public int getCountByCourseName(String courseName){

        return courseDao.getCountByCourseName(courseName);
    }
}
