<%@ include file="/html/init.jsp"%>
<%@ include file="/html/employee/dropdownList.jsp"%>

<%
	/* String strKey = request.getParameter("editKey");
long empId = Long.valueOf(strKey);
Employee editKey = EmployeeLocalServiceUtil.getEmployee(empId);*/
%>
<jsp:useBean id="editKey"
	type="net.opentrends.training.service.model.Employee" scope="request" />
<portlet:actionURL name="updateEmployee" var="updateURL" />
<aui:form action="<%=updateURL.toString()%>" method="post" enctype="multipart/form-data">
	<aui:input name="employeeId" value="<%=editKey.getEmployeeId()%>"
		type="hidden" />
	<aui:input name="employeeName" value="<%=editKey.getEmployeeName()%>" />
	<aui:select name="employeeDesignation" label="Employee Designation:"
		inlineLabel="true">
		<%
			for(String designations:designationList){
		%>
		<aui:option value="<%=designations%>" label="<%=designations%>"
			selected="<%=designations.equalsIgnoreCase(editKey.getEmployeeDesignation())?true:false%>" />
		<%
			}
		%>
	</aui:select>
	<aui:input name="address" value="<%=editKey.getAddress()%>" />
	<aui:input name="email" value="<%=editKey.getEmail()%>" />
	<aui:input name="phoneNumber" value="<%=editKey.getPhoneNumber()%>" />
	<aui:input type="file" name="fileUpload" />
	<aui:input type="hidden" value="<%=editKey.getFileEntryId()%>" name="fileEntryId"/>
	<%
String imageUrl = StringPool.BLANK;
if(editKey.getFileEntryId()>0){
FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(editKey.getFileEntryId());
FileVersion fileVersion = (FileVersion) fileEntry.getLatestFileVersion();
ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
imageUrl = DLUtil.getPreviewURL(fileEntry, fileVersion, themeDisplay, StringPool.BLANK, false, true); 
%>
<img src="<%=imageUrl%>" alt="Employee Photo" height="50" width="50">
<%}%>
	<aui:button type="submit" value="Update" />
	<%
		String redirect = ParamUtil.getString(request, "backURL");
	%>
	<a href="<%=redirect%>"><button>Back</button></a>
	<br />
</aui:form>