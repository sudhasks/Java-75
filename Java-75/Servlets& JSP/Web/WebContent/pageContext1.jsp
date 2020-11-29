<%!
 String uid;
%>
<h2>
<%
 uid = request.getParameter("uid");
 out.println("Hello, "+ uid);
 pageContext.setAttribute("username", uid, PageContext.SESSION_SCOPE);
%>
</h2>
<a href="pageContext2.jsp">Next Page</a>