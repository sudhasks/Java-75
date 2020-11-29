<%!
 String uid, pwd;
%>
<h2>
<%
 uid = request.getParameter("uid");
 pwd = request.getParameter("pwd");
 
 out.println("User Name = " + uid+"<br>");
 out.println("Password = "+ pwd);
%>
<hr>
 Server Name : <%=request.getServerName() %><br>
 Server Port: <%=request.getServerPort() %><br>
 Method: <%=request.getMethod() %><br>
 Context Path: <%=request.getContextPath() %><br>
 Content Type: <%=request.getContentType() %> <br>
 Content Length: <%=request.getContentLength() %>
</h2>