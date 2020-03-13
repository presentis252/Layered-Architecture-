<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>방명록</h1>
<p>방명록 전체 수 :</p>
<form method="post" action="/guestbook/write">
name:<input type="text" name="name"><br>
<input type=textarea" name="content"><br>
<input type="submit" value="등록"><br>
</form>
</body>
</html>