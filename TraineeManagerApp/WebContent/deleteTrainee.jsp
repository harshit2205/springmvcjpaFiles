<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<h1>Delete Operation</h1>
<f:form action="deletetrainee.obj" modelAttribute="trainee">
<table border="2">
	<tr>
	<td>Please enter Trainee Id</td>
	<td><input name="id" path="id"/></td>
	<td><input type="submit" value="search"/></td>
	</tr>
</table><br><br>
</f:form>

<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<c:if test="${view_mode==1}">
<f:form action="finaldelete.obj" modelAttribute="trainee">
<h1>Trainee Info</h1>
<table border=2>
<tr><td>Trainee Id</td>
<td>Trainee Name</td>
<td>Trainee Location</td>
<td>Trainee Domain</td></tr>
<tr><td>${trainee.id}</td>
<td>${trainee.name}</td>
<td>${trainee.location}</td>
<td>${trainee.domain}</td></tr>
<f:hidden path="id" value="${trainee.id}"/>
<tr><td colspan=4 align="right"><input type="submit" value="delete"></td></tr>
</table>
</f:form>
</c:if>




</body>
</html>