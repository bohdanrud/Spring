
<%@ include file="/WEB-INF/taglib.jsp" %>
	
		<table border="1" class="table table-bordered">

			<tr>
				<th>Id</th>
				<th>First name</th>
				<th>Last name</th>
				<th>Age</th>
				<th>Country</th>
				<th>Prog Lang</th>
				<th>Hobby</th>
			</tr>

			<c:forEach items="${ studentsList }" var="student">
				<tr>
					<td>${ student.id }</td>
					<td>${ student.firstName }</td>
					<td>${ student.lastName }</td>
					<td>${ student.age }</td>
					<td>${ student.country }</td>
					<td>${ student.programmingLanguage }</td>
					<td><c:forEach items="${ student.hobby }" var="hobby">${ hobby },</c:forEach>
					</td>
				</tr>
			</c:forEach>

		</table>
	
</body>
</html>