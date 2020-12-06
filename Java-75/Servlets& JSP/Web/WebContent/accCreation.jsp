<jsp:useBean id="acc" class="co.edureka.entity.Account"></jsp:useBean>

<jsp:setProperty name="acc" property="*"/>

<h2>
A/C No: <jsp:getProperty property="acno" name="acc"/> <br>
Name: <jsp:getProperty property="name" name="acc"/> <br>
Balance: <jsp:getProperty property="bal" name="acc"/> <br>
