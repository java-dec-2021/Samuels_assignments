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
	<title>Create A Dojo</title>
</head>
<body>
	<h1>New Dojo</h1>
	<table>
		<thead>
			<tr>
				<th>Name of Program | </th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ dojos }" var="dojo">
			<tr>
				<td>${ dojo.name }</td>
				<td><a href="/ninja/new/">Add A Ninja</a> | <a href="/dojos/${ dojo.id }">Show Dojo Students</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<form:form action="/dojos/createDojo" method="post" modelAttribute="dojo">
		<p>
			<form:label path="name">Name of Program: </form:label>
			<form:input path="name"/>
			<form:errors path="name"/>
		</p>
		<button>Add Dojo</button>
	</form:form>
</body>
</html>