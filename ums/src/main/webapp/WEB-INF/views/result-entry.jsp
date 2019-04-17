<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body background="<c:url value="/resources/images/4.jpg"/>"/>

<br>
	<div class="container">
		<div class="col-md-offset-2 col-md-7">
			<h2 class="text-center">Result</h2>
			<div class="panel panel-info">
				<div class="panel-heading">
				
				
					<div class="panel-title">Add Result</div>
				</div>
				<div class="panel-body">
					<form:form action="saveResult" cssClass="form-horizontal"
						method="post" modelAttribute="result">

						<!-- need to associate this data with customer id -->
						<form:hidden path="id" />

						<div class="form-group">
							<label for="studentCourseEnroll" class="col-md-3 control-label">
							Course</label><select class="form-control"
													id="studentCourseEnroll" name="studentCourseEnroll">
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
							<label for="studentname" class="col-md-3 control-label">Student Name</label>
							<div class="col-md-9">
								<form:input path="studentName" cssClass="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label for="cgpa" class="col-md-3 control-label">cgpa</label>
							<div class="col-md-9">
								<form:input path="cgpa" cssClass="form-control" />
							</div>
						</div>

						<div class="form-group">
							<!-- Button -->
							<div class="col-md-offset-3 col-md-9">
								<form:button cssClass="btn btn-primary">Submit</form:button>
							</div>
						</div>

					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>