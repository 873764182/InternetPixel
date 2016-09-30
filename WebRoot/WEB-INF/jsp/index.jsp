<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP首页</title>
</head>
<body>
	<%
		response.getWriter().write("用Java代码获取值: ");
		String controller_data = request.getAttribute("data_key").toString();
		response.getWriter().write(controller_data);
	%>
	<br /> 用美元符号获取值: ${data_key}
</body>
</html>