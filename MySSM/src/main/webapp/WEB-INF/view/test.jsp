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
<title>My JSP 'test.jsp' starting page</title>  
<meta http-equiv="pragma" content="no-cache">  
<meta http-equiv="cache-control" content="no-cache">  

<link href="resources/css/bootstrap.min.css" rel="stylesheet">
</head>  
<body>  
<div class="container">
	<div class="jumbotron">
	        <h1>测试</h1>
	        <h1>${value}</h1>
	</div>
</div>
</body>  
</html>