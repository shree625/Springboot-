<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Message Page</title>
<title>Message</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<link href="css/custom.css" rel="stylesheet">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>

<style>
input[type=text], select {
	width: 30%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type=submit] {
	background-color: pink;
	color: white;
	padding: 14px 20px;
	margin: 6px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type=reset] {
	width: 100%;
	background-color: yellow;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type=number] {
	width: 10%;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type=submit]:hover {
	background-color: #45a049;
}

div {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 50px;
}

#send {
	background-color: orange;
	width: 25%;
}
</style>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="#">X-workz</a>
	</nav>
	<br>

	<div>
		<form action="springboot" method="post">

			<label>From: </label> <input type="text" name="fromName"
				placeholder="enter from whom your sending"><br> <label>Enter
				message: </label> <input type="text" name="message"
				placeholder="enter message">
			<div>
				<input type="submit" value="Send" id="send">
			</div>
		</form>
	</div>


</body>
</html>