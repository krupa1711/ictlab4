<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="FeedbackServlet">
	Name:
    <input type="text" id="name" name="name" placeholder="Your name..">
	<br><br>
	Enroll IIII:
    <input type="text" id="enrolment" name="enrolment" placeholder="Your enrollment number..">
	<br><br>
	Branch:
    <select id="branch" name="branch">
      <option value="CBA">CBA</option>
      <option value="BDA">BDA</option>
      <option value="MA">MA</option>
    </select>
	<br><br>
	Feedback:
    <textarea id="feedback" name="feedback" placeholder="Write something.." style="height:150px"></textarea>
	<br><br>
    <input type="submit" value="Submit Feedback">

  </form>
</center>

</body>
</html>