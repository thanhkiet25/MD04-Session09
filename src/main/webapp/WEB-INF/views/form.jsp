<%--
  Created by IntelliJ IDEA.
  User: thanh
  Date: 2025/08/23
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="oto" action="/handle-form" method="post">
<form:label path="fullName">FullName :</form:label>
    <form:input path="fullName"/><br>
    <form:select path="hobbies">
        <form:options items="${hobbies}" />
    </form:select>

</form:form>
</body>
</html>
