<html>
<head>
<meta charset="ISO-8859-1">
<title>Time</title>
</head>
<body>
<%-- without Import
<%= java.time.LocalTime.now() %>
--%>
<%@ page language="java" import="java.time.*" %>
<%= LocalTime.now() %>
</body>
</html>