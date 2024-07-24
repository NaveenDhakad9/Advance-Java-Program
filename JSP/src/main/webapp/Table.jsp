<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Table</title>
</head>
<body>
<table border="2">
<% for(int i=1 ; i<=10 ;i++){ %>
<tr>
<td>5</td>
<td>x</td>
<td><%= i %></td>
<td>=</td>
<td><%= 5*i %></td>
</tr>
<% } %>
</table>
</body>
</html>