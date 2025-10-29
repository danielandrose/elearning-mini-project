package com.jocata.elearning_mini_project.dao;

import com.jocata.elearning_mini_project.bean.CourseBean;
import com.jocata.elearning_mini_project.entity.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Course> getStudentById(int studentId){

        String query = "SELECT e.course FROM EnrollmentLog e WHERE e.student.studentId = :studentId";
        List<Course> courses = entityManager.createQuery(query, Course.class)
                .setParameter("studentId", studentId)
                .getResultList();

        return courses;
    }
}
