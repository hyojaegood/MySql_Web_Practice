<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:requestEncoding value="utf-8"/>
<!DOCTYPE html>
<html>
<head>
	<title>emplist</title>
</head>
<body>
<table>
<tr><th>아이디</th><th>이름</th><th>부서</th><th>직책</th><th>연봉</th></tr>
<c:forEach items="${emplist}" var="emp" varStatus="vs">
<tr>
<td>${emp.empno}</td>
<td>${emp.ename}</td>
<td>${emp.deptno}</td>
<td>${emp.job}</td>
<td>${emp.sal}</td></tr>
</c:forEach>
</table>
</body>
</html>