<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">  
	    <title>Register</title>
        <meta name="description" content="">
        <meta name="author" content="templatemo">

	    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,400italic,700' rel='stylesheet' type='text/css'>
	    <link href="stylesheets/font-awesome.min.css" rel="stylesheet">
	    <link href="stylesheets/bootstrap.min.css" rel="stylesheet">
	    <link href="stylesheets/templatemo-style.css" rel="stylesheet">

	</head>
	
	<body class="light-gray-bg">
		<div class="templatemo-content-widget templatemo-login-widget white-bg">
			<header class="text-center">
	          <div class="square"></div>
	          <h1>新闻发布管理系统</h1>
			  <br></br>
			  <h2>Register</h2>
	        </header>
		
			<form class="form-signin" action="register.do" method="post">
			
			<div class="form-group"></div>
	        	<div class="form-group">
				    <div class="input-group">
					  <div class="input-group-addon"><i class="fa fa-user fa-fw"></i></div>
					  <input name="stuName" type="text" class="form-control" placeholder="Kyrie" >
					  <span id="stuName1"></span>
					 </div>
					<br/>	<br/>
			
			        <div class="input-group">
                      <div class="input-group-addon"><i class="fa fa-user fa-fw"></i></div>
	        		  <input name="stuNickname" type="text" class="form-control" placeholder="kyrie@ucas.ac.cn">
	        		  <span id="stuNickname1"></span>
                    </div>
					<br/>  <br/>
		
				<div class="input-group">
		        		<div class="input-group-addon"><i class="fa fa-key fa-fw"></i></div>	        		
		              	<input name="stuPass" type="password" class="form-control" placeholder="******">           
		          	</div>	
        	  </div>	          	
	          	<div class="form-group">
					<button type="submit" class="templatemo-blue-button width-100" value="提交">Sign Up</button>
				</div>
	        </form>
		</div>				

	</body>
</html>
