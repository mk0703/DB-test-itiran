<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.io.*,java.util.*,java.text.*,test.sample1_beans" %>
<% List<sample1_beans> list = (List<sample1_beans>)request.getAttribute("list"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>bihinkanri</title>
</head>
<body>
<TABLE BORDER ="1">

<TR>
<TH>ID
<TH>NAME
<TH>STATUS

<%


	for(int i=0; i<list.size(); i++) {
		sample1_beans beans = list.get(i);
%>
	<tr>
		<td><%= beans.getId() %>
		<td><%= beans.getName() %>
		<td><%= beans.getStatus() %>
<%
	}
%>

</TABLE>

</body>
</html>