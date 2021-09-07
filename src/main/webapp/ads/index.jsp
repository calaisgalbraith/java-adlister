<%--
  Created by IntelliJ IDEA.
  User: calais
  Date: 9/6/21
  Time: 9:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Show Ads</title>
</head>
<body>
    <h1>Ads Listed: </h1>

    <c:forEach var="ad" items ="${ads}">
        <div class="ad">
            <h2>${ad.title}</h2>
            <p>${ad.description}</p>
            <br>
        </div>
    </c:forEach>

</body>
</html>
