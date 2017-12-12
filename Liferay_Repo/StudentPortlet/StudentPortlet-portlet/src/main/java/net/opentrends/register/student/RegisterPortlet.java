package net.opentrends.register.student;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import net.opentrends.register.model.Address;
import net.opentrends.register.model.Student;
import net.opentrends.register.service.AddressLocalServiceUtil;
import net.opentrends.register.service.StudentLocalServiceUtil;

public class RegisterPortlet extends MVCPortlet {
	// Adding students in school DB
	public void addStudent(ActionRequest request, ActionResponse response) throws SystemException {
		long studentId = CounterLocalServiceUtil.increment(Student.class.getName());
		Student student = null;
		student = StudentLocalServiceUtil.createStudent(studentId);
		student.setStudentName(ParamUtil.getString(request, "studentName"));
		student.setStudentClass(ParamUtil.getString(request, "studentClass"));
		student.setStudentEmail(ParamUtil.getString(request, "studentEmail"));
		student.setPhoneNumber(ParamUtil.getString(request, "phoneNumber"));
		request.setAttribute("studentId", studentId);
		StudentLocalServiceUtil.addStudent(student);
		request.setAttribute("tab", "Student Regsiter");

	}

	// Adding student's parent address
	public void addParentAddress(ActionRequest request, ActionResponse response) throws SystemException {
		long addressId = CounterLocalServiceUtil.increment(Address.class.getName());
		Address address = null;
		address = AddressLocalServiceUtil.createAddress(addressId);
		request.getAttribute("studentId");
		address.setParentAddress(ParamUtil.getString(request, "parentAddress"));
		address.setParentState(ParamUtil.getString(request, "parentState"));
		address.setParentDistrict(ParamUtil.getString(request, "parentDistrict"));
		address.setParentPin(ParamUtil.getString(request, "parentPin"));
		address.setParentPhone(ParamUtil.getString(request, "parentPhone"));
		address.setParentMail(ParamUtil.getString(request, "parentMail"));
		AddressLocalServiceUtil.addAddress(address);
		request.setAttribute("tab", "Student Regsiter");
	}

	/*
	  public void studentRegister(ActionRequest request, ActionResponse
	  response) throws IOException, PortletException { String studentRegister =
	  ParamUtil.getString(request, "studentRegister");
	  System.out.println(studentRegister); request.setAttribute("tab",
	  "Student Regsiter"); }
	  
	  public void studentAddress(ActionRequest request, ActionResponse
	  response) throws IOException, PortletException { String studentAddress =
	  ParamUtil.getString(request, "studentAddress");
	  System.out.println(studentAddress); request.setAttribute("tab",
	  "Student Address"); }
	 */
}
