<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Welcome Page</title>
<link rel='stylesheet' type='text/css' href='welcome.css'>
<script src='main.js'></script>
<style>
body {
	background-image:
		url("https://d1kxiaxkq0bgmn.cloudfront.net/wp-content/uploads/2019/10/airlines.jpg");
	background-size: cover;
	background-repeat: no-repeat;
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
	font-size: 25px;
	width: 23%;
	text-align: center;
}

.links a:hover {
	color: b;
}

#welcome {
	padding: 5%;
	text-align: center;
	font-size: 40px;
	margin-top: 5%;
	font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande',
		'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
	color: rgb(44, 2, 2);
}

#info {
	margin-top: 40%;
	display: inline;
}
</style>
</head>
<body>
	<header>
		<div class="links">
			<a href="">Reservation</a> <a href="welcome.html">Home</a> <a href="">Flight</a>
			<%
				String username = (String) session.getAttribute("username");
				if(username!=null){
					out.print("<a>Welcome "+username+"</a>");
				} else {
					out.print("<a href=\"login\">Login</a>");
				}
			%>
		</div>
	</header>
	</div>

	<br>
	<div id="ad">
		<h1 id="welcome">WELCOME TO AIRLINE RESERVATION SYSTEM</h1>
		<br>
		<div id="info">
			<p>ABOUT US</p>
			<p>CONTACT US</p>
		</div>
		</span>
	</div>
</body>
</html>