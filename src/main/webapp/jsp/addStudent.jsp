<%--
  Created by IntelliJ IDEA.
  User: quentin
  Date: 4/13/20
  Time: 11:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>To Add Student</title>
</head>
<body>
<form action="/doAddStudent" method="post">
    <table>
        <tr>
            <td>Student ID:</td>
            <td><input type="text" name="id"></td>
        </tr>
        <tr>
            <td>Student Name:</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><input type="text" name="email"></td>
        </tr>
        <tr>
            <td>Age:</td>
            <td><input type="text" name="age"></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="ADD">
            </td>
        </tr>
    </table>
</form>

</body>
</html>
