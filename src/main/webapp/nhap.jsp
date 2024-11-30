<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3 style="color: red">${requestScope.error}</h3>
	<h1>Nhap ve xem phim</h1>
	<c:set var="phim" value="${requestScope.phims}"/>
	<c:set var="rapchieuphim" value="${requestScope.rapchieuphims}"/>
	<form action="add" method="post">
		<p>CCCD: </p>
		<input type="text" name="cccd" required/><br/>
		<p>HoTen: </p>
		<input type="text" name="hoten"/><br/>
		<p>SDT: </p>
		<input type="text" name="sdt"/><br/>
		<p>Email: </p>
		<input type="text" name="email"/><br/>
		<hr>
		<h2>Thong tin ve: </h2>
		
		<p>Rap chieu phim: </p>
		
			
			<select name="marapchieu">
				<c:forEach items="${rapchieuphim}" var="rap">
					<option value="${rap.getMarapchieu()}">${rap.getMarapchieu()}</option>
				</c:forEach>
			</select>
		
		<p>Ten phim: </p>
		
			
			<select name="tenphim">
				<c:forEach items="${phim}" var="phim">
					<option value="${phim.getMaphim()}">${phim.getTenphim()}</option>
				</c:forEach>
			</select>
		
		<p>Ngay xem: </p>
		<input type="text" name="ngayxem" required/>
		<p>Suat chieu</p>
			<select name="suatchieu">
				
				<option value="15h">15h</option>
				<option value="10h">10h</option>
				<option value="12h">12h</option>
				
			</select>
		<p>So ve: </p>
		<input type="number" name="sove" required/><br>
		<p>Vi tri ghe</p>
		<input type="number" name="vitrighe"/><br>
		<input type="submit" name="submit" value="Dat ve"/>
		
		
		
	</form>
</body>
</html>