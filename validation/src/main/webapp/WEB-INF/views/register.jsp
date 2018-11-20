<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
       pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
       <h1>Registration Page</h1>
       <c:url var="myAction" value="checkRegister.obj" />

       <form:form method="post" modelAttribute="register" action="${myAction}">


       First Name: 
       <form:input path="firstName" />
              <form:errors path="firstName" cssStyle="color:red"></form:errors>
              <br />
              <br />
       Last Name: <form:input path="lastName" />
              <form:errors path="lastName" cssStyle="color:red"></form:errors>
              <br />
              <br />
Gender:  <form:radiobutton path="gender" value="M" label="M" />
              <form:radiobutton path="gender" value="F" label="F" />
              <br />
              <br />
              
Email:  <form:input path="email" />
              <form:errors path="email" cssStyle="color:red"></form:errors>
              <br />
              <br />

Skill Set: 
<form:checkboxes items="${skillList}" path="skillList" />
              <br />
              <br />

City: 
<form:select path="city">
                     <form:option value="" label="Please Select"></form:option>
                     <form:options items="${cityList}" />

              </form:select>
              <br />
              <br />
              <input type="submit" value="Register" />
       </form:form>
       <br />
       <br />

</body>
</html>
