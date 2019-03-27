<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>	
<head>	
<meta name="viewport" content="width=device-width; initial-scale=1; min-scale=1; max-scale=1" >
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MyBasket</title>	

<link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.2.0/css/bootstrap.css" />

<script type="text/javascript" src="webjars/jquery/3.3.1/jquery.js"></script>
<style>
	.err{	
		color:red;
		font-size: .8em;
	}
</style>

</head>
<body>
	<div class="container">
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		<div>
			<h1>MyBasket</h1>
			<form action="">
				<input type="search" name="keyword" class="form-control" placeholder="search...">
			</form>
		</div>
		
		<div class="row">
			<div class="col-md-3 ">
					
					<a class="btn btn-primary btn-block" href="/view-all-products">Product List</a><br/>
					<a class="btn btn-success btn-block" href="/registration-form">Sign up</a>
					<a class="btn btn-success btn-block" href="/home">Home</a>
					
					<p class="lead text-center">Brands</p>
					<ul class="list-group">
						<c:forEach items="${requestScope.brands}" var="b">
							<a href="/home?filter-by=brand&id=${b.id}" class="list-group-item">${b.name}</a>
						</c:forEach>
					</ul>
					
					<p class="lead text-center">Categories</p>
					<ul class="list-group">
						<c:forEach items="${requestScope.categories}" var="c">
							<a href="/home?filter-by=category&id=${c.id}" class="list-group-item">${c.name}</a>
						</c:forEach>
					</ul>
					
				</div>
			<div class="col-md-9 ">