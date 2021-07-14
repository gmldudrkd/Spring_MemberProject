<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../include/css.jsp" %>
<%@include file="../include/Header.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form role="form" method="post">
	
	<div class ="regi_div">
		<div class="divgrp">
			<div class="title_div">제목</div>
			<input type="text" name="title"  placeholder="Enter Title" width="300px">
		</div>
		
		<div class="divgrp">
			<div class="title_div">내용</div>
			<textarea name="content" rows="3" placeholder="Enter......."></textarea>
		</div>
		
		<div class="divgrp">
			<div class="title_div">작성자</div>
			<input type="text" name="writer" placeholder="Enter Writer">
		</div>
	</div>
	
	<div>
		<button type="submit" style="background-color:gray;margin-left:5%"><font color="white">전 송</font></button>
	</div>
</form>

</body>
</html>