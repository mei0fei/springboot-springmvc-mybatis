<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form:form method="POST" action="/addEmployee" modelAttribute="employee">
    <form:label path="name">Name</form:label>
    <form:input path="name" />
     
    <form:label path="id">Id</form:label>
    <form:input path="id" />
     
    <input type="submit" value="Submit" />
</form:form>


</body>
</html>