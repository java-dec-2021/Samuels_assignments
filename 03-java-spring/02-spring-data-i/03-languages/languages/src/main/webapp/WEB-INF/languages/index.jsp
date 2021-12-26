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
	<title>Dashboard</title>
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
	<h1>All Languages</h1>
<table>
    <thead>
        <tr>
            <th>Name</th>
            <th>Creator</th>
            <th>Current Version</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${allLanguages}" var="language">
        <tr>
            <td><a href="/languages/${ language.id }"><c:out value="${ language.name }"/></a></td>
            <td><c:out value="${ language.creator }"/></td>
            <td><c:out value="${ language.currentVersion }"/></td>
            <td><a href="/languages/${ language.id }/edit">Edit</a></td>
            <td>
            <form action="/delete/${ language.id }" method="post">
    		<input type="hidden" name="_method" value="delete">
    		<button>Delete</button>
    		</form>
    		</td>
        </tr>
        </c:forEach>
    </tbody>
</table>
<form:form action="/languages" method="post" modelAttribute="language">
    <p>
        <form:label path="name">Name: </form:label>
        <form:input path="name"/>
        <form:errors path="name"/>
    </p>
    <p>
        <form:label path="creator">Creator: </form:label>
        <form:input path="creator"/>
        <form:errors path="creator"/>
    </p>
    <p>
        <form:label path="currentVersion">Current Version: </form:label>
        <form:input path="currentVersion"/>
        <form:errors path="currentVersion"/>
    </p>   
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>