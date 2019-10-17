<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ThanhPC
  Date: 10/16/2019
  Time: 3:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Deleting customer</title>
</head>
<body>
<h1> Delete Customer</h1>
<p>
    <a hrerf="/customers">Back to customer list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Customer Information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td>${requestScope["customer"].getName()}</td>
            </tr>
            <tr>
                <td>Email: </td>
                <td>${requestScope["customer"].getEmail()}</td>
            </tr>
            <tr>
                <td>Address: </td>
                <td>${requestScope["customer"].getAddress()}</td>
            </tr>
            <tr>
                <td> <input type="submit" value="Delete customer"></td>
                <td><a href="/customers">Back to customer list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
