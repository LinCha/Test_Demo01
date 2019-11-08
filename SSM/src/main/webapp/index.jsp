<%--
  Created by IntelliJ IDEA.
  User: LIN
  Date: 2019/10/30
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="account/findAll">测试查询</a>

    <h3>测试保存</h3>
     <form action="account/save" method="post">
       姓名：<input type="text" name="name">
       金额：<input type="text" name="money">
       <input type="submit" value="提交">
     </form>
</body>
</html>
