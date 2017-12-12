<%@page import="javax.portlet.PortletURL"%>
<%@ include file="/html/init.jsp"%>
<%-- <portlet:renderURL var="tabURL" />--%>
<%
String tabs1=ParamUtil.getString(request, "tabs1","Student Regsiter");
PortletURL tabURL = renderResponse.createRenderURL();
tabURL.setParameter("tabs1", tabs1);
%>
<liferay-ui:tabs
	names="Student Regsiter,Student Address"
	refresh="false" url="<%=tabURL.toString()%>">
	<c:if test='<%=tabs1.equals("Student Regsiter")%>'>
		<jsp:include page="/html/register/studentRegister.jsp" flush="true" />
	</c:if>
	<c:if test='<%=tabs1.equals("Student Address")%>'>
		<jsp:include page="/html/register/studentAddress.jsp" flush="true" />
	</c:if>
	
	<%-- <liferay-ui:section>
		<%@ include file="/html/register/studentRegister.jsp"%>
	</liferay-ui:section>
	<liferay-ui:section>
		<%@ include file="/html/register/studentAddress.jsp"%>
	</liferay-ui:section>--%>
</liferay-ui:tabs>