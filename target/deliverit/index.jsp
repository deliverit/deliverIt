<html>
<head>
	<link rel="stylesheet" type="text/css" href="css/registerCss.css">
	<script type="text/javascript" src="js/register.js"></script>
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
	 <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#signup_modal">Sign Up</button>
	  <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#signin_modal">Sign In</button>
	 <jsp:include page="signup.jsp"/>
	 <jsp:include page="signin.jsp"/>
	</div>
</body>
</html>