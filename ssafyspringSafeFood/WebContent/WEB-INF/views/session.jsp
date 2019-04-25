<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:requestEncoding value="utf-8"/>
<c:if test='${empty login}'>
<script type="text/javascript">
   alert('로그인 에 실패했습니다.');
   location.href='./loginbf.do';
</script>
</c:if>

<c:if test='${not empty login}'>
<a href='./foodlist.do'>상품목록보기</a> |
<a href='./modifyme.do'>정보수정</a> |
<a href='./deleteme.do'>회원탈퇴</a> |
<a href='./logout.do'>로그아웃</a> | <span>[${login.name}]님 </span>
</c:if>
<hr/>