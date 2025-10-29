package com.jocata.elearning_mini_project.service;

import com.jocata.elearning_mini_project.bean.CourseBean;
import com.jocata.elearning_mini_project.dao.StudentDao;
import com.jocata.elearning_mini_project.dao.StudentDaoImpl;
import com.jocata.elearning_mini_project.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    public List<CourseBean> getStudentById(int studentId){
        List<Course> courses=studentDao.getStudentById(studentId);

        List<CourseBean> courseBeans = new ArrayList<>();

        for(Course course: courses){
            CourseBean bean = new CourseBean();
            bean.setCourseId(course.getCourseId());
            bean.setCourseName(course.getCourseName());
            bean.setCourseContent(course.getCourseContent());
            bean.setCourseType(course.getCourseType());
            bean.setCreatedAt(course.getCreatedAt());
            bean.setDeletedAt(course.getDeletedAt());

            courseBeans.add(bean);
        }

        return courseBeans;
    }
}
