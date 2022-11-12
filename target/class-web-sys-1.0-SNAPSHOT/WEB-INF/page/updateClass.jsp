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
    $(function (){
        $("#updateBtn").click(function (){
            var id = $("body")[0].dataset['bodyid'];
            var teacherId = $(".teacherList").find('option:selected').val();
            var courseId = $(".courseList").find('option:selected').val();
            var professionId = $(".professionList").find('option:selected').val();
            var timeSegment = $("input[name='timeSegment']").val();
            var week = $("input[name='week']").val();
            console.log(id);
            console.log(teacherId);
            $.ajax({
                url:"http://localhost:8080/class/updateClass.do",
                data:JSON.stringify({
                    id:id,
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
                        alert("更改成功");
                    }else{
                        alert("失败");
                    }
                }
            })
        })
    })
</script>

<body data-bodyId="${useOfClass.id}">
班级编号：<p class="classId">${useOfClass.classId}</p>
<select class="teacherList">
    <c:forEach items="${teachers}" var="t">
        <option value="${t.teacherId}" <c:if test="${useOfClass.teacherId==t.teacherName}">selected="selected"</c:if> >${t.teacherName}</option>
    </c:forEach>
</select>
<select class="courseList">
    <c:forEach items="${courses}" var="c">
        <option value="${c.courseId}" <c:if test="${useOfClass.courseId==c.courseName}">selected="selected"</c:if> >${c.courseName}</option>
    </c:forEach>
</select>
<select class="professionList">
    <c:forEach items="${professions}" var="p">
        <option value="${p.professionId}" <c:if test="${useOfClass.professionId==p.professionName}">selected="selected"</c:if> >${p.professionName}</option>
    </c:forEach>
</select>
时间段：<input name="timeSegment" value="${useOfClass.timeSegment}">
星期：<input name="week" value="${useOfClass.week}">
<button id="updateBtn">完成</button>
</body>
</html>
