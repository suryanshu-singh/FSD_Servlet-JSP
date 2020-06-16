<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% if (session.getAttribute("userName") != null){ %>
		<h4><b>Welcome:<% out.println(session.getAttribute("userName"));%></b></h4>	
		<form action="Logout.jsp" method = "post">
			<input type = "submit" value = "Logout">
		</form>
<% }else{response.sendRedirect("index.jsp");} %>			
</body>
</html>