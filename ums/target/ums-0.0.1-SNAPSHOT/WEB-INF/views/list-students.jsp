<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 5 MVC</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
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
</body>
</html>