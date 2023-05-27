package com.emt.coursescatalog.domain.repository;

import com.emt.coursescatalog.domain.models.Course;
import com.emt.coursescatalog.domain.models.CourseId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, CourseId> {
}

