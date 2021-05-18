package com.itcourse.task2.service;

import com.itcourse.task2.entity.Course;
import com.itcourse.task2.model.CourseModel;

public interface CourseService {
    Course addCourse(Course course);
    Course addCourse(CourseModel courseModel);
}
