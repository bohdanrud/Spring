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

<form:form method="POST" action="${pageContext.request.contextPath}/questionnaire/new" 
modelAttribute="questionnaireModel">

Full Name: <form:input path="fullName"/> <br>
Age: <form:select path="age">
<c:forEach begin="15" end="60" var="Age">
	<form:option value="${ Age }">${ Age }</form:option>
</c:forEach>
</form:select>
<br>
Country: <form:select path="country" items="${ countries }"></form:select> <br>
Sex: <form:radiobuttons path="sex" items="${sexes}"/> <br>
e-mail: <input type="email" name="email"> <br>
Education: <form:radiobuttons path="education" items="${educations}"/> <br>
Social Networks: <form:checkboxes items="${ socialNetworksList }" path="socialNetworks"/> <br>
Favourite programming language: <form:radiobuttons path="programmingLanguage" items="${ programmingLanguages }"/> <br>
Operation systems: <form:checkboxes items="${ operationSystemsList }" path="operationSystems"/> <br>
Experience: <form:select path="experience" items="${ experiencesTimes }"></form:select> <br>
Rang: <form:select path="rang" items="${ rangs }"></form:select> <br>
Technologies: <form:checkboxes items="${ technologiesList }" path="technologies"/> <br>
Where did you find out about our survey?: <form:radiobuttons path="knowFrom" items="${ ways }"/> <br>
City: <form:input path="city"/> <br>
Post code: <form:input path="postCode"/> <br>
Foreign languages: <form:checkboxes items="${ foreignLanguagesList }" path="foreignLanguages"/> <br>
English level: <form:radiobuttons path="englishLevel" items="${englishLevelList}"/> <br>
Phone: <form:input path="phone"/> <br>
Hobby: <form:input path="hobby"/> <br>
Note: <form:input path="note"/> <br>
<input type="submit" value="Finish">
</form:form>

</body>
</html>