<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Timetable</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body background="<c:url value="/resources/images/back.jfif"/>"/>
	<div class="container">
		<div class="col-md-offset-1 col-md-10">
			<h2>TimeTable</h2>
			<hr />
	  <c:if test="${timetables[0].role.equals('a')}">
	<img src="<c:url value="/resources/images/images.jfif"/>"/><br><br>

			<input type="button" value="Add Timetable"
				onclick="window.location.href='showForm'; return false;"
				class="btn btn-primary" /> <br /> <br /> 
			</c:if>
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Timetable List</div>
				</div>
				<div class="panel-body">
					<table class="table table-striped table-bordered">
						<tr>
						<th>Id</th>
							<th>Course</th>
							<th>Day</th>
							<th>Slot</th>
							<th>Subject</th>
							<th>Room No</th>
						</tr>

						<!-- loop over and print our customers -->
						<c:forEach var="tempTimetable" items="${timetables}">

				 <!-- construct an "update" link with customer id -->
							<c:url var="updateLink" value="/timetable/updateForm">
								<c:param name="timetableId" value="${tempTimetable.id}" />
							</c:url>

							<!-- construct an "delete" link with customer id -->
							<c:url var="deleteLink" value="/timetable/delete">
								<c:param name="timetableId" value="${tempTimetable.id}" />
							</c:url>
 						<tr>
							
							
							<td>${tempTimetable.id}</td>
								<td>${tempTimetable.studentCourseEnroll}</td>
								<td>${tempTimetable.day}</td>
								<td>${tempTimetable.slot}</td>
								<td>${tempTimetable.subject}</td>
								<td>${tempTimetable.roomno}</td>
								<c:if test="${timetables[0].role.equals('a')}">
								 <td>
									<!-- display the update link --> <a href="${updateLink}">Update</a>
									| <a href="${deleteLink}"
									onclick="if (!(confirm('Are you sure you want to delete this record?'))) return false">Delete</a>
								</td> 
								</c:if>

							</tr>

						</c:forEach>

					</table>

				</div>
			</div>
		</div>

	</div>
</body>
</html>