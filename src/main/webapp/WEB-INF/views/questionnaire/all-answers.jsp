
<%@ include file="/WEB-INF/taglib.jsp" %>
<div class="container">
<c:forEach items="${ answersList }" var="answer">
<table border="1" class="table table-bordered">
			<tr >
				<td align="center" bgcolor="grey"><h4>Full name</h4></td>
			</tr>
				<tr>
					<td align="center" bgcolor="grey"><h3>${ answer.fullName }</h3></td>
				</tr>
		</table>
		<table border="1" class="table table-bordered">
			<tr>
				<td valign="bottom" align="center">Age</td>
				<td valign="bottom" align="center">Country</td>
				<td valign="bottom" align="center">Sex</td>
				<td valign="bottom" align="center">Email</td>
				<td valign="bottom" align="center">Education</td>
				<td valign="bottom" align="center">Social networks</td>
				<td valign="bottom" align="center">Programming language</td>
				<td valign="bottom" align="center">Operation systems</td>
				<td valign="bottom" align="center">Experience</td>
			</tr>

			
				<tr>
					<td valign="bottom" align="center">${ answer.age }</td>
					<td valign="bottom" align="center">${ answer.country }</td>
					<td valign="bottom" align="center">${ answer.sex }</td>
					<td valign="bottom" align="center">${ answer.email }</td>
					<td valign="bottom" align="center">${ answer.education }</td>
					<td valign="bottom" align="center"><c:forEach items="${ answer.socialNetworks }" var="sn">${ sn },</c:forEach></td>
					<td valign="bottom" align="center">${ answer.programmingLanguage }</td>
					<td valign="bottom" align="center"><c:forEach items="${ answer.operationSystems }" var="os">${ os },</c:forEach></td>
					<td valign="bottom" align="center">${ answer.experience }</td>
				</tr>
	
		</table>
				<table border="1" class="table table-bordered">
			<tr>
				<td valign="bottom" align="center">Rang</td>
				<td valign="bottom" align="center">Technologies</td>
				<td valign="bottom" align="center">Know From</td>
				<td valign="bottom" align="center">City</td>
				<td valign="bottom" align="center">Post Code</td>
				<td valign="bottom" align="center">Foreign Languages</td>
				<td valign="bottom" align="center">English Level</td>
				<td valign="bottom" align="center">Phone</td>
				<td valign="bottom" align="center">Hobby</td>
				<td valign="bottom" align="center">Note</td>
			</tr>

			
				<tr>
					<td valign="bottom" align="center">${ answer.rang }</td>
					<td valign="bottom" align="center"><c:forEach items="${ answer.technologies }" var="t">${ t },</c:forEach></td>
					<td valign="bottom" align="center">${ answer.knowFrom }</td>
					<td valign="bottom" align="center">${ answer.city }</td>
					<td valign="bottom" align="center">${ answer.postCode }</td>
					<td valign="bottom" align="center"><c:forEach items="${ answer.foreignLanguages }" var="fl">${ fl },</c:forEach></td>
					<td valign="bottom" align="center">${ answer.englishLevel }</td>
					<td valign="bottom" align="center">${ answer.phone }</td>
					<td valign="bottom" align="center">${ answer.hobby }</td>
					<td valign="bottom" align="center">${ answer.note }</td>
				</tr>
			
		</table>
		</c:forEach>
	</div>	
</body>
</html>