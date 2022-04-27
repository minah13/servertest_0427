<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${insertrow == 1}">
	<h1>정상 회원가입되었습니다.</h1>
</c:if>
<c:if test="${insertrow != 1}">
	<h1>회원가입될 수 없는 정보입니다.</h1>
</c:if>
</body>
</html>