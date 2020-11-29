<%!
 String name="edureka";
 public int add(int x, int y){
	 int s = x+y;
	 return s;
 }
%>
<h2>
 Name = <%=name %>
 <br><br>
 <%="Sum = "+add(12,34) %>
</h2>