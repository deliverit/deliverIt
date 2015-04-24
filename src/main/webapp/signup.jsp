<div class="modal fade" id="signup_modal" role="dialog">
<div class="modal-dialog">
 	<div class="modal-content">
		<div class="modal-header">
		   <button type="button" class="close" data-dismiss="modal">&times;</button>
		    <h4 class="modal-title">Sign Up</h4>
		 </div>
		 <div class="modal-body">
		  	<form action="/deliverit/registerForm" method="post" role="form">
		  	<div class="form-group">
		      <label for="firstName">First Name:</label>
		      <input type="text" class="form-control" name="firstName" id="firstName" placeholder="FirstName">
		    </div>
		    <div class="form-group">
		      <label for="lastName">Last Name:</label>
		      <input type="text" class="form-control" name="lastName" id="lastName" placeholder="Lastname">
		    </div>
		    <div class="form-group">
		      <label for="email">Email:</label>
		      <input type="email" class="form-control" name="email" id="email" placeholder="Enter email">
		    </div>
		    <div class="form-group">
		      <label for="pwd">Password:</label>
		      <input type="password" class="form-control" name="pwd" id="pwd" placeholder="Enter password">
		    </div>
		    <div class="checkbox">
		      <label><input type="checkbox"> Remember me</label>
		    </div>
		    	<button type="submit" class="btn btn-info btn-lg">Submit</button> 
		    	<button type="reset" class="btn btn-info btn-lg"> Reset</button>
		  	</form>
		  </div>
		 </div>
	</div>
</div>


