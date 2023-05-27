package com.emt.coursescatalog.services;

import com.emt.coursescatalog.domain.models.Course;
import com.emt.coursescatalog.domain.models.CourseId;
import com.emt.coursescatalog.services.form.CourseForm;

import java.util.List;

public interface CourseService {
    Course findById(CourseId id);
    Course createCourse(CourseForm form);
    Course enrollInCourse(CourseId id);
    Course leaveCourse(CourseId id);
    List<Course> getAll();
}
