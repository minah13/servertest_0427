<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		
	});
</script>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<h1>개인정보 수정</h1>
<form action="membermybatisupdate" method="post">
	아이디:<input type=text name=id value="${param.id}" readonly><br>
	이름 입력 : <input type="text" id="name" name="name"><br>
	주소 입력 : <input type="text" id="address" name="address"><br>
	<input type="submit" value="정보수정">
</form>
</body>
</html>