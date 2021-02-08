<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="java.util.ArrayList"%> 
    <%@page import=" com.servlet.RetriveStudentdetails"%>    
    <%@page import=" com.servlet.StudentDetails"%>  
    <%@page import=" com.constants.Constant"%>  
    <%@page import="java.util.Iterator"%> 
      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>StudentDetailsDisplaying</title>
</head>
<body>
<% ArrayList<StudentDetails> studentList = (ArrayList<StudentDetails>) request.getAttribute(Constant.stulist); %> 
<% ArrayList<StudentDetails> studentalList = (ArrayList<StudentDetails>) request.getAttribute(Constant.displayall); %>
<b><a href="<%=request.getContextPath() %>/Displaydetails"> Students</a></b>

<br></br>
<table>
<%
if(request.getAttribute(Constant.stulist) != null)  
{
	for(StudentDetails stuDetails:studentList){
		%>	
	<tr>
		
		<td><a href="<%=request.getContextPath()%>/VerifyId?id=<%=stuDetails.getid()%>"><%=stuDetails.getid()%></a></td>
		
	</tr>
	<%
	}
}
%>
</table>
<b><a href="<%=request.getContextPath()%>/Displayallstudentdetails"> DisplayallstudentDetails</a></b>
<table   style="width:100%">
<%
if(request.getAttribute(Constant.displayall)!=null)
{
	
	for(StudentDetails s:studentalList)
	{%>
	
	
		<tr><td><%= s.getname()%></td>
		<td><%= s.getid()%></td></tr>
		
<% 	}
}
%>
</table>
<table style="width:100%">
<%
if(request.getAttribute(Constant.studentd) != null) 
{
StudentDetails studentd = (StudentDetails)request.getAttribute(Constant.studentd);%>

	<tr><td> Name:</td><br><td><%=studentd.getname()%></td>
	<td> Id:</td><br><td><%=studentd.getid()%></td></tr>
	
	<%} %>
</table>
<b><a href="<%=request.getContextPath() %>/signout.jsp"><div align="right"> Sign out</div></a></b>
</body>
</html>