
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Page</title>
    <link href="resources/css/styles.css" rel="stylesheet"/>
</head>
<body>
<div class="form">
${inst}
</div>
<div class="form">
<h1>Please fill in the form to register!</h1>
</div>
<div class="form">
<form action="formhandler" method="post">
    First Name: <input type="text" name="firstname"><br>
    Last Name: <input type="text" name="lastname"><br>
    Email: <input type="text" name="email"><br>
    Phone Number: <input type="number" name="phonenumber"><br>
    Password: <input type="password" name="password"><br>
    <input type="submit" name="submit" value="register">
</form>
</div>
<div class="form">
<a href="/">Go Home</a>
</div>
</body>
</html>
