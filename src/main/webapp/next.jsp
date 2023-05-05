<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><font color="blue">Welcome to cyber success</font></h1>
<img src="https://thumbs.gfycat.com/UnfoldedCautiousAnemone-max-1mb.gif"></img>
<%
Cookie[] cookies= request.getCookies();
for(int i=0;i<cookies.length;i++){
	 
	out.println(cookies[i].getName()+" "+cookies[i].getValue());
	
}
%>
<h2>Click here to fetch Data:</h2>
<a href="view.jsp"> Fetch </a>
</body>
</html>