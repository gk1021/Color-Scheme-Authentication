<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Registration</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
         	
        <style type="text/css">
  body {
	/*background-color: #ffffff;
	margin: 0;*/
	background:url(http://www.businessnewsdaily.com/images/i/000/007/874/original/free-business-plan-templates.jpg);
background-attachment:fixed;
background-size:cover;
    font-family: 'Montserrat', sans-serif;

}

.colorBox {
  width: 18%;
  height:50px;
  float: left;
  margin: 3%;
}

.inputBox{
	width: 15.33%;
	height: 30px;
	margin: 3%;
	font-size: 22px;
}
#container {
	margin: 20px auto;
	max-width: 720px;
}

h1 {
	text-align: center;
	line-height: 1.1;
	font-weight: normal;
  margin: 0;
	text-transform: uppercase;
	padding: 20px 0;
}
  </style>
    </head>
    <body>
    
        <div align="center">
        
  <form  action="s1" method="post">
   <div class="container">
    <h1 class="card-title"><p class="text-info">Regisration Form</p></h1>
    
      <div class="form-row">
        <div class="form-group col-md-6">
          <label for="inputEmail4"><p class="text-light bg-dark">Email</p></label>
          <input type="email" class="form-control" id="inputEmail4" placeholder="Email" name="email">
        </div>
        <div class="form-group col-md-6">
          <label for="inputPassword4"><p class="text-light bg-dark">Password</p></label>
          <input type="password" class="form-control" id="inputPassword4" placeholder="Password" name="password">
        </div>
      </div>
      <div class="form-group">
        <label for="inputAddress"><p class="text-light bg-dark">Address1</p></label>
        <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St" name="add1">
      </div>
      <div class="form-group">
        <label for="inputAddress2"><p class="text-light bg-dark">.Address2</p></label>
        <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor" name="add2">
      </div>
      <div class="form-row">
        <div class="form-group col-md-6">
          <label for="inputCity"><p class="text-light bg-dark">City</p></label>
          <input type="text" class="form-control" id="inputCity" name="city">
        </div>
        <div class="form-group col-md-4">
          <label for="inputState"><p class="text-light bg-dark">State</p></label>
          <select id="inputState" class="form-control" name="state">
            <option selected>Choose...</option>
            <option>Gujarat</option>
            <option>MAHARASTRA</option>
          </select>
        </div>
        <div class="form-group col-md-2">
          <label for="inputZip"><p class="text-light bg-dark">Zip</p></label>
          <input type="text" class="form-control" id="inputZip" name="zip">
        </div>
      </div>
      <div class="form-group">
        <div class="form-check">
          <input class="form-check-input" type="checkbox" id="gridCheck">
          <label class="form-check-label" for="gridCheck">
           <p class="text-light bg-dark">Check me out</p> 
          </label>
        </div>
        </div>
      <table>
          <tr style="height:25px;width:50%">
              <td><input type="text" name="red" id="r" class="cr" style="background:red;height:25px;width:50%"></td>
              <td><input type="text" name="green" id="g" style="background:green;height:25px;width:50% "></td>
              <td><input type="text" name="blue" id="b" style="background:blue;height:25px;width:50%"></td>
              <td><input type="text" name="yellow" id="y" style="background:yellow;height:25px;width:50%"></td>
</tr>
<tr style="height:25px;width:50%">
    <td><input type="text" name="rb1" id="rb" style="height:25px;width:50%"></td>
    <td><input type="text" name="gb1" id="gb" style="height:25px;width:50%"></td>
<td><input type="text" name="bb1" id="bb" style="height:25px;width:50%"></td>
<td><input type="text" name="yb1" id="yb" style="height:25px;width:50%"></td>
</tr>
<br>
      </table><br><br>

    <input type="submit" name="s1" value="submit" class="btn btn-success">

</form>
            </table>
        </div>
    </body>
</html>
