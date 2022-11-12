<%--
  Created by IntelliJ IDEA.
  User: 一蓑烟雨
  Date: 2022/11/10
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<%--<link href="../js/bootstrap_3.3.0/css/bootstrap.min.css" type="text/css" rel="stylesheet" />--%>
<script type="text/javascript" src="../js/jquery-1.11.1-min.js"></script>

<script type="text/javascript">
    $(function(){

        $("#orderBtn").click(function (){
            var classId = $(".classId").text();
            var teacherId = $(".teacherList option:selected").val();
            var courseId = $(".courseList option:selected").val();
            var professionId = $(".professionList option:selected").val();
            var timeSegment = $("input[name='timeSegment']").val();
            var week = $("input[name='week']").val();
            $.ajax({
                url:"http://localhost:8080/class/addUseOfClass.do",
                data:JSON.stringify({
                    classId:classId,
                    teacherId:teacherId,
                    courseId:courseId,
                    professionId:professionId,
                    timeSegment:timeSegment,
                    week:week
                }),
                type:"post",
                contentType:"application/json; charset=utf-8",
                dataType:"json",
                success:function (res){
                    if(res.code==1){
                        alert("预约成功");
                    }else{
                        alert("失败");
                    }
                }
            })
        })

        }
    )
</script>

<body>
    班级编号：<p class="classId">${classId}</p>
    <select class="teacherList">
        <c:forEach items="${teachers}" var="t">
            <option value="${t.teacherId}">${t.teacherName}</option>
        </c:forEach>
    </select>
    <select class="courseList">
        <c:forEach items="${courses}" var="c">
            <option value="${c.courseId}">${c.courseName}</option>
        </c:forEach>
    </select>
    <select class="professionList">
        <c:forEach items="${professions}" var="p">
            <option value="${p.professionId}">${p.professionName}</option>
        </c:forEach>
    </select>
    时间段：<input name="timeSegment" value="" placeholder="格式：8:00-9:40">
    星期：<input name="week" value="" placeholder="请输入数字">
    <button id="orderBtn">预约</button>
</body>
</html>
