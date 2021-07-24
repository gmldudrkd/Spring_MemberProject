<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@include file="../include/Header.jsp" %>
 <%@include file="../include/css.jsp" %>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 <%@page session="false" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 조회</title>
</head>
<body>

<form role="form" method="post">
	<input type="hidden" name="bno" value="${boardVO.bno }">
	<input type="hidden" name="page" value="${cri.page }">
	<input type="hidden" name="perPageNum" value="${cri.perPageNum }">
</form>
	
<div class ="regi_div">
	<div class="divgrp">
		<div class="title_div">게시판 조회</div>
	</div>
	
	<div class="divgrp">
		<div class="title_div">제목</div>
		<input type="text" name="title"  value="${boardVO.title }"  readonly="readonly"  width="300px">
	</div>
	
	<div class="divgrp">
		<div class="title_div">내용</div>
		<textarea name="content" rows="3"  readonly="readonly" >${boardVO.content }</textarea>
	</div>
	
	<div class="divgrp">
		<div class="title_div">작성자</div>
		<input type="text" name="writer"  value="${boardVO.writer }" readonly="readonly" >
	</div>
</div>

<div>
	<button type="submit" id="mod" style="background-color:gray;margin-left:5%"><font color="white">수 정</font></button>
	<button type="submit" id="del" style="background-color:gray;"><font color="white">삭 제</font></button>
	<button type="submit" id="golist" style="background-color:gray;"><font color="white">이전목록</font></button>
</div>

</body>
</html>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>
	$(document).ready(function(){
		var Obj = $("form[role='form']");
		
		$("#mod").on("click", function(){
			Obj.attr("action", "/board/modifyPage");
			Obj.attr("method", "get");
			Obj.submit();
		});
		
		$("#del").on("click", function(){
			Obj.attr("action", "/board/removePage");
			Obj.submit();
		});
		
		$("#golist").on("click", function(){
			Obj.attr("method","get");
			Obj.attr("action", "/board/listPage");
			Obj.submit();
		});
	});
</script>
