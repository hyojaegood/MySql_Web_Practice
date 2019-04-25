<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:requestEncoding value="utf-8"/>
<!DOCTYPE html>
<html>
<head>
	<title>booklist</title>
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
		<option value="title" selected="selected">제목</option>
		<option value="content" >내용</option>								
		<option value="publisher" >출판사</option>								
	</select>
</td>
<td style="padding-left:5px;"><input type="text" id="_s_keyword" name="s_keyword" value=""/></td>
<td style="padding-left:5px;"><span class="button blue"><input type="submit" id="_btnSearch"> 검색 </span></td>
		</tr>
	</table>
	</form>
</div>

<table>
<tr><th>번호</th><th>제목</th><th>저자</th><th>가격</th><th>출판사</th></tr>
<c:forEach items="${booklist}" var="book" varStatus="vs">
<tr>
<td>${vs.count}</td>
<td>${book.title}</td>
<td>${book.author}</td>
<td>${book.price}</td>
<td>${book.publisher}</td></tr>
</c:forEach>
</table>
</body>
</html>