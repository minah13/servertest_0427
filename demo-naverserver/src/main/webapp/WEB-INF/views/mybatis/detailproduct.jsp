<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="jquery-3.6.0.min.js""></script>
<script type="text/javascript">
	$(document).ready(function(){
		//jquery code
	});
</script>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
상품 코드 : ${detail.productcode }<br>
상품 이름 : ${detail.productname }<br>
상품 가격 : ${detail.price }<br>
제조 회사명 : ${detail.company }<br>
수량 : ${detail.balance }<br>
입고일 : ${detail.regdate }<br>

</body>
</html>