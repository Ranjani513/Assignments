<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome page</title>
<link href="${pageContext.request.contextPath}/resources/css/main.css"
    rel="stylesheet">
</head>
<body>

<h2>Hello ${user.name} </h2>
<img
        src="${pageContext.request.contextPath}/resources/images/nisum.png" width="250" height="250"/>
</body>
</html>