<%@page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<%--<link href="../js/bootstrap_3.3.0/css/bootstrap.min.css" type="text/css" rel="stylesheet" />--%>
<script type="text/javascript" src="../js/jquery-1.11.1-min.js"></script>
<%--<script type="text/javascript" src="../js/bootstrap_3.3.0/js/bootstrap.min.js"></script>--%>

<script type="text/javascript">
    $(function (){
        // 删除教室预约
        $(".delClass").click(function (){
            var id = $(this).attr("value");
            console.log(id);
            $.ajax({
                url:"http://localhost:8080/class/deleteClass.do",
                data:{
                    id:id
                },
                type:"post",
                dataType:"json",
                success:function (res){
                    if(res.code==1){
                        alert("删除成功");
                    }else{
                        alert("删除失败");
                    }
                }
            })
        })
        // 更改教室预约
        $(".updateClass").click(function (){
            var id = $(this).attr("value");
            console.log(id);
            window.location.href="http://localhost:8080/class/toUpdate.do?id="+id;
        })
    })
</script>

<style>
    h2{
        position: relative;
        top: 10px;
        left: 10px;
        bottom: 20px;
    }
    .div_box{
        display: flex;

    }
    .div_class{
        /*设置矩形的宽*/
        width:200px;
        /*设置矩形的高*/
        height:150px;
        /*设置矩形的背景颜色*/
        background-color:white;
        /*设置矩形的边框*/
        /*dashed表示虚线，solid表示实线*/
        border-radius: 18px;
        border: 1px black dashed ;
        /* x偏移量 | y偏移量 | 阴影模糊半径 | 阴影扩散半径 | 阴影颜色 */
        box-shadow: 2px 2px 2px 1px rgba(0, 0, 0, 0.2);
        padding: 10px 10px 10px 10px;
        margin: 10px 20px 20px 20px;
    }
</style>

<body>
<h2>教室安排详情</h2>
    <div class="div_box">
        <c:forEach items="${useInfoList}" var="useInfo">
            <div class="div_class">
                <div>教室编号: ${useInfo.classId}</div>
                <div>授课老师: ${useInfo.teacherId}</div>
                <div>专业名称: ${useInfo.professionId}</div>
                <div>课程名: ${useInfo.courseId}</div>
                <div>星期: ${useInfo.week}</div>
                <div>上课时间: ${useInfo.timeSegment}</div>
                <div>
                    <button class="delClass" value="${useInfo.id}">删除预定</button>
                    <button class="updateClass" value="${useInfo.id}">更改预定</button>
                </div>
            </div>
        </c:forEach>
    </div>
</body>
</html>
