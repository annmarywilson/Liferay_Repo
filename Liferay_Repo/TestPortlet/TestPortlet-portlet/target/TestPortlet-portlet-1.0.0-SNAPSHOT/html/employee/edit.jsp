<%@ include file="/html/init.jsp"%>
<%
	/* String strKey = request.getParameter("editKey");
long empId = Long.valueOf(strKey);
Employee editKey = EmployeeLocalServiceUtil.getEmployee(empId); */
%>
<jsp:useBean id="editKey"
	type="net.opentrends.training.service.model.Employee" scope="request" />
<portlet:actionURL name="updateEmployee" var="updateURL" />
<aui:form action="<%=updateURL.toString()%>" method="post">
	<aui:input name="employeeId" value="<%=editKey.getEmployeeId()%>"
		type="hidden" />
	<aui:input name="employeeName" value="<%=editKey.getEmployeeName()%>" />
	<aui:select name="employeeDesignation" label="Employee Designation:"
		inlineLabel="true">
		<aui:option label="<%=editKey.getEmployeeDesignation()%>"
			value="<%=editKey.getEmployeeDesignation()%>" selected="true" />
		<aui:option label="Librarian"
			value="<%=editKey.getEmployeeDesignation()%>" selected="true" />
		<aui:option label="Manager"
			value="<%=editKey.getEmployeeDesignation()%>" />
		<aui:option label="Accounts Manager"
			value="<%=editKey.getEmployeeDesignation()%>" />
		<aui:option label="Engineer"
			value="<%=editKey.getEmployeeDesignation()%>" />
		<aui:option label="HR" value="HR" />
	</aui:select>
	<aui:input name="address" value="<%=editKey.getAddress()%>" />
	<aui:input name="email" value="<%=editKey.getEmail()%>" />
	<aui:input name="phoneNumber" value="<%=editKey.getPhoneNumber()%>" />
	<aui:button type="submit" value="Update" />
</aui:form>