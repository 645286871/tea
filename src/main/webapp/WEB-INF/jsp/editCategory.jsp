<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑页面</title>
</head>
<body>
   <div>
      <form action="updateCategory" method="post">
       name:<input type="text" name="name" value="${c.name }"><br>
       <input type="hidden" name="id" value="${c.id }">
       <button type="submit">更新提交</button>
      </form>
   </div>
</body>
</html>