package com.alura.platform.business.course.service;

import com.alura.platform.business.basic.BasicService;
import com.alura.platform.business.course.dto.CourseDto;
import com.alura.platform.business.course.dto.CourseFilterDto;
import com.alura.platform.business.course.dto.CourseFilterResponseDto;
import com.alura.platform.business.course.entity.Course;

import java.util.List;

public interface CourseService extends BasicService<Course, Long> {
    Course save(CourseDto courseDto);

    void inactivate(String code);

    List<CourseFilterResponseDto> findByFilters(CourseFilterDto filter);

}
