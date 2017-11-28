<%@ include file="/html/init.jsp"%>

<%
	List<Employee> employeeList=EmployeeLocalServiceUtil.getEmployees(-1, -1);
%>
<%=employeeList.size()%>
<portlet:actionURL var="addEmployeeURL" name="addEmployee">
</portlet:actionURL>
<!-- Adding Employee List -->
<aui:form action="<%=addEmployeeURL%>" method="post"
	enctype="multipart/form-data">
	<aui:fieldset label="Add Employee">
		<aui:layout>
			<aui:column>
				<aui:input type="text" name="employeeName" label="Employee Name:"
					inlineLabel="false">
					<aui:validator name="required"
						errorMessage="Name Field is required" />
					<%-- <aui:validator name="alpha"
						errorMessage="Enter characters that exist in the alphabet next time please" /> --%>
				</aui:input>
				<aui:select name="employeeDesignation" label="Employee Designation:"
					inlineLabel="true">
					<aui:option label="--Select Designation--" value="" selected="true" />
					<aui:option label="Librarian" value="Librarian" />
					<aui:option label="Manager" value="Manager" />
					<aui:option label="Accounts Manager" value="Accounts Manager" />
					<aui:option label="Engineer" value="Engineer" />
					<aui:option label="HR" value="HR" />
				</aui:select>
				<aui:input type="text" name="address" label="Address:"
					inlineLabel="false">
					<aui:validator name="required"
						errorMessage="Address Field is required" />
				</aui:input>
				<aui:input type="text" name="email" label="Email:"
					inlineLabel="true">
					<aui:validator name="required" />
					<aui:validator name="email" />
				</aui:input>
				<aui:input type="text" name="phoneNumber" label="Phone Number:"
					inlineLabel="true">
					<aui:validator name="required " />
					<aui:validator name="number" />
					<aui:validator name="minLength">8</aui:validator>
					<aui:validator name="maxLength">10</aui:validator>
				</aui:input>

				<!-- File Upload by employees -->
				<aui:input type="file" name="fileUpload" />

				<aui:input type="submit" value="Add" name="" />

			</aui:column>
		</aui:layout>
	</aui:fieldset>
</aui:form>
<liferay-ui:search-container var="searchContainer" delta="5"
	emptyResultsMessage="no-users-were-found">
	<liferay-ui:search-container-results>
		<%
			results = ListUtil.subList(employeeList, searchContainer.getStart(),searchContainer.getEnd());
															total = employeeList.size();
															pageContext.setAttribute("results", results);
															pageContext.setAttribute("total", total);
		%>
	</liferay-ui:search-container-results>
	<liferay-ui:search-container-row
		className="net.opentrends.training.service.model.Employee"
		keyProperty="employeeId" modelVar="emp">
		<!-- Displaying Employee Data -->

		<liferay-portlet:renderURL varImpl="rowURL">
			<portlet:param name="backURL"
				value="<%=PortalUtil.getCurrentURL(request)%>" />
			<portlet:param name="mvcPath" value="/html/employee/showEmployee.jsp" />
			<portlet:param name="employeeId"
				value="<%=String.valueOf(emp.getEmployeeId())%>" />
		</liferay-portlet:renderURL>
		<liferay-ui:search-container-row-parameter name="rowURL"
			value="<%=rowURL.toString()%>" />
		<liferay-ui:search-container-column-text href="<%=rowURL%>"
			name="Name" value="<%=emp.getEmployeeName()%>">
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text>
<%
String imageUrl = StringPool.BLANK;
if(emp.getFileEntryId()>0){
FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(emp.getFileEntryId());
FileVersion fileVersion = (FileVersion) fileEntry.getLatestFileVersion();
ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
imageUrl = DLUtil.getPreviewURL(fileEntry, fileVersion, themeDisplay, StringPool.BLANK, false, true); 
if(!imageUrl.isEmpty()){
%>
<img src="<%=imageUrl%>" alt="Employee Photo" height="50" width="50">
<%

}
}
%>

</liferay-ui:search-container-column-text>
		
		<liferay-ui:search-container-column-jsp
			path="/html/employee/action.jsp" align="right" />
		<!-- creating button.jsp code -->
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />
</liferay-ui:search-container>

