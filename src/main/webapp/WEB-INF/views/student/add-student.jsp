<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${ pageTitle }</title>
</head>
<body>

<form:form method="POST" action="${pageContext.request.contextPath}/student/add" 
modelAttribute="studentModel">

First Name: <form:input path="firstName"/> <br>
Last Name: <form:input path="lastName"/> <br>
Country: <form:select path="country" items="${ countries }"></form:select>
Age: <form:select path="age">
<c:forEach begin="12" end="75" var="studentAge">
	<form:option value="${ studentAge }">${ studentAge }</form:option>
</c:forEach>
Programming language: <form:radiobuttons path="programmingLanguage" items="${progLanguages}"/> <br>

Hobbies <form:checkboxes items="${ hobbies }" path="hobby"/> <br>
</form:select>
<input type="submit" value="Create Student">

</form:form>

</body>
</html>