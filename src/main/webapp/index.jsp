<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Task 1</title>
</head>
<body>
<h1>Task 1</h1>
<form method="post">
    <c:forEach items="${list}" var="item">
        <p>${item}</p>
    </c:forEach>
    <button type="submit">Order list</button>
</form>
</body>
</html>