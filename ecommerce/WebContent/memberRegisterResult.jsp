<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="memberFormBean" class="member.MemberForm"></jsp:useBean>
<!--JSP Action Element ... The above Tag creates an object of MemberForm Class with Refrence memberFormBean-->

<jsp:setProperty property="*" name="memberFormBean"/>

<jsp:useBean id="memberBoBean" class="member.MemberBo"></jsp:useBean>

<!-- IN JSP THERE ARE SOME IMPLICITLY AVAILABLE OBJECTS:

				THEY ARE:
				1)request
				2)response
				3)application(ServletContext Objects)
				4)session
				5)out
	 -->

<%
memberBoBean.setContext(application);
String result=memberBoBean.insert(memberFormBean);
out.println(result);

%>

</body>
</html>