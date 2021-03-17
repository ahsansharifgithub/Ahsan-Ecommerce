<%@page import="product.ProductDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:useBean id="productBoBean" class="product.ProductBo"></jsp:useBean>
<%
productBoBean.setContext(application);
ArrayList<ProductDto> ar= productBoBean.searchByKey(request.getParameter("searchKey"));
out.println(ar);
%>

<table class="table table-hover table-bordered">

<%for(ProductDto pdto:ar)
{%>
<tr><td><%=pdto.getTitle() %></td><td><%=pdto.getPrice() %></td></tr>
<%} %>
</table>
</body>
</html>