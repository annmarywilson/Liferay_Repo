<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page
	import="net.opentrends.training.service.permission.EmployeePermission"%>
<%@page
	import="com.liferay.portal.security.permission.PermissionChecker"%>
<%@ include file="/html/init.jsp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	ResultRow result = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Employee employee = (Employee) result.getObject();
	String primaryKey = String.valueOf(employee.getEmployeeId());
%>
<!-- Edit settings -->
<liferay-ui:icon-menu>
	<!-- Adding permissions -->
	<c:if
		test='<%=EmployeePermission.contains(permissionChecker, employee.getEmployeeId(), "EDIT")%>'>
		<portlet:actionURL name="editEmployee" var="editURL">
			<portlet:param name="editKey" value="<%=primaryKey%>" />
		</portlet:actionURL>
		<%-- <portlet:renderURL var="editURL">
		<portlet:param name="mvcPath" value="/html/employee/edit.jsp" />
		<portlet:param name="editKey" value="<%=primaryKey%>" />
	</portlet:renderURL> --%>
		<!-- Updating edited datas -->
		<liferay-ui:icon image="edit" message="Edit"
			url="<%=editURL.toString()%>" />
		<!-- Delete settings -->
	</c:if>
	<c:if
		test='<%=EmployeePermission.contains(permissionChecker, employee.getEmployeeId(), "DELETE")%>'>
		<portlet:actionURL name="deleteEmployee" var="deleteURL">
			<portlet:param name="deleteKey" value="<%=primaryKey%>" />
		</portlet:actionURL>
		<liferay-ui:icon-delete url="<%=deleteURL.toString()%>" />
	</c:if>
	<!-- View settings -->
	<portlet:renderURL var="viewURL">
		<portlet:param name="backURL"
			value="<%=PortalUtil.getCurrentURL(request)%>" />
		<portlet:param name="mvcPath" value="/html/employee/showEmployee.jsp" />
		<portlet:param name="employeeId" value="<%=primaryKey%>" />
	</portlet:renderURL>
	<liferay-ui:icon image="view" url="<%=viewURL%>" />
	<%-- <a href="<%=viewURL%>">Click here</a> --%>
</liferay-ui:icon-menu>