<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:requestEncoding value="utf-8"/>
<!DOCTYPE html>
<html>
<head>
	<title>foodlist</title>
</head>
<body>
<jsp:include page="./session.jsp"></jsp:include>

<div class="box_border" style="margin-top:5px; margin-bottom: 10px;">
<form name="frmForm1" id="_frmFormSearch" method="post" action="search.do">
<table style="margin-left:auto; margin-right:auto; margin-top:3px; margin-bottom:3px; border:0; padding:0;">
<tr>
	<td>검색 : </td>
	<td style="padding-left:5px;">
	<select id="_s_category" name="s_category">
		<option value="name" selected="selected">상품명</option>
		<option value="materials" >성분명</option>								
		<option value="manufacturer" >제조사</option>								
	</select>
</td>
<td style="padding-left:5px;"><input type="text" id="_s_keyword" name="s_keyword" value=""/></td>
<td style="padding-left:5px;"><span class="button blue"><input type="submit" id="_btnSearch"> 검색 </span></td>
		</tr>
	</table>
	</form>
</div>

<table>
<c:forEach items="${foodlist}" var="food" varStatus="vs">
<tr><th>상품명</th><td>${food.name}</td></tr>
<tr><th>제조사</th><td>${food.manufacturer}</td></tr>
<tr><th>중량</th><td>${food.weight}</td></tr>
<tr><th>성분</th><td>${food.materials}</td></tr>
</c:forEach>
</table>
</body>
</html>