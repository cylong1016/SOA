<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="cn.edu.nju.jw.wsdl.课程成绩类型"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">

		<title>学生</title>
		
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
		            	<li><a href="<%=request.getContextPath() + "/jsp/student.jsp" %>">查询 <span class="sr-only">(current)</span></a></li>
		            	<li class="active"><a href="<%=request.getContextPath() + "/jsp/student_modify.jsp" %>">修改信息</a></li>
			    	</ul>
					<ul class="nav navbar-nav navbar-right">
		            	<li><a href="<%=request.getContextPath() + "/jsp/login.jsp" %>">登出</a></li>
		        	</ul>
		        </div>
			</div>
		</nav>
		<div class="container" style="margin-top: 100px">
			<form class="form-horizontal" method="post" action="<%=request.getContextPath() + "/StudentServlet" %>">
				<input type='hidden' name='oper' value='1'>
				<div class="form-group">
					<label class="col-sm-2 control-label">姓名</label>
					<div class="col-sm-3">
						<input type='text' class="form-control" name='name'>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">电话号码</label>
					<div class="col-sm-3">
						<input type='text' class="form-control" name='phone'>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">性别</label>
					<div class="col-sm-3">
						<select class="form-control" name="sex">
							<option value="男">男</option>
							<option value="女">女</option>
						</select>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">部门名称</label>
					<div class="col-sm-3">
						<input type='text' class="form-control" name='dname'>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">部门编号</label>
					<div class="col-sm-3">
						<input type='text' class="form-control" name='did'>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-1">
						<button type="submit" class="btn btn-primary">提交</button>
					</div>
				</div>
			</form>
		</div>
	</body>
</html>