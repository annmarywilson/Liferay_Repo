
<%@ include file="/html/init.jsp" %>

 

<%


List<Employee> employeeList=EmployeeLocalServiceUtil.getEmployees(-1, -1);

%>
<%=employeeList.size() %>
<portlet:actionURL var="addEmployeeURL" name="addEmployee">
</portlet:actionURL>
<!-- Adding Employee List -->
<aui:form action="<%=addEmployeeURL%>" method="post">
	<aui:fieldset label="Add Employee">
		<aui:layout>
			<aui:column>
				<aui:input type="text" name="employeeName" label="Employee Name:"
					inlineLabel="true" />
				<aui:select name="employeeDesignation" label="Employee Designation:"
					inlineLabel="true">
					<aui:option label="--Select Designation--" value="Librarian" selected="true"/>
					<aui:option label="Librarian" value="Librarian"/>
					<aui:option label="Manager" value="Manager"/>
					<aui:option label="Accounts Manager" value="Accounts Manager"/>
					<aui:option label="Engineer" value="Engineer"/>
					<aui:option label="HR" value="HR"/>
				</aui:select>
				<aui:input type="text" name="address" label="Address:"
					inlineLabel="true" />
				<aui:input type="text" name="email" label="Email:"
					inlineLabel="true" />
				<aui:input type="text" name="phoneNumber" label="Phone Number:"
					inlineLabel="true" />
				<aui:input type="submit" value="Add" name="" />
			</aui:column>
		</aui:layout>
	</aui:fieldset>
</aui:form>

<liferay-ui:icon-menu>


	<liferay-ui:search-container delta="5"
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
			<liferay-ui:search-container-column-text name="name" value="<%=emp.getEmployeeName()%>" />
			<liferay-ui:search-container-column-jsp path="/html/employee/action.jsp" align="right"/>
			<!-- creating button.jsp code -->
			
			
		</liferay-ui:search-container-row>
		<liferay-ui:search-iterator />
	</liferay-ui:search-container>

</liferay-ui:icon-menu>


			
			
			
