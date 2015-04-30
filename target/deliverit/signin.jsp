<div class="container">
  <h2>Sign In</h2>
	<form action="/deliverit/loginForm" method="post" role="form">
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