<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Environemnt page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<style type="text/css">
#sel {
	width: 80%;
	margin-left: 10%;
	margin-right: 10%;
}

#sel1 {
	background: skyblue;
}

select, input {
	width: 50%;
}
</style>
<script type="text/javascript">
	function addEnv() {
		alert("Form Submitted");
	}
</script>
</head>
<body>

	<div id="sel">
		<div id="sel1">

			<form action="addEnv" method="post" onSubmit="addEnv()">

				<div class="form-group">
					<label>Select Environment : </label> <select name="envValue"
						class="form-control">
						<option value="DEV">Develop</option>
						<option value="SIT">Sit</option>
						<option value="UAT">Uat</option>
						<option value="PROD">Production</option>
						<option value="OTHERS">Others</option>
					</select>
				</div>
				<div class="form-group">
					<label>URL : </label> <input type="text" class="form-control" />
				</div>

				<div class="alert alert-success">
					<strong>Success!</strong><a href="#" class="alert-link">DataSaved</a>
					<button type="submit" class="btn btn-danger">Save</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>