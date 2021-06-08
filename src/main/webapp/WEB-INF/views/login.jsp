<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style>
body {
	background-image:
		url("https://d1kxiaxkq0bgmn.cloudfront.net/wp-content/uploads/2019/10/airlines.jpg");
	background-size: cover;
	background-repeat: no-repeat;
}

input {
	width: 150px;
	margin-bottom: 15px;
}

form {
	margin-left: 500px;
	background: rgb(236, 236, 222);
	width: 28%;
	padding: 1em;
	margin-top: 13%;
}

label {
	float: left;
	width: 120px;
}

h1 {
	margin-left: 350px;
}

#login {
	margin-left: 15px;
}

#create {
	width: 200px;
	margin-left: 15px;
}

.links {
	width: 100%;
	background-color: black;
	overflow: auto;
}

.links a {
	float: left;
	padding: 12px;
	color: white;
	text-decoration: none;
	font-size: 20px;
	width: 23%;
	text-align: center;
}

.links a:hover {
	background-color: beige;
	color: black;
}
</style>

</head>
<body>

	<header>
		<div class="links">
			<a href="">Reservation</a> <a href="welcome.html">Home</a> <a href="">Flight</a>
			<a href="login.html">Login</a>
		</div>
	</header>

	</div>

	<form method="post">
		<table>
			<tr>
				<td><label>User Id : </label></td>

				<td><input name="username" type="text"></td>
			</tr>

			<tr>

				<td><label>Password : </label></td>

				<td><input name="password" type="password"><br></td>
			</tr>
		</table>
		<br> <br>
		<button type="submit" class="btn btn-primary" id="login">Login</button>
		OR
		<a href="/register"><button type="button" class="btn btn-primary" id="create">Create
			New Account</button></a>

	</form>


	<br>


</body>
</html>