<%@page import="net.opentrends.register.model.Student"%>
<%@page import="net.opentrends.register.service.StudentLocalServiceUtil"%>
<%@ include file="/html/init.jsp"%>
<%
	List<Student> studentList = StudentLocalServiceUtil.getStudents(-1, -1);
%>
<portlet:actionURL name="addStudent" var="addStudentURL" />
<!-- Adding student list -->
<aui:form action="<%=addStudentURL%>" method="post"
	enctype="multipart/form-data">
	<aui:fieldset label="Add Student">
		<aui:layout>
			<aui:column>
				<aui:input name="studentName" type="text" label="Student Name: ">
					<aui:validator name="required"
						errorMessage="Name field is required" />
				</aui:input>
				<aui:select name="studentClass" label="Student Class: "
					inlineLabel="true">
					<aui:option label="--Select Class--" value="" selected="true" />
					<aui:option label="1" value="1" />
					<aui:option label="2" value="2" />
					<aui:option label="3" value="3" />
					<aui:option label="4" value="4" />
				</aui:select>
				<%-- <aui:input name="studentClass" type="text" label="Student Class: ">
				<aui:validator name="required" errorMessage="This field required"/>
				</aui:input> --%>
				<aui:input name="studentEmail" type="text" label="Student Email: ">
				<aui:validator name="required"/>
				<aui:validator name="email"/>
				</aui:input>
				<aui:input name="phoneNumber" type="text" >
				<aui:validator name="required"/>
				<aui:validator name="number"/>
				<aui:validator name="minLength">8</aui:validator>
				<aui:validator name="maxLength">10</aui:validator>
				</aui:input>
				<aui:input type="submit" value="Add" name="" />
			</aui:column>
		</aui:layout>
	</aui:fieldset>
</aui:form>