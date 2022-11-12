package com.hut.service.impl;

import com.hut.entity.Teacher;
import com.hut.mapper.teacherMapper;
import com.hut.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private teacherMapper teacherMapper;

    @Override
    public List<Teacher> queryAllTeacher() {
        return teacherMapper.selectAllTeacher();
    }
}
