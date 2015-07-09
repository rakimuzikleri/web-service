<%--
  Created by IntelliJ IDEA.
  User: yusufcakmak
  Date: 6/23/15
  Time: 7:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
  <title>Rakı Müzikleri </title>
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
        <li><a href="/admin/serviceList.html">Liste</a></li>
        <li class="active"><a href="#">Ekle <span class="sr-only">(current)</span></a></li>

      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
<br /><br /><br />
<h1>Şarkı Ekle</h1>
  <c:url var="serviceRegistration" value="saveService.html"/>
  <form:form id="registerForm" modelAttribute="service" method="post" action="${serviceRegistration}">
    <table width="400px" height="150px">
      <tr>
        <td><form:label path="songName">SongName</form:label></td>
        <td><form:input  path="songName"/></td>
      </tr>
      <tr>
        <td><form:label path="singerName">singerName</form:label></td>
        <td><form:input  path="singerName"/></td>
      </tr>
      <tr>
        <td><form:label path="songUrl">songUrl</form:label></td>
        <td><form:input path="songUrl"/></td>
      </tr>
      <tr>
        <td><form:label path="isApproved">isApproved(use 1)</form:label></td>
        <td><form:input path="isApproved"/></td>
      </tr>
      <tr><td></td><td>
        <input type="submit" value="Register" />
      </td></tr>
    </table>
  </form:form>
  <a href="serviceList.html" >Müzik Listesi için tıklayınız </a>



  <script src="https://code.jquery.com/jquery-1.11.3.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>

