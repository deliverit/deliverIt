<html>
<head>
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<link rel="stylesheet" href="css/main.css">
	 <link href="css/full-slider.css" rel="stylesheet">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	<script src="js/main.js"></script>
	<script src="js/jquery.easing-1.3.js"></script>
	<script src="js/jquery.iosslider.min.js"></script>

</head>
<body>

			<div class="HeadBanner navbar navbar-default navbar-fixed-top">
			<div class="container">
				<div id="header" class="headerClass"></div>
				<ul class="nav nav-pills pull-right">
				    <li><a data-toggle="tab" href="#signinmenu">Sign In</a></li>
				    <li><a data-toggle="tab" href="#signupmenu">Sign Up</a></li>
			  	</ul>
				<div id="logoID" class="logoClass">
					<img src="images/test2.png">
				</div>
				
				<div id="topTabID" class="TopTabClass">
					<jsp:include page="toptabs.jsp"/> 
				</div>
			</div>
			</div>	
				
					
<div class="tab-content">
    <div id="home" class="tab-pane fade in active">
      <jsp:include page="slider.jsp"/>
    </div>
     <div id="signinmenu" class="tab-pane fade">
      <jsp:include page="signin.jsp"/>
    </div>
     <div id="signupmenu" class="tab-pane fade">
       <jsp:include page="signup.jsp"/>
    </div>
    
    <div id="menu1" class="tab-pane fade">
      <h3>Menu 1</h3>
      <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
    </div>
    
    <div id="menu2" class="tab-pane fade">
      <h3>Menu 2</h3>
      <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam.</p>
    </div>
    
    <div id="menu3" class="tab-pane fade">
      <h3>Menu 3</h3>
      <p>Eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.</p>
    </div>
    <div id="menu4" class="tab-pane fade">
      <h3>Menu 3</h3>
      <p>Eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.</p>
    </div>
 </div>
			
				
			<nav class="navbar navbar-inverse navbar-fixed-bottom">
			  <div class="container-fluid">
			    <jsp:include page="footer.jsp"/>
			   </div>
			</nav>
			  
				



</body>
</html>