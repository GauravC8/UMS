<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>University Management System</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
</head>
<body>
	<div class="jumbotron jumbotron-fluid">
		<div class="container">
			<!-- Navigation bar -->

			<nav class="navbar navbar-inverse">
				<div class="container-fluid">
					<div class="navbar-header">
						
						<a class="navbar-brand" href="#" ><img
							src="<c:url value="/resources/images/logo.png"/>"/>
							alt="..." class="img-thumbnail" height="50" width="50"></a>
					</div>
					<div class="collapse navbar-collapse" id="myNavbar">
						<ul class="nav navbar-nav">
							<li class="active"><a href="#">Home</a></li>
							<li class="dropdown"><a class="dropdown-toggle"
								data-toggle="dropdown" href="#">UMS Navigation <span
									class="caret"></span></a>
								<ul class="dropdown-menu">
									<li><a href="#">My Profile</a></li>
									<li><a href="#">Examination</a></li>
									<li><a href="#">View Result</a></li>
									<li><a href="#">View Attendance</a></li>
									<li><a href="#">View Timetable</a></li>
									<li><a href="#">Assignment Upload</a></li>
									<li><a href="#">Assignment Download</a></li>
									<li><a href="#">Online Survey</a></li>
								</ul></li>
							<li><a href="#" data-toggle="modal" data-target="#myModal">Change
									Password</a></li>
						</ul>
						<ul class="nav navbar-nav navbar-right">

							<li><a href="#"><span
									class="glyphicon glyphicon-log-out"></span>Logout</a></li>
						</ul>
					</div>

					<!-- Modal -->
					<div class="modal fade" id="myModal" role="dialog">
						<div class="modal-dialog">

							<!-- Modal content-->
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal">&times;</button>
									<h4 class="modal-title">Change Password</h4>
								</div>
								<div class="modal-body">
									<form action="#">
										<div class="form-group">
											<label for="email">Old Password</label> <input type="email"
												class="form-control" id="email">
										</div>
										<div class="form-group">
											<label for="pwd">New Password:</label> <input type="password"
												class="form-control" id="pwd">
										</div>
										<div class="form-group">
											<label for="pwd">Confirm Password:</label> <input
												type="password" class="form-control" id="pwd">
										</div>
										<button type="submit" class="btn btn-default">Submit</button>
									</form>
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default"
										data-dismiss="modal">Close</button>
								</div>
							</div>

						</div>
					</div>
				</div>
			</nav>

			<br>

			<div class="row mt-5">
				<div class="col-lg-3 ">

					<div class="container">
						<div class="row  bg-primary">
							<div class="col-sm-6 col-md-4 ">
								<img
									src="file:///D:/Project/UMS/WebContent/images/prfile_user.png"
									alt="" class="img-rounded img-responsive" />


							</div>
							<div class="col-sm-6 col-md-8">
								<h4>Anita Kri</h4>
								<small><cite title="San Francisco, USA">NIIT Technologies
								, Delhi<i class="glyphicon glyphicon-map-marker">
									</i>
								</cite></small>
								<p>
								 <i class="glyphicon glyphicon-gift"></i>Jan 1, 1999
								</p>
							</div>

						</div>
						<br>
						<div class="form-group">
							<label for="rollno">Roll No.:</label>
							<p>Insert roll no</p>
						</div>
						<div class="form-group">
							<label for="pgm">Program:</label>
							<p>Insert program</p>
						</div>

						<div class="form-group">
							<label for="scn">Section:</label>
							<p>Insert roll no</p>
						</div>
					</div>
				</div>


				<div class="col-lg-9">
					<table class="table table-aqua">

						<tr>

							<th scope="col">Time</th>
							<th scope="col">Course</th>
							<th scope="col">Room No.</th>
						</tr>



						<tbody class="table table-aqua">
							<tr>

								<td>Mark</td>
								<td>Otto</td>
								<td>@mdo</td>
							</tr>
							<tr>

								<td>Jacob</td>
								<td>Thornton</td>
								<td>@fat</td>
							</tr>
							<tr>

								<td>Larry</td>
								<td>the Bird</td>
								<td>@twitter</td>
							</tr>
						</tbody>
					</table>
				</div>


			</div>
			
				<div class="container">
		<div class="col-md-offset-1 col-md-10">
			<h2>Student Registration</h2>
			<hr />

			<input type="button" value="Add Student"
				onclick="window.location.href='showForm'; return false;"
				class="btn btn-primary" /> <br /> <br />
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Student List</div>
				</div>
				<div class="panel-body">
					<table class="table table-striped table-bordered">
						<tr>
							<th>First Name</th>
							<th>Last Name</th>
							<th>Gender</th>
							<th>Email Id</th>
							<th>Phone number</th>
							<th>Father Name</th>
							<th>Mother Name</th>
							<th>Date of Birth</th>
							<th>Course Enrolled</th>
							<th>Address</th>
							<th>City</th>
							<th>State</th>
							<th>Pincode</th>
							<th>Country</th>
							<th>Password</th>
							<th>Action</th>
						</tr>

						<!-- loop over and print our customers -->
						<c:forEach var="xStudent" items="${students}">

							<!-- construct an "update" link with customer id -->
							<c:url var="updateLink" value="/student/updateForm">
								<c:param name="emailId" value="${xStudent.emailId}" />
							</c:url>

							<!-- construct an "delete" link with customer id -->
							<c:url var="deleteLink" value="/student/delete">
								<c:param name="emailId" value="${xStudent.emailId}" />
							</c:url>

							<tr>
								<td>${xStudent.studentFirstName}</td>
								<td>${xStudent.studentLastName}</td>
								<td>${xStudent.studentGender}</td>
								<td>${xStudent.emailId}</td>
								<td>${xStudent.studentContact}</td>
								<td>${xStudent.studentFatherName}</td>
								<td>${xStudent.studentMotherName}</td>
								<td>${xStudent.dob}</td>
								<td>${xStudent.studentCourseEnroll}</td>
								<td>${xStudent.address}</td>
								<td>${xStudent.city}</td>
								<td>${xStudent.state}</td>
								<td>${xStudent.pincode}</td>
								<td>${xStudent.country}</td>
								<td>${xStudent.password}</td>

								<td>
									<!-- display the update link --> <a href="${updateLink}">Update</a>
									| <a href="${deleteLink}"
									onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
								</td>

							</tr>

						</c:forEach>

					</table>

				</div>
			</div>
		</div>

	</div>
	
	

			<div class=" container text-center bg-dark">

				<p class="p-4 bg-dark text-white">
					�2019 Copyright: <a href="#">UmsManagementsystem.com</a>
				</p>
			</div>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>