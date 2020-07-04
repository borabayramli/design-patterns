<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>
<div class="container">

<h1> Order Car </h1>
<form action="/order" method="post">
	<div class="row">
		<select name="marka" class="form-control col-sm-3">
			<option value="audi">Audi</option>
			<option value="ford">Ford</option>
		</select>
		<input name="model" class="form-control col-sm-3" placeholder="Model" />
		<input type="color" name="renk" class="form-control col-sm-3" placeholder="Renk" />
		<input type="text" name="beygirGucu" class="form-control col-sm-3" placeholder="Beygir Gücü" />
	</div>
	<input type="submit" value="Send" class="btn btn-danger"> 
</form>


<table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">marka</th>
      <th scope="col">model</th>
      <th scope="col">renk</th>
      <th scope="col">beygirGucu</th>
    </tr>
  </thead>
  <tbody>
  
  <c:if test="${ not empty cls }">
  <c:forEach items="${cls }" var="item">
    <tr>
      <th>${item.marka.marka }</th>
      <td>${item.model.model }</td>
      <td>${item.renk }</td>
      <td>${item.beygirGucu }</td>
    </tr>
    </c:forEach>
  </c:if>
    
  </tbody>
</table>



</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
</body>
</html>