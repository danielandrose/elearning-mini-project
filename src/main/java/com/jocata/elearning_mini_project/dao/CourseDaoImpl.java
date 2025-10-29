package com.jocata.elearning_mini_project.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class CourseDaoImpl implements CourseDao{

    @PersistenceContext
    private EntityManager entityManager;

    public int getCountByCourseName(String courseName) {

        String query="SELECT COUNT(e) FROM EnrollmentLog e WHERE e.course.courseName = :courseName";
        Long count = entityManager.createQuery(
                        query, Long.class)
                .setParameter("courseName", courseName)
                .getSingleResult();

        return count.intValue();
    }

}
