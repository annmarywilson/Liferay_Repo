package net.opentrends.training.employee;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import net.opentrends.training.service.model.Employee;
import net.opentrends.training.service.service.EmployeeLocalServiceUtil;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class EmployeePortlet extends MVCPortlet {
	// Adding employee in DB
	public void addEmployee(ActionRequest request, ActionResponse response)
			throws SystemException {
		long employeeId = CounterLocalServiceUtil.increment(Employee.class
				.getName());
		Employee employee = null;
		employee = EmployeeLocalServiceUtil.createEmployee(employeeId);
		employee.setEmployeeName(ParamUtil.getString(request, "employeeName"));
		employee.setEmployeeDesignation(ParamUtil.getString(request,
				"employeeDesignation"));
		employee.setAddress(ParamUtil.getString(request, "address"));
		employee.setEmail(ParamUtil.getString(request, "email"));
		employee.setPhoneNumber(ParamUtil.getString(request, "phoneNumber"));
		EmployeeLocalServiceUtil.addEmployee(employee);
	}

	// Edit employee from DB
	public void editEmployee(ActionRequest request, ActionResponse response)
			throws PortalException, SystemException {
		String strKey = request.getParameter("editKey");
		long empId = Long.valueOf(strKey);
		Employee emp = EmployeeLocalServiceUtil.getEmployee(empId);
		request.setAttribute("editKey", emp);
		response.setRenderParameter("mvcPath", "/html/employee/edit.jsp");
	}

	// Delete employee from DB
	public void deleteEmployee(ActionRequest request, ActionResponse response)
			throws SystemException, PortalException {
		String stringKey = request.getParameter("deleteKey");
		long stringLong = Long.valueOf(stringKey);
		EmployeeLocalServiceUtil.deleteEmployee(stringLong);
		response.setRenderParameter("mvcPath", "/html/employee/view.jsp");
	}

	// Update employee in DB
	public void updateEmployee(ActionRequest request, ActionResponse response)
			throws SystemException {
		Employee employee = EmployeeLocalServiceUtil.fetchEmployee(ParamUtil
				.getInteger(request, "employeeId"));
		employee.setEmployeeDesignation(ParamUtil.getString(request,
				"employeeName"));
		employee.setEmployeeDesignation(ParamUtil.getString(request,
				"employeeDesignation"));
		employee.setAddress(ParamUtil.getString(request, "address"));
		employee.setEmail(ParamUtil.getString(request, "email"));
		employee.setPhoneNumber(ParamUtil.getString(request, "phoneNumber"));
		EmployeeLocalServiceUtil.updateEmployee(employee);
		
	}
}
