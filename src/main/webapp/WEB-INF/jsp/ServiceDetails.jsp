<%--
  Created by IntelliJ IDEA.
  User: yusufcakmak
  Date: 6/23/15
  Time: 7:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>Rakı Müzikleri - Liste</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
</head>
<body>
<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Rakı Müzikleri</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Liste <span class="sr-only">(current)</span></a></li>
        <li><a href="/admin/register">Ekle</a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
<br /><br /><br />
<h1>Şarkı Listesi</h1>
  <c:if test="${!empty service}">
    <table class="table table-hover">
      <tr>
        <td>Song Id</td>
        <td>Song Name</td>
        <td>Singer Name</td>
        <td>Song Url</td>
        <td>isApproved</td>

      </tr>
      <c:forEach items="${service}" var="service">
        <tr>
          <td><c:out value="${service.id}"/></td>
          <td><c:out value="${service.songName}"/></td>
          <td><c:out value="${service.singerName}"/></td>
          <td><c:out value="${service.songUrl}"/></td>
          <td><c:out value="${service.isApproved}"/> </td>

        </tr>
      </c:forEach>
    </table>
  </c:if>


  <a href="register.html" >Yeni şarkı ekle</a>

  <script src="https://code.jquery.com/jquery-1.11.3.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>

