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
	<title>Insert title here</title>
	<!-- Bootstrap -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
	<script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<!-- change to match your file/naming structure -->
    <link rel="stylesheet" href="/css/main.css">
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<a href="/">Dashboard</a>   
<h1><c:out value="${lang.name}"/></h1>
<p>Name: <c:out value="${lang.name}"/></p>
<p>Creator: <c:out value="${lang.creator}"/></p>
<p>Current Version: <c:out value="${lang.currentVersion}"/></p>
<a href="/edit/${ lang.id }">Edit</a>
<form action="/delete/${ lang.id }" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form>
</body>
</html>