<%@page import="java.util.Date" %>
<%!
 Date today = null;
%>
<h2 align="center">
<%
 today = new Date();
 out.println(today);
%>
</h2>