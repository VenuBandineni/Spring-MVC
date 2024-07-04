<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h2 style="color: green">welcome to spring mvc</h2>
<br>
<form action="./display">
<input placeholder="Enter The Voter Id :" type="number" name="voter_Id"><br>
<input placeholder="Enter The Voter Name:" type="text" name="voter_Name"><br>
<input placeholder="Enter The Voter Age :" type="number" name="voter_Age "><br>
<input placeholder="Enter The Voter Mobile :" type="tel" name="voter_Mobile"><br>
<input placeholder="Enter The Voter Address :" type="text" name="voter_Address"><br>
<input placeholder="Enter The Voter Gender Male :" type="radio" name="voter_Gender">male<br>
<input placeholder="Enter The Voter Gender  Female:" type="radio" name="voter_Gender">female<br>
<input type="submit" value="Register">
</form>
</center>
</body>
</html>