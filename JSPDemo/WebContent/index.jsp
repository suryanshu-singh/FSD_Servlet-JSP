<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b><% out.println("Running java in HTML!!"); %></b> 
<select>
<option>Please select your ID</option>
<% for(int i=0;i<10;++i){ %>
<option><% out.println(i); %></option>
<%} %>
</select>
<% out.println("Current system date"+new Date()); %>
</body>
</html>