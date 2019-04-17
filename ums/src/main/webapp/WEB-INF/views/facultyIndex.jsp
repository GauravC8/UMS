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
<style>
.button {
	display: inline-block;
	padding: 4px 10px;
	font-size: 18px;
	cursor: pointer;
	text-align: center;
	text-decoration: none;
	outline: none;
	color: #fff;
	background-color: #5DADE2;
	border: none;
	border-radius: 15px;
	box-shadow: 0 9px #999;
}

.button:hover {
	background-color: #2980B9
}

.button:active {
	background-color: #2980B9;
	box-shadow: 0 5px #666;
	transform: translateY(4px);
}

.navbar-brand {
	text-color: green;
}

.span {
	font-weight: 100 !important;
}
</style>
</head>
<body>
	<div class="jumbotron jumbotron-fluid">
		<div class="container">
			<!-- Navigation bar -->

			<nav class="navbar navbar-inverse">
				<div class="container-fluid">
					<div class="navbar-header">

						<a class="navbar-brand" href="#"><b>Jubi</b><span>lant</span></a>
					</div>
					<div class="collapse navbar-collapse" id="myNavbar">
						<ul class="nav navbar-nav">
							<li class="active"><a href="#">Home</a></li>
							
							<li><a href="#" data-toggle="modal" data-target="#myModal">Change
									Password</a></li>
						</ul>
						<ul class="nav navbar-nav navbar-right">

							<li><a href="/ums/user/logout"><span
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
								<h3>FACULTY</h3>
								<small><cite title="San Francisco, USA">Jubilant University
										, Delhi<i class="glyphicon glyphicon-map-marker">
									</i>
								</cite></small>
								
							</div>

						</div>
						<br>
						
					</div>
				</div>


				<div class="col-lg-9">
					<div class="row">
						<div class="col-sm-8">
							<p>
								<marquee>
									<b>!!Important Announcements!!</b>
								</marquee>
							<ul>
								<li>18th March is declared as a holiday due to Good Friday!</li>
								<li>Workshop for Department of Science faculty will held on 25th April'2019!</li>
								<li>Faculty has to upload FA-1 Result till 20th April'2019.</li>
							</ul>
							<br> <br>

						</div>
						<br> <br>
						<a href="/ums/timetable/list?role=f">	<button class="button"> View TimeTable</button></a>
						<br> <br>
	                    <a href="/ums/result/list?role=f">	<button class="button"> Add Result</button></a>
						<br> <br>
						<button class="button">
							<a href="/ums/faculty/list?facultyId= ${usr.facultyId}">View Faculty Details</a>
						</button>
					





					</div>


				</div>

				<div class=" container text-center bg-dark">

					<p class="p-4 bg-dark text-white">
						©2019 Copyright: <a href="#">UmsManagementsystem.com</a>
					</p>
				</div>
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






