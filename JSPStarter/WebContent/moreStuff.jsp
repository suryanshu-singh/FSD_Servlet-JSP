<!DOCTYPE html>
<%@page import="com.ibm.training.DBFetchValues"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<html>
<head>
<meta charset="UTF-8">
<title>More Stuff with JSP's</title>
</head>
<body>
<!-- Using the include directive -->
<%@ include file="content.html"%> 

<!-- Using the jsp include action -->
<%-- <jsp:include page="header.html" />
<jsp:include page="mainContent.html" />
<jsp:include page="footer.html" /> --%>


<jsp:forward page="next.jsp">
<jsp:param value="762334" name="ibmID"/>
<jsp:param value="EGL" name="ibmLocation"/>
</jsp:forward>


<%
/* Call the method from the file */
ResultSet rs = new DBFetchValues().getValues();
%>
<!-- Create the dropdown -->
<select>
<option>Select User:</option>
<%
while(rs.next()){
	%>
	<option><%= rs.getString("userName") %></option>
<% 	
}
%>
</select>
</body>
</html>