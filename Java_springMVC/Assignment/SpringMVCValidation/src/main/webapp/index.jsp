<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginForm</title>
<link href="${pageContext.request.contextPath}/resources/css/main.css"
    rel="stylesheet">
</head>
<body>

<body>
    <form action="user" method="POST" >  
    UserName:<input type="text" name="name"/>
    <br/><br/>  
    Password:<input type="password" name="password"/>
    <br/><br/>  
    <input type="submit" value="login"/>  
    </form>  
  </body>
</html>
