<%@page import="com.liferay.portlet.dynamicdatamapping.service.DDMTemplateLocalServiceUtil"%>
<%@page import="com.liferay.portlet.dynamicdatamapping.model.DDMTemplate"%>
<%@page import="com.liferay.portlet.dynamicdatamapping.service.DDMStructureLocalServiceUtil"%>
<%@ include file="/html/news/init.jsp"%>
<%
PortletPreferences preferences = renderRequest.getPreferences();
String portletResource = ParamUtil.getString(request, "portletResource");
if (Validator.isNotNull(portletResource)) {
preferences = PortletPreferencesFactoryUtil.getPortletSetup(request, portletResource);
}
String structureId = preferences.getValue("structureId",StringPool.BLANK);
String templateId=preferences.getValue("templateId", StringPool.BLANK);
 if(Validator.isNotNull(structureId) && Validator.isNotNull(templateId)){
DDMStructure ddmStructure=DDMStructureLocalServiceUtil.getStructure(Long.parseLong(structureId));
DDMTemplate ddmTemplate=DDMTemplateLocalServiceUtil.getDDMTemplate(Long.parseLong(templateId));
//List<JournalArticle> articles=JournalArticleLocalServiceUtil.getStructureArticles(themeDisplay.getScopeGroupId(), ddmStructure.getStructureKey());
List<JournalArticle> articles=JournalArticleLocalServiceUtil.getStructureArticles (themeDisplay.getScopeGroupId(), ddmStructure.getStructureKey());
for(JournalArticle journalArticle:articles){
	if(JournalArticleLocalServiceUtil.isLatestVersion(journalArticle.getGroupId(), journalArticle.getArticleId(), journalArticle.getVersion())){
//String content = JournalContentUtil.getContent(journalArticle.getGroupId(), journalArticle.getArticleId(), LiferayWindowState.NORMAL.toString(),themeDisplay.getLanguageId() , themeDisplay);
String content = JournalContentUtil.getContent(journalArticle.getGroupId(), journalArticle.getArticleId(), ddmTemplate.getTemplateKey(), LiferayWindowState.NORMAL.toString(),themeDisplay.getLanguageId() , themeDisplay);
%>
<%=content %>
<%	
	}
}
 }
 else{
	 %>
	 <div class="alert alert-info"> Please contact site admin to configure structure </div>
	 <%
 }
%>


