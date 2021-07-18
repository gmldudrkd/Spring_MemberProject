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
<title>게시판 목록</title>
</head>
<body>
	<br>
	<div style="margin:20px;">게시판 목록</div>
	<table>
		<tr>
			<th style="width:5%">No.</th>
			<th style="width:20%">제 목</th>
			<th style="width:10%">저자</th>
			<th style="width:10%">등록일시</th>
			<th style="width:5%">조회수</th>
		</tr>
		
		<c:forEach items="${list}" var="boardVO">
			<tr>
				<td style="width:5%">${boardVO.bno }</td>
				<td style="width:20%">
					<a href="/board/read?bno=${boardVO.bno }">${boardVO.title }</a>
				</td>
				<td style="width:10%">${boardVO.writer }</td>
				<td style="width:10%">
					<fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${boardVO.regdate }" />
				</td>
				<td style="width:5%">${boardVO.viewcnt }</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>

<script>
	var result = "${msg}";
	if(result == "success"){
		alert("처리 완료");
	}
</script>