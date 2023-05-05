<html>
<body>
<h1><marquee> Hiii User </marquee></h1>

<form action = "SignUpServlet" method="post" style="background-color:#E6E6FA">
<fieldset>
<legend>        SignUP To My Web-Site      </legend>
Enter Name:<input type="text" name="t1" placeholder="enter name"/><br>
Enter DOB: <input type="date" name="t2" /><br>
Enter Email: <input type="email" name="t3" value="harsh395@gmail.com"/><br>
Enter your city: <select name="t4" multiple>
                 <option value="pune">PUNE</option>
                 <option value="kol" selected>Kolkata</option>
                 <option value="mas">Chennai</option>
                 <option value="bang">Banglore</option>
                 </select><br>
                 
Enter gender: <input type="radio" name="t5" value="male" id="male"/><label for="male">MALE</label>
              <input type="radio" name="t5" value="female"/>FEMALE<br>
Enter Course: <input type="checkbox" name="t6" value="JAVA">JAVA
              <input type="checkbox" name="t6" value="JEE">JEE
              <input type="checkbox" name="t6" value="FSD">FSD
              <input type="checkbox" name="t6" value="Angular">Angular
              <br>
              
              <input type="submit" value="SignUP">
              <input type="reset" value="Reset" />
</fieldset>
</form>
<h3>Already A User : <a href="login.jsp">Login</a></h3>
</body>
</html>
