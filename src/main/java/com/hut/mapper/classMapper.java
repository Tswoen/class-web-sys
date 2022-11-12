package com.hut.mapper;

import com.hut.entity.ClassRoom;
import com.hut.entity.UseOfClass;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface classMapper {
    List<ClassRoom> selectAllOfClass();
    List<ClassRoom> selectClassByLike(@Param("id") String id);

}
