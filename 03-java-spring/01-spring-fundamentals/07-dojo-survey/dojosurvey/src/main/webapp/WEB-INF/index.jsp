<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<form action="/result" method="post">
		<label for="name">First Name: <input type="text" name="firstName"></label>
		<label for="location">Locations: </label>
		<select name="location">
			<option>----Select An Option----</option>
			<option value="San-Jose">San-Jose</option>
			<option value="Dallas">Dallas</option>
			<option value="Tulsa">Tulsa</option>
		</select>
		<label for="language">Languages: </label>
		<select name="language">
			<option>----Select An Option----</option>
			<option value="Java">Java</option>
			<option value="MERN">MERN</option>
			<option value="Python">Python</option>
		</select>
		<label for="comment">Comments: <textarea rows="10" cols="20" placeholder="Comment" name="comment"></textarea></label>
		<button>Submit</button>
	</form>
</body>
</html>