<%@ include file="/html/init.jsp"%>
<%
	ResultRow result=(ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Employee employee=(Employee)result.getObject();
	String primaryKey=String.valueOf(employee.getEmployeeId());
%>
<!-- Edit settings -->
<liferay-ui:icon-menu>
	<portlet:actionURL name="editEmployee" var="editURL">
		<portlet:param name="editKey" value="<%=primaryKey%>" />
	</portlet:actionURL>
	<%-- <portlet:renderURL var="editURL">
		<portlet:param name="mvcPath" value="/html/employee/edit.jsp" />
		<portlet:param name="editKey" value="<%=primaryKey%>" />
	</portlet:renderURL>
 --%>
	<!-- Updating edited datas -->
	<liferay-ui:icon image="edit" message="Edit"
		url="<%=editURL.toString()%>" />
	<!-- Delete settings -->
	<portlet:actionURL name="deleteEmployee" var="deleteURL">
		<portlet:param name="deleteKey" value="<%=primaryKey%>" />
	</portlet:actionURL>
	<liferay-ui:icon-delete url="<%=deleteURL.toString()%>" />
</liferay-ui:icon-menu>
