<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
    <link href="resources/css/styles.css" rel="stylesheet"/>
    <title>Welcome to GC COFFEE! (welcome.jsp)</title>
</head>
<head>
    <title>Title</title>
</head>
<body>
<div class="form">
<h1>Welcome to GC Coffee!</h1>
<a href="register"> Register</a>
<br>
<table border="1">
    <tr>
        <th>Name</th>
        <th>Description</th>
        <th>Quantity</th>
        <th>Price</th>
    </tr>
    <c:forEach items="${cList}" var="item">
        <tr>
            <td>

                    ${item.name}
            </td>
            <td>

                    ${item.description}
            </td>
            <td>

                    ${item.quantity}
            </td>
            <td>

                   $ ${item.price}
            </td>

        </tr>
    </c:forEach>
</table>
</div>
</body>
</html>