<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- Have To Bring In The JSTL Tag In Order To Use "c out" -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Page</title>
</head>
<body>
	<h1>Congratulations On Choosing Java As Your Language!</h1>
	<h2>Name: <c:out value="${ firstName }"/></h2>
	<h2>Location: <c:out value="${ location }"/></h2>
	<h2>Language: <c:out value="${ language }"/></h2>
	<h2>Comment: <c:out value="${ comment }"/></h2>
</body>
</html>