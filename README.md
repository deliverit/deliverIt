# deliverIt

Download the file and add it in eclipse.

For Maven run
Click Run -> Run Configuration -> Maven Build -> new 
  Name : (Give a valid name)
  Base Directory : ${workspace_loc:/deliverit} (select the loctaion of the project)
  Goals : clean package
  enable skip test
  click Apply.

For Tomact Run
Click Run -> Run Configuration -> Maven Build -> new 
  Name : (Give a valid name)
  Base Directory : ${workspace_loc:/deliverit} (select the loctaion of the project)
  Goals : tomcat:run
  enable skip test
  click Apply.
  


  
