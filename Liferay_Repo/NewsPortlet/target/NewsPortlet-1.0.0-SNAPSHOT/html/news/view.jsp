<%@ include file="/html/news/init.jsp"%>
<%
PortletPreferences preferences = renderRequest.getPreferences();
String portletResource = ParamUtil.getString(request, "portletResource");
 
if (Validator.isNotNull(portletResource)) {
preferences = PortletPreferencesFactoryUtil.getPortletSetup(request, portletResource);
}
String structureKey = preferences.getValue("structureKey",StringPool.BLANK);
 if(Validator.isNotNull(structureKey)){
List<JournalArticle> articles=JournalArticleLocalServiceUtil.getStructureArticles(themeDisplay.getScopeGroupId(), structureKey);

for(JournalArticle journalArticle:articles){
	if(JournalArticleLocalServiceUtil.isLatestVersion(journalArticle.getGroupId(), journalArticle.getArticleId(), journalArticle.getVersion())){
	
String content = JournalContentUtil.getContent(journalArticle.getGroupId(), journalArticle.getArticleId(), LiferayWindowState.NORMAL.toString(),themeDisplay.getLanguageId() , themeDisplay);
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

