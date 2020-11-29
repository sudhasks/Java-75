<%!
 String name="edureka";
 public int add(int x, int y){
	 int s = x+y;
	 return s;
 }
%>
<h2>
<%
 out.println("Name = "+ name+"<br><br>");
 out.println("Sum = "+ add(10,20));
%>
</h2>