
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

<link href="css/Landing.css" rel="stylesheet">

</head>
<body
	style="background-image: url('images/backgoundimage.jpg'); background-repeat: no-repeat; background-size: 500%;">


	<nav class="navbar navbar-dark bg-dark"> <span
		class="navbar-brand mb-0 h1"><h2>
			<b>X-workz</b>
		</h2> </span>
	<span class="navbar-text"> <a href="getAppInfo">App-Info</a>
	</span> </nav>
	<div class="body-class">
		<div class="mt-3 mb-4 row justify-content-center">
			${errorMessage}</div>
		<div class="row col-md-12">
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<form class="col-md-12" action="onWelcome" method="POST">
					<div class="form-group">
						<label for="usr"><b>From:</b></label> <input type="text"
							class="form-control" id="usr" name="from">
					</div>
					<div class="form-group">
						<label for="comment"><b>Enter a Message:</b></label>
						<textarea class="form-control" rows="5" id="comment"
							name="message"></textarea>
					</div>

					<div class="form-group">
						<button class="btn btn-primary btn-md" type="submit">send</button>
					</div>
				</form>

			</div>
			<div class="col-md-3"></div>
		</div>
	</div>
	<div>
		<footer id="sticky-footer" class="py-4 bg-dark text-white-50">
		<div class="container text-center">
			<small>@ 2020 Copyright &copy; xworkz.com</small>
		</div>
		</footer>
	</div>

</body>
</html>

