<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.bridgelabz.model.UserInformation" %>
<!DOCTYPE html>
<html>
<head>
<style >

.login { 
    position: absolute;
    top: 50%;
    left: 50%;
    margin: -150px 0 0 -150px;
    width:300px;
    height:300px;
}
.login h1 { color: #fff; text-shadow: 0 0 10px rgba(0,0,0,0.3); letter-spacing:1px; text-align:center; }

input { 
    width: 100%; 
    margin-bottom: 10px; 
    background: rgba(0,0,0,0.3);
    border: medium;
    outline: none;
    padding: 10px;
    font-size: 13px;
    color: #fff;
    text-shadow: 1px 1px 1px rgba(0,0,0,0.3);
    border: 1px solid rgba(0,0,0,0.3);
    border-radius: 4px;
    box-shadow: inset 0 -5px 45px rgba(100,100,100,0.2), 0 1px 1px rgba(255,255,255,0.2);
    -webkit-transition: box-shadow .5s ease;
    -moz-transition: box-shadow .5s ease;
    -o-transition: box-shadow .5s ease;
    -ms-transition: box-shadow .5s ease;
    transition: box-shadow .5s ease;
}

body { 
    width: 100%;
    height:100%;
    font-family: 'Open Sans', sans-serif;
    background: #092756;
    background: -moz-radial-gradient(0% 100%, ellipse cover, rgba(104,128,138,.4) 10%,rgba(138,114,76,0) 40%),-moz-linear-gradient(top,  rgba(57,173,219,.25) 0%, rgba(42,60,87,.4) 100%), -moz-linear-gradient(-45deg,  #670d10 0%, #092756 100%);
    background: -webkit-radial-gradient(0% 100%, ellipse cover, rgba(104,128,138,.4) 10%,rgba(138,114,76,0) 40%), -webkit-linear-gradient(top,  rgba(57,173,219,.25) 0%,rgba(42,60,87,.4) 100%), -webkit-linear-gradient(-45deg,  #670d10 0%,#092756 100%);
    background: -o-radial-gradient(0% 100%, ellipse cover, rgba(104,128,138,.4) 10%,rgba(138,114,76,0) 40%), -o-linear-gradient(top,  rgba(57,173,219,.25) 0%,rgba(42,60,87,.4) 100%), -o-linear-gradient(-45deg,  #670d10 0%,#092756 100%);
    background: -ms-radial-gradient(0% 100%, ellipse cover, rgba(104,128,138,.4) 10%,rgba(138,114,76,0) 40%), -ms-linear-gradient(top,  rgba(57,173,219,.25) 0%,rgba(42,60,87,.4) 100%), -ms-linear-gradient(-45deg,  #670d10 0%,#092756 100%);
    background: -webkit-radial-gradient(0% 100%, ellipse cover, rgba(104,128,138,.4) 10%,rgba(138,114,76,0) 40%), linear-gradient(to bottom,  rgba(57,173,219,.25) 0%,rgba(42,60,87,.4) 100%), linear-gradient(135deg,  #670d10 0%,#092756 100%);
    filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#3E1D6D', endColorstr='#092756',GradientType=1 );
     image:url("/home/admin1/Downloads/215782538a44bc3.jpg");

}


</style>







<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>User Details</title>
</head>
<body>
<div class="login">
<% 
UserInformation userinform=(UserInformation)session.getAttribute("UserInformation");
%>
<h3> User Details </h3>
<div>
<b>FirstName=</b><%=userinform.getFirstname()%>
</div>
<div>
<br>
<b>LastName=</b><%=userinform.getLastName() %><br></div>
<div>
<br>
<b>EmailID=</b><%=userinform.getEmailId() %><br></div>
<div>
<br>
<b>Password=</b><%=userinform.getPassword()%><br></div>
<div>
<br>
<b>MobileNo=</b><%=userinform.getMobileNo() %><br></div>

<div>
<br>
<b>Gender=</b><%=userinform.getGender() %><br></div>

 <form action="<%=response.encodeURL("edit.jsp") %>" method="post">
<input type="submit"  value="edit" > 
</form> 
 <form action="<%=response.encodeURL("session.jsp") %>" method="post">
<input type="submit"  value="back" > 
</form> 
<!-- <a href="edit.jsp">Edit Details</a> -->
</div>
</body>
</html>