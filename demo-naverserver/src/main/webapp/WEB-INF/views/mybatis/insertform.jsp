<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원가입</h1>
<form action="membermybatisinsert" method="post">
아이디 : <input type="text" id="id" name="id"><br>
비밀번호 : <input type="password" id="password" name="password"><br>
이름 : <input type="text" id="name" name="name"><br>
핸드폰번호 : <input type="text" id="phone" name="phone"><br>
이메일 : <input type="text" id="email" name="email"><br>
주소 : <input type="text" id="address" name="address"><br>
<input type="submit" value="회원가입">
</form>
</body>
</html>