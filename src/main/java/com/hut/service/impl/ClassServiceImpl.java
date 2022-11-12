package com.hut.service.impl;

import com.hut.entity.ClassRoom;
import com.hut.entity.UseOfClass;
import com.hut.mapper.classMapper;
import com.hut.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    private classMapper classMapper;

    public List<ClassRoom> queryAllOfClass(){
        List<ClassRoom> classes = classMapper.selectAllOfClass();
        return classes;
    }

    @Override
    public List<ClassRoom> queryClassByLike(String id) {
        return classMapper.selectClassByLike(id);
    }



}
