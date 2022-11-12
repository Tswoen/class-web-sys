package com.hut.service;

import com.hut.entity.UseOfClass;
import com.hut.mapper.classMapper;
import com.hut.entity.ClassRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClassService {

    List<ClassRoom> queryAllOfClass();
    List<ClassRoom> queryClassByLike(String id);

}
