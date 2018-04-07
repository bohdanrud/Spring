<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Add New Person</h1>
	<form action="${pageContext.request.contextPath}/addNewPerson" method="POST">
		
		<input type="text" name="firstName"> <br>
		<input type="text" name="lastName"> <br>
		
		<input type="submit" value="AddPerson">
	</form>
</body>
</html>