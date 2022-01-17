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
	<title>Show a Product to add Categories too</title>
</head>
<body>
	<h1>${ products.name }</h1>
	<p>${ products.description }</p>
	<p>${ products.price }</p>
	<hr>
	<h3>Products' Categories List</h3>
	<ul>
	<c:forEach items="${ products.categoriesObjs }" var="cat">
		<li>${ cat.name }</li>
	</c:forEach>
	</ul>
	<form action="/addCat/${ products.id }" method="post">
		<select name="categories">
		<c:forEach items="${ notInProduct }" var="category">
			<option value="${ category.id }">${ category.name }</option>
		</c:forEach>
		</select>
		<button>Add Category</button>
	</form>
	<a href="/">Home</a>
</body>
</html>