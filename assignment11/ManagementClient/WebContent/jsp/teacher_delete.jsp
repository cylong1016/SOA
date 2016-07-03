<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">

		<title>老师</title>
		
		<link href="<%=request.getContextPath() + "/css/bootstrap.min.css" %>" rel="stylesheet">
		<script src="<%=request.getContextPath() + "/js/jquery.min.js" %>"></script>
		<script src="<%=request.getContextPath() + "/js/bootstrap.min.js" %>"></script>
	</head>
	<body >
		<nav class="navbar navbar-default navbar-fixed-top" style="position:inherit">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">SOA-Teacher</a>
				</div>
				
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
		            	<li><a href="<%=request.getContextPath() + "/jsp/teacher.jsp" %>">查询 <span class="sr-only">(current)</span></a></li>
			            <li><a href="<%=request.getContextPath() + "/jsp/teacher_submit.jsp" %>">添加</a></li>
			             <li><a href="<%=request.getContextPath() + "/jsp/teacher_modify.jsp" %>">修改</a></li>
			            <li class="active"><a href="<%=request.getContextPath() + "/jsp/teacher_delete.jsp" %>">删除</a></li>
			    	</ul>
					<ul class="nav navbar-nav navbar-right">
		            	<li><a href="<%=request.getContextPath() + "/jsp/login.jsp" %>">登出</a></li>
		        	</ul>
		        </div>
			</div>
		</nav>
		<div class="container">
			<form class="form-horizontal" method="post" action="<%=request.getContextPath() + "/ScoreServlet" %>">
				<input type='hidden' name='oper' value='3'>
				<div class="form-group">
					<label class="col-sm-2 control-label">学号</label>
					<div class="col-sm-3">
						<input type='text' class="form-control" name='studentNo'>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">课程编号</label>
					<div class="col-sm-3">
						<input type='text' class="form-control" name='courseNo'>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">成绩性质</label>
					<div class="col-sm-3">
						<select class="form-control" name="property">
							<option value="平时成绩">平时成绩</option>
							<option value="期末成绩">期末成绩</option>
							<option value="总评成绩">总评成绩</option>
						</select>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-1">
						<button type="submit" class="btn btn-primary">删除</button>
					</div>
				</div>
			</form>
		</div>
	</body>
</html>