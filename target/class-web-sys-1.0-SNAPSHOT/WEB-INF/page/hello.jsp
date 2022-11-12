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


    $(function(){
        $("#classList").on("click","button[name='getInfoBtn']",function () {
            var classId = $(this).attr("value");
            console.log(classId);
            window.location.href="http://localhost:8080/class/getDetailInfo.do?classId="+classId;
        })

        $("#classList").on("click","button[name='orderBtn']",function () {
            var classId = $(this).attr("value");
            console.log(classId);
            window.location.href="http://localhost:8080/class/orderClass.do?classId="+classId;
        })

        $("#search").click(function (){
            var id = $("input[name='search']").val();
            console.log(id);
            $.ajax({
                url:"http://localhost:8080/class/getClassBySearch.do",
                data:{
                    id:id
                },
                type:"post",
                dataType:"json",
                success:function (res) {
                    var htmlStr = "";
                    console.log(res.data);
                    $.each(res.data,function (index,obj){
                        htmlStr += "<tr>";
                        htmlStr += "<td>"+index+"</td>";
                        htmlStr += "<td>"+obj.classId+"</td>";
                        htmlStr += "<td>"+obj.classType+"</td>";
                        htmlStr += "<td>"+obj.classContainer+"</td>";
                        htmlStr += "<td>"+obj.classType+"</td>";
                        htmlStr += " <td>"+obj.classMedia+"</td>";
                        htmlStr += "<td>";
                        htmlStr += "<button id=\"getInfoBtn"+obj.classId+"\" value=\""+obj.classId+"\">详情</button>";
                        htmlStr += "<button id=\"orderBtn"+obj.classId+"\" value=\""+obj.classId+"\">预约</button>";
                        htmlStr += "</td>";
                        htmlStr += "</tr>";
                    })
                    $("#classList").html(htmlStr);
                }
            })
        })

    });

</script>
<style type="text/css">
    #box{
        width: 380px;
        margin: 30px auto;
        font-family: 'Microsoft YaHei';
        font-size: 14px;
    }
    input{
        width: 260px;
        border: 1px solid #e2e2e2;
        height: 30px;
        float: left;
        background-image: url("../images/search.jpg");
        background-repeat: no-repeat;
        background-size: 25px;
        background-position:5px center;
        padding:0 0 0 40px;
    }
    #search{
        width: 78px;
        height: 32px;
        float: right;
        background: black;
        color: white;
        text-align: center;
        line-height: 32px;
        cursor: pointer;
    }
    /*美化表格*/
    table {
        position: relative;
        top: 50px;
        width: 90%;
        background: #ccc;
        margin: 10px auto;
        border-collapse: collapse;
        /*border-collapse:collapse合并内外边距
    (去除表格单元格默认的2个像素内外边距*/
    }
    th,
    td {
        height: 25px;
        line-height: 25px;
        text-align: center;
        border: 1px solid #ccc;
    }
    th {
        background: #eee;
        font-weight: normal;
    }
    tr {
        background: #fff;
    }
    tr:hover {
        background: #F8F8FF;
    }
    tbody:nth-child(odd){
        background: #FAF0E6;
    }
    tbody:nth-child(even){
        background: #FFFAF0;
    }
</style>
<body>

    <div id="box">
        <input type="search" name="search" placeholder="请输入教室编号">
        <div id="search">搜索</div>
    </div>
    <table>
        <thead>
            <tr>
                <th>索引</th>
                <th>教室编号</th>
                <th>教室类型</th>
                <th>容纳人数</th>
                <th>教室状态</th>
                <th>是否有多媒体</th>
                <th>操作</th>
            </tr>
        </thead>
        <tbody id="classList">
           <c:forEach items="${classList}" var="classroom" varStatus="loop">
            <tr>
                <td>${loop.index}</td>
                <td>${classroom.classId}</td>
                <td>${classroom.classType}</td>
                <td>${classroom.classContainer}</td>
                <td>${classroom.classType}</td>
                <td>${classroom.classMedia}</td>
                <td>
                    <button id="getInfoBtn${classroom.classId}" name="getInfoBtn" value="${classroom.classId}">详情</button>
                    <button id="orderBtn${classroom.classId}" name="orderBtn" value="${classroom.classId}">预约</button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>

