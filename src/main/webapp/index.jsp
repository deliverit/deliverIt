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
	<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDnycWatbGyK6ldFqErjFtko1yeMclNUOA&amp;sensor=true"></script>

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
					<a href="#home"><img src="images/test2.png"></a>
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
    
    <div id="aboutus" class="tab-pane fade">
      <jsp:include page="aboutus.jsp"/>
    </div>
    
    <div id="services" class="tab-pane fade">
   		<jsp:include page="service.jsp"/>
    </div>
    <div id="team" class="tab-pane fade">
   		<jsp:include page="team.jsp"/>
    </div>
    <div id="gallery" class="tab-pane fade">
     	<jsp:include page="imagegallery.jsp"/>
    </div>
    <div id="contactus" class="tab-pane fade">
     	 <jsp:include page="contactus.jsp"/>
    </div>
 </div>
			
				
			<nav class="navbar navbar-default  navbar-fixed-bottom" role="navigation">
    <div class="container text-center">
    <p>
    	<a href="">About us </a> | 
    	<a href=""> Quality Policy </a> | 
    	<a href=""> Admin Login  </a> |
    	<a href=""> Enquiry  </a> 
    </p>
    <p class="navbar-text col-md-12 col-sm-12 col-xs-12">
        
        Copyright &copy; sukanyaMani autocraft</p>
    </div>
</nav>
				



</body>
</html>