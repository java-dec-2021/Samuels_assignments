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
	<title>Create a Product</title>
</head>
<body>
	<h1>New Product</h1>
	<hr>
	<form:form method="post" action="/created/prod" modelAttribute="prod">
	<p>
	<form:label path="name">Name: </form:label>
	<form:input path="name"/>
	<form:errors path="name"/>
	</p>
	<p>
	<form:label path="description">Description: </form:label>
	<form:input path="description"/>
	<form:errors path="description"/>
	</p>
	<p>
	<form:label path="price">Price: </form:label>
	<form:input type="number" step="0.01" path="price"/>
	<form:errors path="price"/>
	</p>
	<button>Add Product</button>
	</form:form>
	<a href="/">Home Button</a>
</body>
</html>