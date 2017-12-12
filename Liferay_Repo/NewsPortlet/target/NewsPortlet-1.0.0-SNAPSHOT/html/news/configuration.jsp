<%@page
	import="com.liferay.portlet.dynamicdatamapping.service.DDMTemplateLocalServiceUtil"%>
<%@page
	import="com.liferay.portlet.dynamicdatamapping.model.DDMTemplate"%>
<%@ include file="/html/news/init.jsp"%>
<%
	PortletPreferences preferences = renderRequest.getPreferences();
	String portletResource = ParamUtil.getString(request, "portletResource");
	if (Validator.isNotNull(portletResource)) {
		preferences = PortletPreferencesFactoryUtil.getPortletSetup(request, portletResource);
	}

	String structureId = preferences.getValue("structureId", StringPool.BLANK);
	List<DDMStructure> ddmStructure = DDMStructureServiceUtil.getStructures(themeDisplay.getScopeGroupId());
	String templateId=preferences.getValue("templateId", StringPool.BLANK);
	List<DDMTemplate> ddmTemplate = null;
	if (!structureId.isEmpty()) {
	 ddmTemplate = DDMTemplateLocalServiceUtil.getTemplates(Long.valueOf(structureId));
	}
	
%>
<liferay-portlet:actionURL var="addConfigurationActionURL"
	portletConfiguration="true">
	<portlet:param name="<%=Constants.CMD%>" value="add" />
</liferay-portlet:actionURL>
<aui:form action="<%=addConfigurationActionURL%>"
	name="addConfiguration" method="post">
	<div>
		<label class="control-label" for="structure">Structure Name</label><br>
		<select name="<portlet:namespace/>structureId">
			<option value=""></option>
			<%
				for (DDMStructure structure : ddmStructure) {
						if (!structureId.isEmpty()) {
							if (structure.getStructureId() == Long.parseLong(structureId)) {
			%>
			<option value="<%=structure.getStructureId()%>" selected="selected"><%=structure.getName()%></option>
			<%
				} else {
			%>
			<option value="<%=structure.getStructureId()%>"><%=structure.getName()%></option>
			<%
				}
						} else {
			%>
			<option value="<%=structure.getStructureId()%>"><%=structure.getName()%></option>
			<%
				}
					}
			%>
		</select>
	</div>
	<div>
		<label class="" for="template">Template Name</label><br> 
		<select
			name="<portlet:namespace/>templateId">
			<option value="" />
			<%
				if(ddmTemplate!=null){
				for (DDMTemplate template : ddmTemplate) {
			%>
			<option value="<%=template.getTemplateId()%>"><%=template.getName()%></option>
			<%}}%>
		</select>
	</div>
	<aui:button type="submit" value="Save"></aui:button>
</aui:form>