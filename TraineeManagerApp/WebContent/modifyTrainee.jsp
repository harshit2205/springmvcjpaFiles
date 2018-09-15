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
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<h1>Modify Operation</h1>
<f:form action="retriveTrainee.obj" modelAttribute="trainee">
<table border="2">
	<tr>
	<td>Please enter Trainee Id</td>
	<td><input name="id" path="id"/></td>
	<td><input type="submit" value="modify"/></td>
	</tr>
</table>
</f:form>
<br><br>
<c:if test="${view_mode==1}">
<h1>Trainee Info</h1>
<f:form action="updateTrainee.obj" modelAttribute="trainee">
<table border=2>
<tr><td>Trainee Id</td>
<td><f:input type="text" path="id"  readonly="true"/></td></tr>
<tr><td>Trainee Name</td>
<td><f:input type="text" path="name" /></td></tr>
<tr><td>Trainee Location</td>
<td><f:input type="text" path="location"/></td></tr>
<tr><td>Trainee Domain</td>
<td><f:input type="text" path="domain" /></td></tr>
<tr><td colspan=2 align="right"><input type="submit" value="update"/></td></tr>
</table>
</f:form>
</c:if>

</body>
</html>