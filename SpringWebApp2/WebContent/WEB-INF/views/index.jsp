<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page="head.jsp"/>
<body>
<form action="${Action}" method="post">
	<div class="container">
		<div class="row bg-success p-2 text-light">
			<div class="col-md-12">
				<h2>${Title}</h2>
			</div>
		</div>
		<div class="row">
			<div class="col-md-6 bg-info p-3 text-light">
				<div class="row p-2">
					<div class="col-md-3">Name</div>
					<div class="col-md-5"><input type="text" name="name" class="form-control" value="${NameValue}"/></div>
					<div class="col-md-4 text-danger">${NameError}</div>
				</div>
				<div class="row p-2">
					<div class="col-md-3">Age</div>
					<div class="col-md-5"><input type="text" name="age" class="form-control" value="${AgeValue}"/></div>
					<div class="col-md-4 text-danger">${AgeError}</div>
				</div>
				<div class="row p-2">
					<div class="col-md-3">Phone</div>
					<div class="col-md-5"><input type="text" name="phone" class="form-control" value="${PhoneValue}"/></div>
					<div class="col-md-4 text-danger">${PhoneError}</div>
				</div>
				<div class="row p-2">
					<div class="col-md-3"><input type="submit" value="${ButtonValue}" class="btn btn-warning" /></div>
					<div class="col-md-9"><h4>${SuccessMessage}</h4></div>
				</div>
			</div>
			
			<div class="col-md-6 bg-warning">
				<table class="table">
					<tr>
						<th>ACTION</th>
						<th>ID</th>
						<th>NAME</th>
						<th>AGE</th>
						<th>PHONE</th>
					</tr>
					<c:forEach var="person" items="${PersonList}">
					<tr>
						<td>ACTION</td>
						<td>${person.id}</td>
						<td>${person.name}</td>
						<td>${person.age}</td>
						<td>${person.phone}</td>
					</tr>
					</c:forEach>
				</table>
			</div>
			
		</div>
	</div>

</form>

</body>
</html>