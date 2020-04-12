<%--
  Created by IntelliJ IDEA.
  User: quentin
  Date: 4/11/20
  Time: 3:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/doAdd" method="post">
    <table>
        <tr>
            <td>Book Name:</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Author Name:</td>
            <td><input type="text" name="author.name"></td>
        </tr>
        <tr>
            <td>Author Age:</td>
            <td><input type="text" name="author.age"></td>
        </tr>
        <tr>
            <td>Hobbies:</td>
            <td>
                <input type="checkbox" name = "hobbies" value="Soccer">Soccer
                <input type="checkbox" name = "hobbies" value="Basketball">Basketball
                <input type="checkbox" name = "hobbies" value="PingPong">PingPong
            </td>
        </tr>
        <tr>
            <td>Price:</td>
            <td><input type="text" name="price"></td>
        </tr>
        <tr>
            <td>If public:</td>
            <td><input type="radio" value="true" name="ispublic">Yes
                <input type="radio" value="false" name="ispublic">No
            </td>
        </tr>
        <tr>
            <td>Release Data:</td>
            <td><input type="text" name="date"></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Add">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
