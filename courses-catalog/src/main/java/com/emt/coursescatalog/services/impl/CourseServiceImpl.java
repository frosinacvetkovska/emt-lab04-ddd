package com.emt.coursescatalog.services.impl;

import com.emt.coursescatalog.domain.exceptions.CourseNotFoundException;
import com.emt.coursescatalog.domain.models.Course;
import com.emt.coursescatalog.domain.models.CourseId;
import com.emt.coursescatalog.domain.repository.CourseRepository;
import com.emt.coursescatalog.services.CourseService;
import com.emt.coursescatalog.services.form.CourseForm;

import java.util.List;

public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Course findById(CourseId id) {
        return courseRepository.findById(id).orElseThrow(CourseNotFoundException::new);
    }

    @Override
    public Course createCourse(CourseForm form) {
        Course course = Course.build(form.getCourseName(),
                form.getCourseDescription(),
                form.getPrice(),
                form.getSales());
        courseRepository.save(course);
        return course;
    }

    @Override
    public Course enrollInCourse(CourseId id) {
        return null;
    }

    @Override
    public Course leaveCourse(CourseId id) {
        return null;
    }

    @Override
    public List<Course> getAll() {
        return courseRepository.findAll();
    }
}
