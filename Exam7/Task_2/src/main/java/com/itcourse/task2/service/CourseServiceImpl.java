package com.itcourse.task2.service;

import com.itcourse.task2.entity.Course;
import com.itcourse.task2.model.CourseModel;
import com.itcourse.task2.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepo courseRepo;
    @Autowired
    private UserService userService;

    @Override
    public Course addCourse(Course course) {
        return courseRepo.save(course);
    }

    @Override
    public Course addCourse(CourseModel courseModel) {
        return null;
    }
}
