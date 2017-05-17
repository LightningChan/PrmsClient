<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" import="com.ucas.prms.server.entity.xsd.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
  <head>
	<base href="<%=basePath%>">  
  
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>发布新闻</title>
    <meta name="description" content="">
    <meta name="author" content="templatemo">

    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,400italic,700' rel='stylesheet' type='text/css'>
    <link href="stylesheets/font-awesome.min.css" rel="stylesheet">
    <link href="stylesheets/bootstrap.min.css" rel="stylesheet">
    <link href="stylesheets/templatemo-style.css" rel="stylesheet">

 
<script type="text/javascript" src="javascripts/templatemo-script.js"></script>
  </head>
  <body>
    <!-- Left column -->
    <div class="templatemo-flex-row">
      <div class="templatemo-sidebar">
        <header class="templatemo-site-header">
          <h1><%=session.getAttribute("username") %>,WELCOME</h1>
        </header>
        <div class="profile-photo-container">
          <img src="images/profile-photo.jpg" alt="Profile Photo" class="img-responsive">
          <div class="profile-photo-overlay"></div>
        </div>
        <!-- Search box -->
        <div class="mobile-menu-icon">
            <i class="fa fa-bars"></i>
        </div>
        <nav class="templatemo-left-nav">
          <ul>
            <li><a href="toadmin.do"><i class="fa fa-home fa-fw"></i>所有新闻</a></li>
            <li><a href="toaddarticle.do"><i class="fa fa-eject fa-fw"></i>发布新闻</a></li>
              <li><a href="logout.do"><i class="fa fa-eject fa-fw"></i>退出</a></li>
          </ul>
        </nav>
      </div>
      <!-- Main content -->
      <div class="templatemo-content col-1 light-gray-bg">
      <script type="text/javascript" src="http://www.keleyi.com/keleyi/pmedia/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
$(function () {
var ie6 = document.all;
var dv = $('#fixedMenu_keleyi_com'), st;
dv.attr('otop', dv.offset().top); //存储原来的距离顶部的距离
$(window).scroll(function () {
st = Math.max(document.body.scrollTop || document.documentElement.scrollTop);
if (st > parseInt(dv.attr('otop'))) {
if (ie6) {//IE6不支持fixed属性，所以只能靠设置position为absolute和top实现此效果
dv.css({ position: 'absolute', top: st });
}
else if (dv.css('position') != 'fixed') dv.css({ 'position': 'fixed', top: 0 });
} else if (dv.css('position') != 'static') dv.css({ 'position': 'static' });
});
});
</script>



        <div class="templatemo-content-container">
           <div class="templatemo-content-widget white-bg">
            <h2 class="margin-bottom-10">发布新闻</h2>
            <p>请在下面输入您的新闻内容</p>
            
            <form class="form-signin" action="addarticle.do" method="post">

              <div class="row form-group"></div>
              <div class="row form-group"></div>
              <div class="row form-group">
                <div class="col-lg-12 has-success form-group">                  
                    <label class="control-label" for="inputWithSuccess">标题</label>
                    <input type="text" class="form-control" id="inputWithSuccess" name="coTitle">
                </div>
              </div>
              <div class="row form-group"></div>
              <div class="row form-group">
                <div class="col-lg-12 form-group">                   
                    <label class="control-label" for="inputNote">内容</label>
                    <textarea class="form-control" id="inputNote" rows="6" name="coDesc"></textarea>
                </div>
              </div>
              <div class="row form-group"></div>
              <div class="form-group text-right">
                <button type="submit" class="templatemo-blue-button">发布</button>
              </div>                           
            </form>
          </div>
        </div>
      </div>
    </div>


    <!-- JS -->
    <script type="text/javascript" src="javascripts/jquery-1.11.2.min.js"></script>        <!-- jQuery -->
    <script type="text/javascript" src="javascripts/bootstrap-filestyle.min.js"></script>  <!-- http://markusslima.github.io/bootstrap-filestyle/ -->
    <script type="text/javascript" src="javascripts/templatemo-script.js"></script>        <!-- Templatemo Script -->
  </body>
</html>
