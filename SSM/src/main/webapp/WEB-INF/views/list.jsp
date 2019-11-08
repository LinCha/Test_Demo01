<%--
  Created by IntelliJ IDEA.
  User: LIN
  Date: 2019/10/30
  Time: 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>查询了所有的账户:</h3>
    <c:forEach items="${accounts}" var="account">
        <h4>${account.name}</h4>
    </c:forEach>
</body>
</html>
