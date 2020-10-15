<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
	<a href="add.jsp">新增</a>
	<table class="table table-bordered"">
		<tr>
			<td>ID</td>
			<td>姓名</td>
			<td>成绩</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list}" var="i">
			<tr>
				<td>${i.id }</td>
				<td>${i.name }</td>
				<td>${i.grade }</td>
				<td>
					<a href="byId?id=${ i.id}">✎</a>
					<a href="delete?id=${ i.id}">X</a>
				</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>