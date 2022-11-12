package com.hut.mapper;

import com.hut.entity.UseOfClass;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UseOfClassMapper {
    List<UseOfClass> getUseOfClassById(String classId);
    int addUseOfClass(UseOfClass useOfClass);
    int deleteUseOfClass(@Param("id") String id);
    int updateUseOfClass(UseOfClass useOfClass);
    UseOfClass getUseById(String id);
}
