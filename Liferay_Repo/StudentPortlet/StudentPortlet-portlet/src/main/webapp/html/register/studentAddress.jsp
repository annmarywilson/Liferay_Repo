<%@ include file="/html/init.jsp"%>

<portlet:actionURL name="addAddress" var="addAddressURL" />
<!-- Adding student address -->
<aui:form action="<%=addAddressURL%>" method="post"
	enctype="multipart/form-data">
	<aui:fieldset label="Add Student Address">
		<aui:layout>
			<aui:column>
				<aui:input name="studentId" type="hidden" />

				<aui:input name="parentAddress" type="textarea" rows="5" cols="30"
					label="Parent Address: ">
					<aui:validator name="required"
						errorMessage="Name field is required" />
				</aui:input>
				<aui:select name="parentState" label="Parent State:"
					inlineLabel="true">
					<aui:option label="--Select Class--" value="" selected="true" />
					<aui:option label="Kerala" value="Kerala" />
				</aui:select>
				<aui:select name="parentDistrict" label="Parent District:"
					inlineLabel="true">
					<aui:option label="--Select Class--" value="" selected="true" />
					<aui:option label="Thrissur" value="thrissur" />
					<aui:option label="Kochi" value="kochi" />
					<aui:option label="Calicut" value="calicut" />
					<aui:option label="Kannur" value="kannur" />
					<aui:option label="Kollam" value="kollam" />
				</aui:select>
				<aui:input name="parentPin" type="text" label="Parent Pincode: ">
					<aui:validator name="required" />
					<aui:validator name="minLength">6</aui:validator>
				</aui:input>
				<aui:input name="parentPhone" type="text"
					label="Parent Phone Number: ">
					<aui:validator name="required" />
					<aui:validator name="number" />
					<aui:validator name="minLength">8</aui:validator>
					<aui:validator name="maxLength">10</aui:validator>
				</aui:input>
				<aui:input name="parentMail" type="text" label="Parent Email: ">
					<aui:validator name="required" />
					<aui:validator name="email" />
				</aui:input>
				<aui:input type="submit" value="Add" name="" />
			</aui:column>
		</aui:layout>
	</aui:fieldset>
</aui:form>