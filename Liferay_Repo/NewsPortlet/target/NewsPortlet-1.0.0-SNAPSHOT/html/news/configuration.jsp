<%@ include file="/html/news/init.jsp"%>
<%
PortletPreferences preferences = renderRequest.getPreferences();
String portletResource = ParamUtil.getString(request, "portletResource");
if (Validator.isNotNull(portletResource)) {
preferences = PortletPreferencesFactoryUtil.getPortletSetup(request, portletResource);
}
String href = preferences.getValue("href",StringPool.BLANK);
String hrefText = preferences.getValue("hrefText",StringPool.BLANK);
String structureKey = preferences.getValue("structureKey",StringPool.BLANK);
List<DDMStructure> ddmStructure=DDMStructureServiceUtil.getStructures(themeDisplay.getScopeGroupId());
%>
<liferay-portlet:actionURL var="addConfigurationActionURL"	portletConfiguration="true">
<portlet:param name="<%=Constants.CMD%>" value="add"/>
</liferay-portlet:actionURL>
<aui:form action="<%=addConfigurationActionURL%>" name="addConfiguration"	method="post">
<div>
<label class="control-label" for="structure">Structure Name</label><br>
			<select name="<portlet:namespace/>structureKey">
			<option value=""></option>
			<%
				for (DDMStructure structure:ddmStructure) {
					if(structure.getStructureKey().equals(structureKey)){
						%>
						<option value="<%=structure.getStructureKey()%>" selected="selected"><%=structure.getName()%></option>
						<%
					}
					else{
						%>
						<option value="<%=structure.getStructureKey()%>"><%=structure.getName()%></option>
						<%
					}
				}
						
			%>
		</select>
</div>
<label class="control-label" for="link">Href</label>
		<liferay-ui:input-localized id="href" name="href" xml='<%=href%>' style="width:100%;"/>
<label class="control-label" for="hrefText">Href Text </label>
	<liferay-ui:input-localized id="hrefText" name="hrefText" xml='<%=hrefText%>' style="width:100%;"/>
		<aui:button type="submit" value="Save"></aui:button>
</aui:form>