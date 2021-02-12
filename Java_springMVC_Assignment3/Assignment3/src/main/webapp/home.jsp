<html>
<body>
<title>JSP page</title>
<link href="${pageContext.request.contextPath}/resources/css/main.css"
    rel="stylesheet">
<script src="${pageContext.request.contextPath}/resources/js/fun.js"></script>
</head>
<body>
    <h2>Hi Nisum</h2>
 
    <P>The time on the server is ${serverTime}.</P>
 
    <br>
    <br>
 
    <img
        src="${pageContext.request.contextPath}/resources/images/flower.png" />
 
    <br>
    <br>
 
    <input type="button" onclick="doSomeWork()" value="Click Me" />
 

</body>
</html>
