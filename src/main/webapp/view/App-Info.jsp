<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Application Management</title>
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
	margin-left: 20%;
	margin-right: 20%;
	margin-top: 5%;
}

#sel1 {
	padding: 5%;
	background: lightgreen;
	margin-left: 20%;
	margin-right: 20%;
}

#in {
	width: 80%;
}

#env {
	border: 2px solid black;
	width: 30%;
	text-align: 'center' color:white;
	background: black;
}
</style>
</head>
<body
	style="background-image: url('images/backgoundimage.jpg'); background-repeat: no-repeat; background-size: 500%;">

	<nav class="navbar navbar-expand-sm bg-dark navbar-black">
	<ul class="navbar-nav">
		<li class="nav-item active"><a class="nav-link"
			href="www.xworkz.com">X-Workz</a></li>
		<li class="nav-item active"><a class="nav-link"
			href="App-Info.jsp">Login</a></li>
	</ul>
	</nav>
	<h3>Welcome to The New World</h3>

	<div id="sel">
		<div id="sel1">
			<div>
				<!-- Button trigger modal -->
				<button type="button" class="btn btn-primary" data-toggle="modal"
					data-target="#exampleModalCenter">Add Environment Here</button>
				<div class="modal fade" id="exampleModalCenter" tabindex="-1"
					role="dialog" aria-labelledby="exampleModalCenterTitle"
					aria-hidden="true">
					<div class="modal-dialog modal-dialog-centered" role="document">
						<div class="modal-content">
							<div class="modal-header">
								<h5 class="modal-title" id="exampleModalCenterTitle">Modal
									title</h5>
								<button type="button" class="close" data-dismiss="modal"
									aria-label="Close">
									<span aria-hidden="true">&times; AddEnvironment</span>
								</button>
							</div>
							<div class="modal-body">
								<form action="addEnv" method="post">

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
										<label>URL : </label> <input type="text" class="form-control"
											name="url" />
									</div>

									<div>
										<button type="submit" class="btn btn-danger">Add</button>
									</div>
								</form>
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-primary"
									data-dismiss="modal">Close</button>
							</div>
						</div>
					</div>
				</div>
			</div>

			<form action="login" method="post">
				<div class="form-group">
					<label>Project Name : </label> <input type="text"
						name="projectName" class="form-control" id="in">
				</div>

				<div class="form-group">
					<label>Team Manager: </label> <input type="text"
						name="TeamManagerName" class="form-control" id="in">
				</div>

				<div class="form-group">
					<label>Team Contact Email : </label> <input type="text"
						name="lastName" class="form-control" id="in" name="email">
				</div>

				<div class="form-group">
					<label for="id">De-Comissioned : </label> <select
						name="deComissioned" class="form-control" id="in">
						<option value="yes">Yes</option>
						<option value="no">No</option>
					</select>
				</div>



				<div class="form-group">
					<label>Developed Date : </label> <input type="text"
						name="developedDate" class="form-control" id="in">
				</div>

				<div class="form-group">
					<label>Version : </label> <input type="text" name="version"
						class="form-control" id="in">
				</div>

				<div class="form-group">
					<label>Last Release : </label> <input type="text"
						name="lastRelease" class="form-control" id="in">
				</div>

				<div class="form-group">
					<label>Next Release : </label> <input type="text"
						name="nextRelease" class="form-control" id="in">
				</div>

				<div>
					<button type="submit" class="btn btn-success">Submit</button>
					
				</div>

			</form>


		</div>
	</div>
</body>
</html>