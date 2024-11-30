<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		
		<form action="list" method="post">
			<label>Tim kiem:</label><br><hr>
			<p>Cccd</p>
			<input type="text" name="cccd"><br>
			<input type="text" name="marap"><br>
			<input type="text" name="tenphim"><br>
			<input type="text" name="ngayxem"><br>`
			<input type="submit" name="Search"/>
		</form> 
	</div>
	
	
	<table style="">
		<thead>
				<th>CCCD</th>
				<th>HoTen</th>
				<th>SDT</th>
				<th>MaRapChieu</th>
				<th>TenPhim</th>
				<th>NgayXem</th>
				<th>SuatChieu</th>
				<th>SoVe</th>
				<th>ViTriGhe</th>
				<th>Delete</th>
		</thead>
		<tr>
			<c:forEach items="${requestScope.kh}" var="kh" varStatus="status">
                    <tr>
                        <th scope="row">${status.index + 1}</th>
                        <td>${kh.cccd}</td>
                        <td>${kh.hoten}</td>
                        <td>${kh.sdt}</td>
                        <td>${kh.email}</td>
                        <td>Xoa</td>
                    </tr>
            </c:forEach>
            
		</tr>
	</table>
</body>
</html>