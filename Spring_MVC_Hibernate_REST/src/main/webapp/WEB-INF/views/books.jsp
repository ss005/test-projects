<%--
  Created by IntelliJ IDEA.
  User: sanjay
  Date: 9/8/18
  Time: 12:56 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>List of Books</title>
</head>
<body>
<c:forEach items="${bookList}" var="book">
    <tr>
        <td><c:out value="${book.id}"/></td>
    </tr>
    <%--<c:out value="${book.author}"/>--%>
</c:forEach>
</body>


</html>
