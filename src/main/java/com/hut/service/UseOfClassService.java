package com.hut.service;


import com.hut.entity.UseOfClass;

import java.util.List;

public interface UseOfClassService {
    List<UseOfClass> queryUseOfClassById(String classId);
    int addUseOfClass(UseOfClass useOfClass);
    int deleteUseOfClass(String id);
    int updateUseOfClass(UseOfClass useOfClass);
    UseOfClass queryUseById(String id);
}
