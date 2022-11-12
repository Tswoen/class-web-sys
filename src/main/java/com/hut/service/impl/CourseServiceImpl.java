package com.hut.service.impl;

import com.hut.entity.Course;
import com.hut.mapper.CourseMapper;
import com.hut.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> queryCourseAll() {
        return courseMapper.selectCourseAll();
    }
}
