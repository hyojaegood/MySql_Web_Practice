<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:requestEncoding value="utf-8"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/table.css"/>
<title>로그인</title>
</head>
<body>
<form action="./loginaf.do" method="post">
<table class='content_table'>
<colgroup>
<col width="30%"/><col width="70%"/>
</colgroup>
<tr>
<th>아이디</th><td><input type="text" name='id' width="50"/> </td>
</tr>
<tr>
<th>패스워드</th><td><input type="password" name='password' width="50"/> </td>
</tr>
<tr>
<td colspan="2"><input type="submit" value='로그인' /> </td>
</tr>
</table>
</form>
<a href='./regibf.do'>회원가입</a>
</body>
</html>




