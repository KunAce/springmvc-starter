<%--
  Created by IntelliJ IDEA.
  User: quentin
  Date: 4/12/20
  Time: 12:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action ="/doAddClass" method="post">
    <table>
        <tr>
            <td>Class Id:</td>
            <td><input type ="text" name="id"></td>
        </tr>
        <tr>
            <td>Class Name:</td>
            <td><input type="text" name="info['name']"></td>
        </tr>
        <tr>
            <td>Class Location:</td>
            <td><input type="text" name="info[pos]"></td>
        </tr>
        <tr>
            <td>Student Id:</td>
            <td><input type ="text" name="students[0].id"></td>
        </tr>
        <tr>
            <td>Student Name:</td>
            <td><input type="text" name="students[0].name"></td>
        </tr>
        <tr>
            <td>Student Id2:</td>
            <td><input type="text" name="students[1].id"></td>
        </tr>
        <tr>
            <td>Student Name2:</td>
            <td><input type="text" name="students[1].name"></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
