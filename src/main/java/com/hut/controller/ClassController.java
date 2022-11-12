package com.hut.controller;

import com.hut.entity.*;
import com.hut.service.*;
import com.hut.utils.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/class")
public class ClassController {

    @Autowired
    private ClassService classService;
    @Autowired
    private UseOfClassService useOfClassService;
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private CourseService courseService;
    @Autowired
    private ProfessionService professionService;

    @GetMapping("/getAll.do")
    public String getAll(HttpServletRequest request){
        List<ClassRoom> classRooms = classService.queryAllOfClass();
        request.setAttribute("class1",classRooms.get(0));
        request.setAttribute("classList",classRooms);
        System.out.println(classRooms);
        return "hello";
    }

    @PostMapping("/getClassBySearch.do")
    public @ResponseBody Result<List> getClassBySearch(String id){
        Result<List> result = new Result<>();
        List<ClassRoom> classRooms = classService.queryClassByLike(id);
        System.out.println(classRooms.get(0));
        if(classRooms != null){
            result.setMeg("返回成功");
            result.setCode(1);
            result.setData(classRooms);
        }else{
            result.setMeg("返回失败");
            result.setCode(0);
        }
        return result;
    }

    @GetMapping("/getDetailInfo.do")
    public String getDetailInfo(String classId,HttpServletRequest request){
        List<UseOfClass> useOfClassInfoList = useOfClassService.queryUseOfClassById(classId);
        request.setAttribute("useInfoList",useOfClassInfoList);
        return "classDetailInfo";
    }

    @GetMapping("/orderClass.do")
    public String orderClass(String classId,HttpServletRequest request){
        List<Teacher> teachers = teacherService.queryAllTeacher();
        List<Course> courses = courseService.queryCourseAll();
        List<Profession> professions = professionService.queryProfessionAll();
        request.setAttribute("classId",classId);
        request.setAttribute("teachers",teachers);
        request.setAttribute("courses",courses);
        request.setAttribute("professions",professions);
        return "orderClass";
    }

    @PostMapping("/addUseOfClass.do")
    public @ResponseBody Result addUseOfClass(@RequestBody UseOfClass useOfClass){
        System.out.println(useOfClass);
        useOfClass.setId(UUIDUtils.getUUID().substring(0,20));
        int i = useOfClassService.addUseOfClass(useOfClass);
        System.out.println(i);
        Result result = new Result();
        if(i!=0){
            result.setCode(1);
        }else{
            result.setCode(0);
        }
        return result;
    }

    @PostMapping("/deleteClass.do")
    public @ResponseBody Result deleteClass(String id){
        Result result = new Result();
        System.out.println(id);
        int i = useOfClassService.deleteUseOfClass(id);
        if(i!=0){
            result.setCode(1);
        }else{
            result.setCode(0);
        }
        return result;
    }

    @GetMapping("/toUpdate.do")
    public String toUpdate(String id,HttpServletRequest request){
        UseOfClass useOfClass = useOfClassService.queryUseById(id);
        List<Teacher> teachers = teacherService.queryAllTeacher();
        List<Course> courses = courseService.queryCourseAll();
        List<Profession> professions = professionService.queryProfessionAll();
        request.setAttribute("useOfClass",useOfClass);
        request.setAttribute("teachers",teachers);
        request.setAttribute("courses",courses);
        request.setAttribute("professions",professions);
        return "updateClass";
    }

    @PostMapping("/updateClass.do")
    public @ResponseBody Result updateClass(@RequestBody UseOfClass useOfClass){
        Result result = new Result();
        System.out.println(useOfClass);
        int i = useOfClassService.updateUseOfClass(useOfClass);
        if(i!=0){
            result.setCode(1);
        }else{
            result.setCode(0);
        }
        return result;
    }

}
