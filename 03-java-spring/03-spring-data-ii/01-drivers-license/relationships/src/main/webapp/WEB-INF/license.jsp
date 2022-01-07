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
	<meta charset=ISO-8859-1">
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
	<form:form action="/newlicense" method="post" modelAttribute="license">
    <p>
        <form:label path="personModel">People: </form:label>
        <form:errors path="personModel"/>
        <form:select path="personModel">
        <c:forEach items="${ people }" var="person">
        <option value="${ person.id }"> ${ person.firstName } ${ person.lastName }</option>
        </c:forEach>
        </form:select>
    </p>
    <p>
        <form:label path="expiration_date">Expiration Date: </form:label>
        <form:errors path="expiration_date"/>
        <form:input type="date" path="expiration_date"/>
    </p>  
    <p>
        <form:label path="state">State: </form:label>
        <form:errors path="state"/>
        <form:input path="state"/>
    </p>  
    <input type="submit" value="Submit"/>
</form:form>  
<a href="/">Back</a>  
</body>
</html>