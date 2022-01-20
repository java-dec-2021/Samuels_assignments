<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<!-- Bootstrap -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
	<script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<!-- change to match your file/naming structure -->
    <link rel="stylesheet" href="/css/main.css">
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<title>Insert title here</title>
</head>
<body>
	<h1>${ showQuestion.qText }</h1>
	<h2>Tags:</h2>
	<ul>
	<c:forEach items="${ showQuestion.qTags }" var="tag">
		<li>${ tag.subject }</li>
	</c:forEach>
	</ul>
	<hr>
	<table>
		<thead>
			<tr>
				<th>Answers</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${ showQuestion.answers }" var="answer">
			<tr>
				<td>${ answer.aText }</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<hr>
	<h2>Add a Answer</h2>
	<form:form action="/created/answer" method="post" modelAttribute="answer">
	<form:label path="aText"> Add Answer: </form:label>
	<form:input path="aText"/>
	<form:errors path="aText"/>
	<form:hidden path="quest" value="${ showQuestion.id }"/>
	<button>Submit Answer</button>
	</form:form>
	<a href="/questions">Back</a>
</body>
</html>