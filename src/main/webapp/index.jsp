<html>
<body>
<h1><marquee> Hiii User </marquee></h1>

<form action = "SignUpServlet" method="get" style="background-color:#E6E6FA">
<fieldset>
<legend>        SignUP To My Web-Site      </legend>
Enter Name:<input type="text" name="t1" placeholder="enter name"/><br>
Enter DOB: <input type="date" name="t2" /><br>
Enter Email: <input type="email" name="t3" value="harsh395@gmail.com"/><br>
Enter your city: <select name="t4" multiple>
                 <option value="PUNE">Pune</option>
                 <option value="KOLKATA" selected>Kolkata</option>
                 <option value="Delhi">Delhi</option>
                 <option value="Chennai">Chennai</option>
                 <option value="Banglore">Banglore</option>
                 <option value="Chandigarh">Chandigarh</option>
                 </select><br>
                 
Enter gender: <input type="radio" name="t5" value="male" id="male"/><label for="male">MALE</label>
              <input type="radio" name="t5" value="female"/>FEMALE<br>
Enter Course: <input type="checkbox" name="t6" value="JAVA">JAVA
              <input type="checkbox" name="t6" value="C#">C#
              <input type="checkbox" name="t6" value="JEE">JEE
              <input type="checkbox" name="t6" value="Hibernate">Hibernate
              <br>              
              
              <input type="submit" value="SignUP">
              <input type="reset" value="Reset" />
</fieldset>
</form>
<h3>Already A User : <a href="login.jsp">Login</a></h3>
</body>
</html>
