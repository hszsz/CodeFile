<%--
  Created by IntelliJ IDEA.
  User: 14375
  Date: 2019/4/21
  Time: 9:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Fixed Top Navbar Example for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="<c:url value="/bootstrap-3.3.7-dist/css/bootstrap.min.css"/>" rel="stylesheet">
    <script src="<c:url value="/jquery/jquery.min.js"/>"></script>
    <script src="<c:url value="/bootstrap-3.3.7-dist/js/bootstrap.min.js"/>"></script>

</head>

<body>

<!-- Fixed navbar -->
<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Project name</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#about">About</a></li>
                <li><a href="#contact">Contact</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Action</a></li>
                        <li><a href="#">Another action</a></li>
                        <li><a href="#">Something else here</a></li>
                        <li role="separator" class="divider"></li>
                        <li class="dropdown-header">Nav header</li>
                        <li><a href="#">Separated link</a></li>
                        <li><a href="#">One more separated link</a></li>
                    </ul>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="../navbar/">Default</a></li>
                <li><a href="../navbar-static-top/">Static top</a></li>
                <li class="active"><a href="./">Fixed top <span class="sr-only">(current)</span></a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>

<div class="container">

    <!-- Main component for a primary marketing message or call to action -->
    <div class="jumbotron">
        <h1>Navbar example</h1>
        <form action="<c:url value="/update"/> " method="get">
            <div class="form-group">
                <label >id</label>
                <input type="text" class="form-control" name="id" value="${user.id}"  readonly>
            </div>
            <div class="form-group">
                <label >name</label>
                <input type="text" class="form-control" name="name" value="${user.name}">
            </div>
            <div class="form-group">
                <label >birthday</label>
                <input type="date" class="form-control" name="birthday" value="${user.birthday}">
            </div>

            <button type="submit" class="btn btn-default">Submit</button>
        </form>
    </div>

</div> <!-- /container -->

</body>
</html>
