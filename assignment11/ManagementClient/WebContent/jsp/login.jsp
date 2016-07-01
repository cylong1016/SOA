<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">

		<title>Login</title>
		
		<link href="/assignment7_client/css/bootstrap.min.css" rel="stylesheet">

		<script src="/assignment7_client/js/jquery.min.js"></script>
		<script src="/assignment7_client/js/bootstrap.min.js"></script>
	</head>
	<body style="margin-top:40px;">
		<nav class="navbar navbar-default navbar-fixed-top">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">SOA-Login</a>
				</div>
			</div>
		</nav>
		<div class="container">
			<form class="form-horizontal" method="post" action="/assignment7_client/LoginServlet">
				<div class="form-group">
					<label class="col-sm-2 control-label">Email</label>
					<div class="col-sm-3">
						<input type='text' class="form-control" name='email'>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">Password</label>
					<div class="col-sm-3">
						<input type='password' class="form-control" name='password'>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-1">
						<button type="submit" class="btn btn-primary">登陆</button>
					</div>
				</div>
			</form>
		</div>
	</body>
</html>