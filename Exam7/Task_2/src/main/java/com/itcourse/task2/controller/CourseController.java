package com.itcourse.task2.controller;

import com.itcourse.task2.entity.Course;
import com.itcourse.task2.model.CourseModel;
import com.itcourse.task2.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping
    public Course add(@RequestBody Course course){
        return courseService.addCourse(course);
    }
}
