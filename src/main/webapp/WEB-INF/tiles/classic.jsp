<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<c:choose>
	<c:when test="${ title == null }">
	<tiles:putAttribute name="title" value="App Title"></tiles:putAttribute>
	</c:when>
	
	<c:otherwise>
	<tiles:putAttribute name="title" value="${ title }"></tiles:putAttribute>
	</c:otherwise>
</c:choose>

<title>
<tiles:getAsString name="title"></tiles:getAsString>
</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
</head>
<body>

	<tiles:insertAttribute name="header"></tiles:insertAttribute>
	<div class="container">

		<tiles:insertAttribute name="body"></tiles:insertAttribute>


	</div>
	<tiles:insertAttribute name="footer"></tiles:insertAttribute>
</body>
</html>