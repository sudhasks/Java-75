<%!
 String uid;
%>
<h2>
<%
 //uid = request.getParameter("uid");
 uid = pageContext.getAttribute("username", PageContext.SESSION_SCOPE).toString(); 
 out.println("Hello, "+ uid);
%>