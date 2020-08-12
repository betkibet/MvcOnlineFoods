<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Foodstuff</title>
</head>
<body>
	<h2>Select Food here</h2>
	<hr>
	<form action="proceed" method="POST">
	<table>
		<tr><td><input type="checkbox" id="chicken" name="foodstuff" value="chicken:500"></td><td>Chicken (Ksh 500)</td></tr>
		<tr><td><input type="checkbox" id="soda" name="foodstuff" value="soda:70"></td><td>Soda (Ksh 70)</td></tr>
		<tr><td><input type="checkbox" id="waru" name="foodstuff" value="waru:800"></td><td>Waru (Ksh 800)</td></tr>
		<tr><td><input type="checkbox" id="kienyeji" name="foodstuff" value="kienyeji:4230"></td><td>Kienyeji (Ksh 4230)</td></tr>
		<tr><td></td><td><input type="submit" value="SAVE"></td></tr>
	</table>
		
	</form>
</body>
</html>