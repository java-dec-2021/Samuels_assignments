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
<h1>Edit Language</h1>
<form:form action="/language/edit/${ langs.id }" method="put" modelAttribute="language">
    <input type="hidden" name="method" value="put">
    <p>
        <form:label path="name">Name: </form:label>
        <form:input path="name" value="${ langs.name }"/>
        <form:errors path="name"/>
    </p>
    <p>
        <form:label path="creator">Creator: </form:label>
        <form:input path="creator" value="${ langs.creator }"/>
        <form:errors path="creator"/>
    </p>
    <p>
        <form:label path="currentVersion">Current Version: </form:label>
        <form:input path="currentVersion" value="${ langs.currentVersion }"/>
        <form:errors path="currentVersion"/>
    </p>
    <input type="submit" value="Submit"/>
</form:form>
<form action="/delete/${ langs.id }" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form>
</body>
</html>