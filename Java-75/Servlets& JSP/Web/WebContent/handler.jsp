<%@page isErrorPage="true"%>
<body style="background-color:maroon;color:cyan">
<h2>
<%
 if(exception instanceof ArithmeticException)
	 out.println("Exception Occured: "+ exception.toString());
 else if(exception instanceof ArrayIndexOutOfBoundsException)
	 out.println("Invalid Array Index: "+ exception.getMessage());
 else
	 out.println("Internal Server Error!");
%>
</h2>
</body>