<%@ include file="Header.jsp" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<form:form modelAttribute="customer" cssClass="form-horizontal">
	
	<div class="form-group">
		<label class="col-md-5 control-label">Name</label>
		<div class="col-md-7">
			<form:input path="name" cssClass="form-control"/>
			<form:errors path="name" cssClass="err" ></form:errors>
		</div>	
	</div>
	
	<div class="form-group">
		<label class="col-md-5 control-label">Email</label>
		<div class="col-md-7">
			<form:input type="email" path="email" cssClass="form-control"/>
			<form:errors path="email" cssClass="err" ></form:errors>
		</div>
	</div>
	
	<div class="form-group">
		<label class="col-md-5 control-label">Phone Number</label>
		<div class="col-md-7">
			<form:input type="tel" path="phone" cssClass="form-control"/>
		</div>
	</div>
	
	<div class="form-group">
		<label class="col-md-5 control-label">Password</label>
		<div class="col-md-7">
			<form:input path="password" cssClass="form-control"/>
			<form:errors path="password" cssClass="err" ></form:errors>
		</div>
	</div>
	
	<div class="form-group">
		<label class="col-md-5 control-label">Address</label>
		<div class="col-md-7">
			<form:input path="address" cssClass="form-control"/>
		</div>
	</div>
	
	<div class="form-group">
		<label class="col-md-5 control-label">City</label>
		<div class="col-md-7">
			<form:input path="city" cssClass="form-control"/>
		</div>
	</div>
	
	<div class="form-group">
		<label class="col-md-5 control-label">State</label>
		<div class="col-md-7">
			<form:input path="state" cssClass="form-control"/>
		</div>
	</div>
	
	<div class="form-group">
		<label class="col-md-5 control-label">Country</label>
		<div class="col-md-7">
			<form:input path="country" cssClass="form-control"/>
		</div>
	</div>
	
	<div class="form-group">
		<label class="col-md-5 control-label"></label>
		<button class="btn btn-primary">Save</button>
	</div>
	
</form:form>

<%@ include file="Footer.jsp" %>