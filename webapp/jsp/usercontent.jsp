<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" import="com.ucas.prms.server.entity.xsd.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>所有内容</title>
<meta name="description" content="">
<meta name="author" content="templatemo">
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,400italic,700'
	rel='stylesheet' type='text/css'>
<link href="stylesheets/font-awesome.min.css" rel="stylesheet">
<link href="stylesheets/bootstrap.min.css" rel="stylesheet">
<link href="stylesheets/templatemo-style.css" rel="stylesheet">
</head>

<body>


	<div class="templatemo-flex-row">
		<div class="templatemo-sidebar">
			<header class="templatemo-site-header">
			<h1><%=session.getAttribute("username")%>,WELCOME
			</h1>
			</header>
			<div class="profile-photo-container">
				<img src="images/profile-photo.jpg" alt="Profile Photo"
					class="img-responsive">
				<div class="profile-photo-overlay"></div>
			</div>
			<!-- Search box -->
			<div class="mobile-menu-icon">
				<i class="fa fa-bars"></i>
			</div>
			<nav class="templatemo-left-nav">
			<ul>
				<li><a href="touser.do"><i class="fa fa-home fa-fw"></i>所有新闻</a></li>
				<li><a href="usercontent.jsp"><i
						class="fa fa-bar-chart fa-fw"></i>我的评论</a></li>
				<li><a href="logout.do"><i class="fa fa-eject fa-fw"></i>退出</a></li>
			</ul>
			</nav>
		</div>

		<!-- Main content -->
		<div class="templatemo-content col-1 light-gray-bg">
			<div class="templatemo-content-container">
				<div class="templatemo-content-widget no-padding">
					<div class="panel panel-default table-responsive">
						<table
							class="table table-striped table-bordered templatemo-user-table">
							<thead>
								<tr>
									<!-- <td><a class="white-text templatemo-sort-by"># <span class="caret"></span></a></td> -->
									<td width="50px"><a class="white-text templatemo-sort-by">标题 <span
											class="caret"></span></a></td>
									<td width="20px"><a class="white-text templatemo-sort-by">发布者 <span
											class="caret"></span></a></td>
									<td width="200px"><a class="white-text templatemo-sort-by">描述 <span
											class="caret"></span></a></td>
									<td	width="50px"><a class="white-text templatemo-sort-by">时间 <span
											class="caret"></span></a></td>
									<td width="20px"><a class="white-text templatemo-sort-by">操作 <span
											class="caret"></span></a></td>
								</tr>
							</thead>
							<tbody>

								<c:forEach items="${list}" var="article">
									<tr>
										<td><c:out value="${article.title}" /> </a></td>
										<td><c:out value="${article.author.getName()}" /></td>
										<td><c:out value="${article.content.split('。')[0]}" /></td>
										<td><c:out value="${article.postTime}" /></td>
										<td> <a
											href="getreply.do?id=${article.id}" class="templatemo-edit-btn">详情</a>
										</td>


									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
				</form>

				<!-- Second row ends -->
				<div class="pagination-wrap">
					<ul class="pagination">
						<li></li>
						<li></li>
						<li class="active"></li>
						<li></li>
						<li></li>
						<li></li>
					</ul>
				</div>
			</div>
		</div>
	</div>

	<!-- JS -->
	<script type="text/javascript" src="javascripts/jquery-1.11.2.min.js"></script>
	<!-- jQuery -->
	<script type="text/javascript" src="javascripts/templatemo-script.js"></script>
	<!-- Templatemo Script -->
	<script>
		$(document).ready(
				function() {
					// Content widget with background image
					var imageUrl = $('img.content-bg-img').attr('src');
					$('.templatemo-content-img-bg').css('background-image',
							'url(' + imageUrl + ')');
					$('img.content-bg-img').hide();
				});
	</script>
</body>
</html>
