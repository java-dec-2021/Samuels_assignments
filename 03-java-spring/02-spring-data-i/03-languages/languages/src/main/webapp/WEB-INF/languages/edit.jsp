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
	<title>Edit Page</title>
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
<a href="/languages">Dashboard</a>
<h1>Edit Language</h1>
<!-- Having Spring Handle This As A Put Request -->
<!-- HTML Handles Only Three Types Of Request (i.e. It's Old) -->
<form:form action="/languages/${ allLangs.id }/edit" method="post" modelAttribute="language">
    <input type="hidden" name="_method" value="put">
    <p>
        <form:label path="name">Name: </form:label>
        <form:input path="name" value="${ allLangs.name }"/>
        <form:errors path="name"/>
    </p>
    <p>
        <form:label path="creator">Creator: </form:label>
        <form:input path="creator" value="${ allLangs.creator }"/>
        <form:errors path="creator"/>
    </p>
    <p>
        <form:label path="currentVersion">Current Version: </form:label>
        <form:input path="currentVersion" value="${ allLangs.currentVersion }"/>
        <form:errors path="currentVersion"/>
    </p>
    <input type="submit" value="Submit"/>
</form:form>
<form action="/delete/${ allLangs.id }" method="post">
    <input type="hidden" name="_method" value="delete">
    <button>Delete</button>
</form>
</body>
</html>