<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:requestEncoding value="utf-8"/>
<c:if test="${empty login }">
<jsp:include page="./logoutnav.jsp"></jsp:include>
</c:if>
<c:if test="${not empty login }">
<jsp:include page="./loginnav.jsp"></jsp:include>
</c:if>