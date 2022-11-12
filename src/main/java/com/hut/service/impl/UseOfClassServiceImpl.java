package com.hut.service.impl;

import com.hut.entity.UseOfClass;
import com.hut.mapper.UseOfClassMapper;
import com.hut.service.UseOfClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UseOfClassServiceImpl implements UseOfClassService {

    @Autowired
    private UseOfClassMapper useOfClassMapper;

    @Override
    public List<UseOfClass> queryUseOfClassById(String classId) {
        return useOfClassMapper.getUseOfClassById(classId);
    }

    @Override
    public int addUseOfClass(UseOfClass useOfClass) {
        System.out.println("service:"+useOfClass);
        return useOfClassMapper.addUseOfClass(useOfClass);
    }

    @Override
    public int deleteUseOfClass(String id) {
        System.out.println("service"+id);
        return useOfClassMapper.deleteUseOfClass(id);
    }

    @Override
    public int updateUseOfClass(UseOfClass useOfClass) {
        System.out.println("service"+useOfClass);
        return useOfClassMapper.updateUseOfClass(useOfClass);
    }

    @Override
    public UseOfClass queryUseById(String id) {
        return useOfClassMapper.getUseById(id);
    }
}
