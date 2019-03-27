<%@ include file="Header.jsp" %>

<c:forEach items="${products}" var="p">
	<div class="col-md-3">
		<img src="/images/products/${p.picture}" class="img img-responsive"/>
		
		<p class="lead">${p.description}</p>
		<p>${p.quantityPerUnit} <br>Rs. ${p.unitPrice}</p>
	</div>
</c:forEach>


<%@ include file="Footer.jsp" %>
