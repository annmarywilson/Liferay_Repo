package net.opentrends.training.employee;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import net.opentrends.training.service.model.Employee;
import net.opentrends.training.service.service.EmployeeLocalServiceUtil;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.DuplicateFileException;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.model.DLFolderConstants;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class EmployeePortlet extends MVCPortlet {

	private static Log _log = LogFactoryUtil.getLog(EmployeePortlet.class
			.getName());
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	String ROOT_FOLDER_NAME = "Employee_Photos";
	String ROOT_FOLDER_DESCRIPTION = "checking file uploading status in db";

	// Adding employee in DB
	public void addEmployee(ActionRequest request, ActionResponse response)
			throws SystemException, IOException, PortalException {
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
		/* Uploading employee documents */
		ThemeDisplay themeDisplay = (ThemeDisplay) request
				.getAttribute(WebKeys.THEME_DISPLAY);
		createFolder(request, themeDisplay);
		long fileEntryId = fileUpload(employee, themeDisplay, request);
		employee.setFileEntryId(fileEntryId);
		EmployeeLocalServiceUtil.addEmployee(employee);
	}

	/* --------------------------------------------------------------------- */
	// Downloading files

	// Creating folder in document and media
	public void createFolder(ActionRequest request, ThemeDisplay themeDisplay) {
		boolean folderExist = isFolderExist(themeDisplay);

		if (!folderExist) {
			long repositoryId = themeDisplay.getScopeGroupId();
			try {
				ServiceContext serviceContext = ServiceContextFactory
						.getInstance(DLFolder.class.getName(), request);
				DLAppServiceUtil.addFolder(repositoryId, PARENT_FOLDER_ID,
						ROOT_FOLDER_NAME, ROOT_FOLDER_DESCRIPTION,
						serviceContext);
			} catch (PortalException e1) {
				_log.error(e1.getMessage());
			} catch (SystemException e1) {
				_log.error(e1.getMessage());
			}
		}
	}

	public boolean isFolderExist(ThemeDisplay themeDisplay) {
		boolean folderExist = false;
		try {
			DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
			folderExist = true;
			_log.error("Folder already exist");
		} catch (Exception e) {
			_log.error(e.getMessage());
		}
		return folderExist;
	}

	public Folder getFolder(ThemeDisplay themeDisplay) {
		Folder folder = null;
		try {
			folder = DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
		} catch (Exception e) {
			_log.error(e.getMessage());
		}
		return folder;
	}

	public long fileUpload(Employee emp, ThemeDisplay themeDisplay,
			ActionRequest actionRequest) throws IOException {
		UploadPortletRequest uploadPortletRequest = PortalUtil
				.getUploadPortletRequest(actionRequest);
		InputStream inputStream = uploadPortletRequest
				.getFileAsStream("fileUpload");
		long fileEntryId = 0;
		if (inputStream != null) {
			String fileName = uploadPortletRequest.getFileName("fileUpload");
			File file = uploadPortletRequest.getFile("fileUpload");
			_log.info("File" + file);
			String mimeType = uploadPortletRequest.getContentType("fileUpload");
			String title = emp.getEmployeeName() + "_" + emp.getEmployeeId();
			String description = "Profile pic of employees";
			long repositoryId = themeDisplay.getScopeGroupId();
			try {
				Folder folder = getFolder(themeDisplay);
				ServiceContext serviceContext = ServiceContextFactory
						.getInstance(DLFileEntry.class.getName(), actionRequest);
				FileEntry entry = DLAppServiceUtil.addFileEntry(repositoryId,
						folder.getFolderId(), fileName, mimeType, title,
						description, "", inputStream, file.length(),
						serviceContext);
				fileEntryId = entry.getFileEntryId();
			} catch (DuplicateFileException e) {
				_log.error(e.getMessage());
			} catch (PortalException ex) {
				_log.error(ex.getMessage());
			} catch (SystemException e) {
				_log.error(e.getMessage());
			}
		}
		return fileEntryId;
	}
	
	public void updateFileUpload(Employee emp, long fileEntryId,
			ThemeDisplay themeDisplay, ActionRequest request)
			throws IOException {
		UploadPortletRequest uploadPortletRequest = PortalUtil
				.getUploadPortletRequest(request);
		InputStream inputStream = uploadPortletRequest
				.getFileAsStream("fileUpload");
		if (inputStream != null) {
			String fileName = uploadPortletRequest.getFileName("fileUpload");
			File file = uploadPortletRequest.getFile("fileUpload");
			String mimeType = uploadPortletRequest.getContentType("fileUpload");
			String title = emp.getEmployeeName() + "_" + emp.getEmployeeId();
			String description = "Updated profilePic of employees";
			try {
				ServiceContext serviceContext = ServiceContextFactory
						.getInstance(DLFileEntry.class.getName(), request);
				FileEntry entry = DLAppServiceUtil.updateFileEntry(fileEntryId,
						fileName, mimeType, title, description, "", true,
						inputStream, file.length(), serviceContext);
				fileEntryId = entry.getFileEntryId();
			} catch (Exception e) {
				_log.error(e.getMessage());
			}
		}
	}

	/*---------------------------------------------------------------------*/
	// Edit employee from DB
	public void editEmployee(ActionRequest request, ActionResponse response)
			throws PortalException, SystemException {
		String strKey = request.getParameter("editKey");
		long empId = Long.valueOf(strKey);
		Employee emp = EmployeeLocalServiceUtil.getEmployee(empId);
		request.setAttribute("editKey", emp);
		response.setRenderParameter("mvcPath", "/html/employee/edit.jsp");
	}
	// Update employee in DB
	public void updateEmployee(ActionRequest request, ActionResponse response)
			throws SystemException, IOException {
		Employee employee = EmployeeLocalServiceUtil.fetchEmployee(ParamUtil
				.getInteger(request, "employeeId"));
		employee.setEmployeeDesignation(ParamUtil.getString(request,
				"employeeName"));
		employee.setEmployeeDesignation(ParamUtil.getString(request,
				"employeeDesignation"));
		employee.setAddress(ParamUtil.getString(request, "address"));
		employee.setEmail(ParamUtil.getString(request, "email"));
		employee.setPhoneNumber(ParamUtil.getString(request, "phoneNumber"));
		long fileEntryId = employee.getFileEntryId();
		ThemeDisplay themeDisplay = (ThemeDisplay) request
				.getAttribute(WebKeys.THEME_DISPLAY);
		if (fileEntryId > 0) {
			// updating files entered
			updateFileUpload(employee, fileEntryId, themeDisplay, request);

		} else {
			// Adding files if there's no files in DB
			createFolder(request, themeDisplay);
			fileEntryId = fileUpload(employee, themeDisplay, request);
			employee.setFileEntryId(fileEntryId);
		}
		EmployeeLocalServiceUtil.updateEmployee(employee);
	}

	// Delete employee from DB
	public void deleteEmployee(ActionRequest request, ActionResponse response)
			throws SystemException, PortalException {
		String stringKey = request.getParameter("deleteKey");
		long employeeId = Long.valueOf(stringKey);
		Employee employee = EmployeeLocalServiceUtil.getEmployee(employeeId);
		EmployeeLocalServiceUtil.deleteEmployee(employeeId);
		if (employee.getFileEntryId() > 0) {
			DLFileEntryLocalServiceUtil.deleteDLFileEntry(employee
					.getFileEntryId());
		}
		response.setRenderParameter("mvcPath", "/html/employee/view.jsp");
	}
}
