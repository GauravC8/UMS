<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="/ums/assign/uploadAssignment" method="post" >
${studentId}

<input type="hidden" name="studentId"  value=${studentId}>

<div class="custom-file">


  <input type="file" class="custom-file-input" name="assignmentsfile" id="customFile">
  <label class="custom-file-label" for="customFile">Choose file</label>
</div>

<input type="submit" value="Submit Assignments"/>

</form>

</body>
</html>