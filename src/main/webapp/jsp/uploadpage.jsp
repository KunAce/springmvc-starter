<%--
  Created by IntelliJ IDEA.
  User: quentin
  Date: 4/12/20
  Time: 5:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action ="/doUpload" method="post" enctype="multipart/form-data">
    <input type="file" name="file">
    <input type="submit" value="UPLOAD">
</form>
</body>
</html>
