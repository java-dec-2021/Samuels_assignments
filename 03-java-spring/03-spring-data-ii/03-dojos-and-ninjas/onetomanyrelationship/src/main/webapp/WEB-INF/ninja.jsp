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
	<title>Create A Ninja</title>
</head>
<body>
	<h1>Add Ninja</h1>
	<form:form action="/ninja/createNinja" method="post" modelAttribute="ninja">
		<p>
			<form:label path="dojo">Dojos: </form:label>
			<form:select path="dojo">
				<c:forEach items="${ allDojos }" var="dojo">
					<option value="${ dojo.id }">${ dojo.name }</option>
				</c:forEach>
			</form:select>
			<form:errors path="dojo"/>
		</p>
		<p>
			<form:label path="firstName">First Name: </form:label>
			<form:input path="firstName"/>
			<form:errors path="firstName"/>
		</p>
		<p>
			<form:label path="lastName">Last Name: </form:label>
			<form:input path="lastName"/>
			<form:errors path="lastName"/>
		</p>
		<p>
			<form:label path="age">Age: </form:label>
			<form:input type="number" path="age"/>
			<form:errors path="age"/>
		</p>
		<button>Add Ninja</button>
	</form:form>
	<a href="/">Back</a>
</body>
</html>