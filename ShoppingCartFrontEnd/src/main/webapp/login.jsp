<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- it's not a normal form but a spring for jstl tag form-->
<spring:form>

<spring:input path="userID"/> <!--  give a path -->

<spring:password path="password"/>

<spring:button name="login">

</spring:button>

</spring:form>
Login Page

</body>
</html>

<!-- all pages should be in the same page - to the user it should look like its going to a different page -->