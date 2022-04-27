<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="<%=request.getContextPath() %>/resources/jquery-3.6.0.min.js""></script>
<script type="text/javascript">
	$(document).ready(function(){
		//jquery code
	});
	
</script>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<h1>상품리스트</h1>
<c:forEach items="${list }" var="dto">
${dto.productcode }  <a href="/product?productcode=${dto.productcode }">${dto.productname }</a>	${dto.price }<br>
</c:forEach>


</body>
</html>