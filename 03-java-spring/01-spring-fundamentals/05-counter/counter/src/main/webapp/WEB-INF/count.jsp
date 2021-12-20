<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hey you are in session!</h1>
	<!-- Have To Use Session.Scope(.) To Get The Value Of What I Am Wanting From Session -->
	<!-- Or I Can Also Use "Model model" AKA Dependency Injection To display The Count -->
	<h3><c:out value="${ sessionScope.count }"/></h3>
	<a href="/your_server">Test another visit?</a>
	<a href="/reset">Reset Session</a>
</body>
</html>