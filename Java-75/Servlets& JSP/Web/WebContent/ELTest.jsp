<h2>
<%
 String name = request.getParameter("name");
 out.println("My Name is : "+ name);
%>
<hr>
My Name is: ${param.name}
</h2>