
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
  <style>
  body{
  margin: 0;
  padding: 0;
  font-family:'Coiny',cursive;
  background: #34495e;
}
.container{
  width:300px;
  padding: 40px;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%,-50%);
  background: #191919;
  text-align: center;
  border-radius: 5px;
  box-shadow: 0 50px 50px;
}
.container h1{
  color: white;
  font-weight: 500;

}
.container input[type="text"],.container input[type="password"]{
  border: 0;
  background: none;
  display: block;
  margin: 20px auto;
  text-align: center;
  border: 2px solid #3498db;
  padding: 14px 10px;
  width: 200px;
  outline: none;
  color: white;
  font-size: 16px;
  border-radius: 24px;
  transition: 0.25s;
}
.container input[type="text"]:focus,.container input[type="password"]:focus{
  width: 280px;
  border-color: #2ecc71;
}
.container input[type="submit"]{
  border: 0;
  background: none;
  display: block;
  margin: 20px auto;
  text-align: center;
  border: 2px solid #2ecc71;
  padding: 14px 25px;
  outline: none;
  color: white;
  border-radius: 24px;
  transition: 0.25s;
  font-size: 17px;
  font-family: 'Monospace', serif;
}
.container input[type="submit"]:hover{
  background: #2ecc71;
}
  </style>
  
    <meta charset="utf-8">
    <title>Login Form</title>
    <link rel="stylesheet" href="Login Form.css">
    <link href="https://fonts.googleapis.com/css?family=Coiny" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Libre+Baskerville" rel="stylesheet">
  </head>
  <body>
    <form class="container" action="" method="post">
      <h1>STARK SHIPMENT SERVICE</h1>
      <h1>LOGIN</h1>
      <input type="text" name="email" placeholder="Email">
      <input type="password" name="password" placeholder="Password">
      <input type="submit" value="Login">
       <a href="http://localhost:9090/StarkShipmentService/user/register">New Registration</a>
       <h5 style="font-family: 'Monospace', serif ;color: red;">${requestScope.message}</h5>
    </form>
  </body>
</html>