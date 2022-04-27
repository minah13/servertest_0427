<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${updaterow == 1}">
	<h1>정상 수정되었습니다.</h1>
</c:if>

<a href="membermybatislist">회원리스트보러가기</a>

</body>
</html>