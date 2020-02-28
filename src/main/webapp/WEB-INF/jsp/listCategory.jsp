<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>分类查询</title>
</head>
<body>
<div align="center">
   <table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>编辑</td>
        <td>删除</td>
    </tr>
    <c:forEach items="${page.content}" var="c" varStatus="st">
        <tr>
            <td>${c.id}</td>
            <td>${c.name}</td>
            <td><a href="editCategory?id=${c.id }">编辑</td>
            <td><a href="deleteCategory?id=${c.id }">删除</td>    
        </tr>
    </c:forEach>
    
    </table>
    <br>
    <div>
            <a href="?start=0">[首  页]</a>
            <a href="?start=${page.number-1}">[上一页]</a>
            <a href="?start=${page.number+1}">[下一页]</a>
            <a href="?start=${page.totalPages-1}">[末  页]</a>	
    </div>
    
    <div>
      <form action="addCategory" method="post">
       name:<input type="text" name="name" value="${c.name }"><br>
       
       <button type="submit">提交</button>
      </form>
   </div>
</div>   
</body>
</html>