<%@page errorPage="handler.jsp" %>
<%!
  int x=10,y=10,z;
  int[] marks = new int[10];
%>
<h2>
<%
  z = x/y;
  out.println(x+" / "+y+" = "+z+"<br>");
  out.println(marks[10]);
%>
</h2>