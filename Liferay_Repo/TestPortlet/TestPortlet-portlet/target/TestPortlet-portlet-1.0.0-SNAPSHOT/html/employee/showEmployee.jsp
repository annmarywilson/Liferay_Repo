<%@ include file="/html/init.jsp"%>
<h2>Employee Home page</h2>
<%
	String redirect = ParamUtil.getString(request, "backURL");
	long employeeId = ParamUtil.getLong(request, "employeeId");
	Employee selectEmployeeObj = null;
	if (employeeId > 0) {
		selectEmployeeObj = EmployeeLocalServiceUtil.getEmployee(employeeId);
	}
%>
<a href="<%=redirect%>"><button>Back</button></a>
<br />
<br />
<%
	if (selectEmployeeObj != null) {
%>
<!----------------Profile photo viewing---------------->
<div align="left">
	<%
		// 		String imageUrl = StringPool.BLANK;
			if (selectEmployeeObj.getFileEntryId() > 0) {
				FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(selectEmployeeObj.getFileEntryId());
				String imageUrl = themeDisplay.getPortalURL() + themeDisplay.getPathContext() + "/documents/"
						+ themeDisplay.getScopeGroupId() + "/" + fileEntry.getFolderId() + "/"
						+ fileEntry.getTitle();
				/*FileVersion fileVersion = null;
				 imageUrl = DLUtil.getPreviewURL(fileEntry, fileVersion, themeDisplay, StringPool.BLANK, false,
							true);
					FileVersion fileVersion = (FileVersion) fileEntry.getLatestFileVersion();
					imageUrl = DLUtil.getPreviewURL(fileEntry, fileVersion, themeDisplay, StringPool.BLANK, false,
							true); */
	%>
	<img src="<%=imageUrl%>" alt="Employee Photo" height="200" width="200">
	<%
		}
	%>
</div>
<!-- -------------------------------------------------------------- -->
Employee Name:<%=selectEmployeeObj.getEmployeeName()%><br />
Employee Designation:<%=selectEmployeeObj.getEmployeeDesignation()%><br />
Address:<%=selectEmployeeObj.getAddress()%><br />
Email:<%=selectEmployeeObj.getEmail()%><br />
Phone Number:<%=selectEmployeeObj.getPhoneNumber()%>
<%
	}
%>