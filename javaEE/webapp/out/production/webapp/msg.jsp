<%--
  Created by IntelliJ IDEA.
  User: huang
  Date: 2019/4/18
  Time: 9:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <%--    <meta http-equiv="Refresh" content="3; url=./home">--%>
</head>
<body>
<span><c:out value="${msg}" /></span>
<c:remove var="msg" />
<script>
    window.onload = function() {
        var timer = setTimeout(function () {
            window.location = "./home";
        },3000)
    }
</script>
</body>
</html>
