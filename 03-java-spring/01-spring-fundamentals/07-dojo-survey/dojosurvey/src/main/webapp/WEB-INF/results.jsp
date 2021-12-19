<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- Have To Bring In The JSTL Tag In Order To Use "c out" -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results Page</title>
</head>
<body>
<h1>Name: <c:out value="${ firstName }"/></h1>
<h1>Location: <c:out value="${ location }"/></h1>
<h1>Language: <c:out value="${ language }"/></h1>
<h1>Comment: <c:out value="${ comment }"/></h1>

</body>
</html>