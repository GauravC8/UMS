<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
------------------------------------------------------------------------------<body background="<c:url value="/resources/images/back.jfif"/>"/>
	<div class="container">
		<div class="col-md-offset-1 col-md-10">
			<h2>RESULT SHEET</h2>
			<hr />

	
         <c:if test="${results[0].role.equals('f')}"> -
			<input type="button" value="Add Result"
				onclick="window.location.href='showForm'; return false;"
				class="btn btn-primary" /> <br /> <br />
				 </c:if> 
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Result List</div>
				</div>
				<div class="panel-body">
					<table class="table table-striped table-bordered">
						<tr>
							<th>Id</th>
							<th>Course</th>
							<th>Name</th>
							<th>cgpa</th>
							
						</tr>

						<!-- loop over and print our customers -->
						<c:forEach var="tempResult" items="${results}">

							<!-- construct an "update" link with customer id -->
							<c:url var="updateLink" value="/result/updateForm">
								<c:param name="resultId" value="${tempResult.id}" />
							</c:url>

							<!-- construct an "delete" link with customer id -->
							<c:url var="deleteLink" value="/result/delete">
								<c:param name="resultId" value="${tempResult.id}" />
							</c:url>

							<tr>
								<td>${tempResult.id}</td>
								<td>${tempResult.studentCourseEnroll}</td>
								<td>${tempResult.studentName}</td>
								<td>${tempResult.cgpa}</td>
								<c:if test="${results[0].role.equals('f')}">
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