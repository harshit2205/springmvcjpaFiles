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
<f:form action="inserttrainee.obj" modelAttribute="trainee">
<table>
	<tr><td>Trainee Id </td><td colspan=5 align="left"><f:input path="id"/>
	<f:errors cssStyle="color:red" path="id"/><br/></td></tr>
	<tr><td>Trainee Name</td><td colspan=5 align="left"><f:input path="name"/>
	<f:errors cssStyle="color:red" path="name"/><br/></td></tr>
	<tr><td >Trainee Location</td>
	<td><f:radiobutton value="Chennai"   label="Chennai"     path="location"/></td>
	<td><f:radiobutton value="Bangalore" label="Bangalore"   path="location"/></td>
	<td><f:radiobutton value="Pune"      label="Pune"        path="location"/></td>
	<td><f:radiobutton value="Mumbai"    label="Mumbai"      path="location"/></td>
	<td><f:errors cssStyle="color:red" path="location"/></td> <br/>
	</tr>
	<tr><td>Trainee Domain</td>
	<td colspan=4 align="left">
	<f:select path="domain" label="select">
	  <option value="java">java</option>
	  <option value="Bussiness_intell">Bussiness Intell</option>
	  <option value="testing">testing</option>
	  <option value="propel">propel</option>
	</f:select>
	<td><f:errors cssStyle="color:red" path="domain"/></td>
	</td></tr>
	<tr><td><input type="submit" value="Add Trainee"/></td></tr>
</table>
</f:form>
</body>
</html>