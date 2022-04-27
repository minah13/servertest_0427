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

<c:if test="${!empty param.page }">
	<h1>회원 정보 : ${param.page} 페이지 - ${name } </h1>
</c:if>

<c:if test="${!empty param.address }">
	<h1>회원 정보 : (
	<c:forEach items="${param.address }" var="add">
		${add} &nbsp; 
	</c:forEach>
	) 의 주소를 가진 회원들 - ${name} </h1>
</c:if>


<c:forEach items="${memberlist}" var="dto">
	<h3>회원 아이디 : ${dto.id }, 이름 : ${dto.name }, 이메일 : ${dto.email }</h3>
</c:forEach>



</body>
</html>