import java.io.*;
import javax.servlet.*;

public class LifecycleServlet extends GenericServlet
{
 public void init(ServletConfig config) throws ServletException{
	 super.init(config);
	 System.out.println(".. inside init()..");
 }

 public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException{
	 System.out.println("..inside service method..");
 }
 
 public void destroy(){
	 System.out.println(".. inside destroy method..");
 }
}