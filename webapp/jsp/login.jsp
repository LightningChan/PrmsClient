<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.net.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%
	if(request.getAttribute("user")==null){
		String username=null;
		String password=null;
		
		Cookie[] cookies=request.getCookies();
		for(int i=0;cookies!=null && i<cookies.length;i++){
			if(cookies[i].getName().equals("user")){
				username=URLDecoder.decode(cookies[i].getValue().split("-")[0],"UTF-8");
				password=URLDecoder.decode(cookies[i].getValue().split("-")[1],"UTF-8");
		 }
		if(username==null){
			username="";
		}
		
		if(password==null){
			password="";
		}
		
		pageContext.setAttribute("username", username);
		pageContext.setAttribute("password", password);
	}
	}
%>
		<meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">  
	    <title>Login</title>
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
	        </header>
	        
	    <form class="form-signin" action="login.do" method="post" >
	
	<div class="form-group">
   		<div class="input-group">
    		<div class="input-group-addon"><i class="fa fa-user fa-fw"></i></div>	        		
          	<input type="text" class="form-control" placeholder="kyrie@ucas.ac.cn" name="username" id="username"  value="${username} ">           
      	</div>	
   	</div>
   	
    <div class="form-group">
     	<div class="input-group">
      		<div class="input-group-addon"><i class="fa fa-key fa-fw"></i></div>        		
            	<input type="password" class="form-control" placeholder="******" name="password" id="password" value="${password }">           
        </div>	
    </div>	          	
	          	
	<div class="form-group">
		<button type="submit" class="templatemo-blue-button width-100">Login</button>
	</div>	
		    
		</form>
	</div>
	
	<div class="templatemo-content-widget templatemo-login-widget templatemo-register-widget white-bg">
			<p>Not a registered user yet? <strong><a href="tologin.do" class="blue-text">Sign up now!</a></strong></p>
			<p>Or you can read as a <strong><a href="tovisitor.do" class="blue-text">Visitor</a></strong></p>
		</div>
	
</body>
</html>