<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Page</title>
</head>
<body>



	<div
		style="border-radius: 15px; padding: 20px; width: 400px; box-shadow: 5px 5px 5px 5px green;">

		<h2 align="center">${prod.prodName}</h2>
		<hr>

		<div>

			<table>
				<tr>
					<td style="color: red;">Description:</td>
					<td>${prod.desc}</td>
				</tr>

				<tr>
					<td style="color: red;">Price:</td>
					<td>${prod.price}</td>
				</tr>

				<tr>
					<td style="color: red;">Rating:</td>
					<td style="color: blue;">${prod.rating}/5</td>
				</tr>


				<c:if test="${prod.qtyAvailable > 0}">
					<tr>
						<td style="color: red;">In Stock:</td>
						<td>${prod.qtyAvailable}</td>
					</tr>
					<tr>
						<td><a href="addToCart?prodId=${prod.prodId}">Add to Cart</a></td>
						<td><a href="addToWishList?prodId=${prod.prodId}">Add to
								WishList</a></td>
					</tr>
				</c:if>

				<c:if test="${prod.qtyAvailable == 0}">
					<tr>
						<td style="color: red;">Out of Stock:</td>
					</tr>
					<tr>
						<td><a href="addToCart?prodId=${prod.prodId}">Add to Cart</a></td>

					</tr>
				</c:if>
			</table>

		</div>
		<hr>

	</div>

	<div style="border-radius: 10px; padding: 20px; width: 400px;">
		<h3>Feedback</h3>
		<hr>
		<a:forEach var="fdbk" items="${feedbk}">
			<tr>
				<td>${fdbk.reviews}  Rating: ${fdbk.rating}/5</td><br />
			</tr>
		</a:forEach>
	</div>


	<div style="border-radius: 10px; padding: 20px; width: 400px;">
		<h3>Similiar Products</h3>
		<hr>
		<a:forEach var="product" items="${proname}">
			<tr>
				<td><a href="sendProdId?pId=${product.prodId}">${product.prodName}</a></td>
				<br />

			</tr>
		</a:forEach>
	</div>




</body>
</html>