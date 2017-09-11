<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<%@page isELIgnored="false"%>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
<head>  
<base href="<%=basePath%>">  
<title>My JSP 'userDetail.jsp' starting page</title>  
<meta http-equiv="pragma" content="no-cache">  
<meta http-equiv="cache-control" content="no-cache">  

<link href="resources/css/bootstrap.min.css" rel="stylesheet">
</head>  
<body>  
<div class="container">
	<div class="jumbotron">
	        <h1>用户ID: ${userid} </h1>
	        <h1>用户名称: ${username} </h1>
	        <h1>用户昵称: ${nickname} </h1>
	        <h1>用户邮箱: ${email} </h1>
	</div>
</div>
</body>  
</html>