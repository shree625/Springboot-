<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Landing</title>
<title>Landing page</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body
	style="background-image: url('images/backgoundimage.jpg'); background-repeat: no-repeat; background-size: 500%;">

	<nav class="navbar navbar-light bg-light"> <a
		class="navbar-brand" href="#">X-workz</a> </nav>
	<br>

	<div align="center">
		<form action="onlanding" method="post">

			<label>From: </label> <input type="text" name="fromName"
				placeholder="enter sender name"><br> <label>Enter
				message: </label> <input type="text" name="message"
				placeholder="enter message"><br>

			<div align="left">
				<input type="submit" value="Send" id="send">
			</div>
		</form>
	</div>
</body>
</html>