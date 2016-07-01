<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>登陆</title>
	
	<link href="<%=request.getContextPath() + "/css/bootstrap.min.css" %>" rel="stylesheet">
	<script src="<%=request.getContextPath() + "/js/jquery.min.js" %>"></script>
	<script src="<%=request.getContextPath() + "/js/bootstrap.min.js" %>"></script>
</head>
<body>
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">管理系统登陆</a>
			</div>
		</div>
	</nav>
	<div class="container" style="width: 100%; padding: 100px 20px;">
		<form class="form-horizontal" 
			method="post"
			action="<%=request.getContextPath() + "/LoginServlet" %>" >
			<div class="form-group">
				<label class="col-sm-2 control-label">邮箱</label>
				<div class="col-sm-3">
					<input type='text' class="form-control" name='mail'>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">密码</label>
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