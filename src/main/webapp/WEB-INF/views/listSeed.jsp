<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: thanh
  Date: 2025/08/23
  Time: 1:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh sách hạt giống</h1>
<form action="/seeds" method="get">
  <lable for="seed_name">Tìm kiém theo tên hạt giống</lable>
  <input type="text" id="seed_name" name="seed_name">
  <input type="submit" value="Tìm kiém">
</form>
<button><a>Thêm hạt giống</a></button>
<table>
  <thead>
  <tr>
    <th>ID</th>
    <th>Tên hạt giống</th>
    <th>Số lượng</th>
    <th>Danh mục</th>
    <th>Hành đông</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${seeds}" var="seed" varStatus="loop">
    <tr>
      <td>${loop.index+1}</td>
      <td>${seed.seedName}</td>
      <td>${seed.quantity}</td>
      <td>${seed.catalog}</td>
      <td>
        <button><a>Sửa</a></button>
        <button><a>Xóa</a></button>
      </td>
    </tr>
  </c:forEach>
  </tbody>
</table>

</body>
</html>
