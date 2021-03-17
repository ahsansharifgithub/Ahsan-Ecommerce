<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>Product Upload</h1>
	<form action="productUploadResult.jsp" method="post" enctype="multipart/form-data">
		<table class="table table-hover table-bordered ">
			<tr>
				<td>Category:</td>
				<td><select name="catid">
						<option value="toy">Toy</option>
						<option value="book">Book</option>
				</select></td>
			</tr>
			<tr>
				<td>SubCategory:</td>
				<td><select name="subcatid">
						<option value="chess">Chess</option>
						<option value="novel">Novel</option>
				</select></td>

			</tr>

			<tr>
				<td>Title:</td>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><input type="text" name="price"></td>

			</tr>
			<tr>
				<td>Description</td>
				<td><textarea rows="50" cols="40" name="description"></textarea></td>
			</tr>

			<tr>
				<td>Picture1:</td>
				<td><input type="file" name="picture1"></td>
			</tr>

			<tr>
				<td>Picture2:</td>
				<td><input type="file" name="picture2"></td>
			</tr>



			<tr>
				<td></td>
				<td><input type=submit value="Upload"></td>
			</tr>

		</table>


	</form>
</body>
</html>