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
	
	<div class ="regi_div" >
		<div class="divgrp">
			<div class="title_div fieldnm">제목 : <br>
				<input type="text" name="title"  placeholder="제목을 입력하세요,," width="500px">
			</div>
		</div>
		
		<div class="divgrp">
			<div class="title_div fieldnm">내용 : </div>
			<textarea name="content" rows="3" placeholder="기재할 내용을 입력하세요,,"></textarea>
		</div>
		
		<div class="divgrp">
			<div class="title_div fieldnm">작성자 : <br>
				<input type="text" name="writer" placeholder="작성자를 입력하세요">
			</div>
		</div>
	</div>
	
	<div>
		<button type="submit" style="background-color:gray;margin-left:5%"><font color="white">전 송</font></button>
	</div>
</form>

 <%@include file="../include/Tail.jsp" %>
</body>
</html>