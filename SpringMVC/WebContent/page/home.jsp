<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>home</title>
</head>
<body>
<h2>spring mvc</h2>
<p id="msg" style="color:red ">${msg }</p>
<form action="login.html" method="post">
	username:<input type="text" name="username" />
	<p>
	password:<input type="password" name="password"/>
	<p>
	<input type="submit" value="submit" />
</form>
<a href="other.html">other page</a>

</body>
</html>