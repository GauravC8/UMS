<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<link rel="stylesheet"
	href="//cdnjs.cloudflare.com/ajax/libs/jquery.bootstrapvalidator/0.5.2/css/bootstrapValidator.min.css" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">



<script>
	addEventListener("load", function() {
		setTimeout(hideURLbar, 0);
	}, false);

	function hideURLbar() {
		window.scrollTo(0, 1);
	}
</script>
<script src="<c:url value="/resources/js/jquery-2.1.4.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<script src="<c:url value="/resources/js/validator.min.js" />"></script>

</head>
<body>
	<div class="jumbotron jumbotron-fluid">
		<div class="container">
			<!-- Navigation bar -->

			<nav class="navbar navbar-inverse">
				<div class="container-fluid">
					<div class="navbar-header">

						<a class="navbar-brand" href="#"> <img
							src="<c:url value="/resources/images/logo.png"/>" height="50"
							width="50" /></a>
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
								<small><cite title="San Francisco, USA">NIIT
										Technologies , Delhi<i class="glyphicon glyphicon-map-marker">
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
					<a href="#" data-toggle="modal" data-target="#registerModel">Register
						A Student</a> \
					<!--Register Modal -->
					<div class="modal fade" id="registerModel" role="dialog">
						<div class="modal-dialog">

							<!-- Modal content-->
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal">&times;</button>
									<h4 class="modal-title">Student Registration</h4>
								</div>
								<div class="modal-body">
									<form action="student/saveStudent" method="post"
										modelAttribute="Student" data-toggle="validator">
										<div class="form-group">
											<label for="studentFirstName" class="control-label">First
												First Name:</label> <input type="text" class="form-control"
												id="studentFirstName" placeholder="First Name"
												data-error="Enter First Name" required>
											<div class="help-block with-errors"></div>
										</div>
										<div class="form-group">
											<label for="studentLastName" class="control-label">
												Last Name:</label> <input type="text" class="form-control"
												id="studentLastName" placeholder="Last Name"
												data-error="Enter Last Name" required>
											<div class="help-block with-errors"></div>
										</div>
										<div class="form-group w3ls-opt">
											<label for="studentGender" class="control-label">Gender</label>
											<label class="w3layouts"> <input type="radio"
												name="studentGender" id="studentGender" value="male" checked>Male
											</label> <label class="w3layouts label2"> <input type="radio"
												name="studentGender" id="studentGender" value="female">Female
											</label>
										</div>
										<div class="form-group">
											<label for="inputEmail" class="control-label">Email:</label>
											<input type="email" class="form-control" id="inputEmail"
												placeholder="Email"
												data-error="This email address is invalid" required>
											<div class="help-block with-errors"></div>
										</div>
										<div class="form-group">
											<label for="studentContact" class="control-label">studentContact:</label>
											<input type="text" class="form-control" id="studentContact"
												placeholder="studentContact" data-error="Enter Phone Number"
												required>
											<div class="help-block with-errors"></div>
										</div>
										<div class="form-group">
											<label for="studentFatherName" class="control-label">Father's
												Name:</label> <input type="text" class="form-control"
												id="studentFatherName" placeholder="Father's Name"
												data-error="Enter Father's Name" required>
											<div class="help-block with-errors"></div>
										</div>
										<div class="form-group">
											<label for="studentMotherName" class="control-label">Mother's
												Name:</label> <input type="text" class="form-control"
												id="studentMotherName" placeholder="Mother's Name"
												data-error="Enter Mother's Name" required>
											<div class="help-block with-errors"></div>
										</div>
										<div class="form-group">
											<label for="dob" class="control-label">Date of Birth:</label>
											<input type="date" class="form-control" id="dob"
												placeholder="date" data-error="Enter Date of Birth" required>
											<div class="help-block with-errors"></div>
										</div>
										<div class="form-group">
											<label class="control-label" for="studentCourseEnroll">Select
												Course Enrolled in:</label> <select class="form-control"
												id="studentCourseEnroll">
												<option>B.B.A</option>
												<option>B.C.A</option>
												<option>B.Com</option>
												<option>B.Tech</option>
												<option>M.B.A</option>
												<option>M.C.A</option>
												<option>M.Com</option>
												<option>M.Tech</option>

											</select>
										</div>
										<div class="form-group">
											<label for="address">Address:</label>
											<textarea class="form-control" rows="3" id="address"></textarea>
										</div>
										<div class="form-group">
											<div class="col-md-6 mb-3">
												<label for="city" class="control-label">City:</label> <input
													type="text" class="form-control" id="city"
													placeholder="City" data-error="Enter correct city" required>
												<div class="help-block with-errors"></div>
											</div>
										</div>
										<div class="form-group">
											<div class="col-md-6 mb-3">
												<label for="state" class="control-label">State:</label> <input
													type="text" class="form-control" id="state"
													placeholder="State" data-error="Enter correct state"
													required>
												<div class="help-block with-errors"></div>
											</div>
										</div>
										<div class="form-group">
											<div class="col-md-6 mb-3">
												<label for="pincode" class="control-label">PinCode:</label>
												<input type="text" class="form-control" id="pincode"
													placeholder="PinCode" data-error="Enter correct pincode"
													required>
												<div class="help-block with-errors"></div>
											</div>
										</div>
										<div class="form-group">
											<div class="col-md-6 mb-3">
												<label for="country" class="control-label">Country :</label>
												<input type="text" class="form-control" id="country"
													placeholder="Country" required>
												<div class="help-block with-errors"></div>
											</div>
										</div>

										<div class="form-group">
											<label for="password" class="control-label">Password:</label>
											<div class="form-inline row">
												<div class="form-group col-sm-6 agileits-w3layouts">
													<input type="password" data-minlength="6"
														class="form-control" id="password" placeholder="Password"
														required>
													<div class="help-block">Minimum of 6 characters</div>
												</div>
												<div class="form-group col-sm-6 w3-agile">
													<input type="password" class="form-control"
														id="inputPasswordConfirm" data-match="#password"
														data-match-error="Whoops, these don't match"
														placeholder="Confirm Password" required>
													<div class="help-block with-errors"></div>
												</div>
											</div>
										</div>

										<div class="form-group">
											<button type="submit" class="btn btn-lg">submit</button>
										</div>
									</form>
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default"
										data-dismiss="modal">Close</button>
								</div>
							</div>

						</div>
					</div>
					<a href="student/list">View Student Details</a>
				</div>


			</div>

			<div class=" container text-center bg-dark">

				<p class="p-4 bg-dark text-white">
					©2019 Copyright: <a href="#">UmsManagementsystem.com</a>
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






