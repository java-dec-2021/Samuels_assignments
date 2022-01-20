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
	<title>Create Question Page</title>
</head>
<body>
	<h1>New Question</h1>
	<hr>
	<form:form action="/created" method="post" modelAttribute="question">
		<p>
		<form:label path="qText">Question: </form:label>
		<form:input path="qText"/>
		<form:errors path="qText"/>
		</p>
		<p>
		<form:label path="tagFromFrontEnd">Tags (Comma-Space Separated): </form:label>
		<form:input path="tagFromFrontEnd"/>
		<form:errors path="tagFromFrontEnd"/>
		</p>
		<button>Submit Question</button>
	</form:form>
	<a href="/questions">Back</a>
</body>
</html>