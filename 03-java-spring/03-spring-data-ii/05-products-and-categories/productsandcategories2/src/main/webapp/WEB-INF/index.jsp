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
	<title>Home Page</title>
</head>
<body>
	<h1>Welcome To The Home Page!!!!</h1>
	<hr>
	<h2>Products</h2>
	<table>
		<thead>
			<tr>
				<th>Name</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ prods }" var="prod">
			<tr>
				<td><a href="/show/${ prod.id }">${ prod.name }</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<hr>
	<h2>Categories</h2>
	<table>
		<thead>
			<tr>
				<th>Name</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ cats }" var="cat">
			<tr>
				<td><a href="/showCat/${ cat.id }">${ cat.name }</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<hr>
	<a href="/products/new">Create a Product</a> | <a href="/categories/new">Create a Category</a>
</body>
</html>