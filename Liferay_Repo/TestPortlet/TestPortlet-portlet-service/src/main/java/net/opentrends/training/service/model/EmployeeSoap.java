package net.opentrends.training.service.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link net.opentrends.training.service.service.http.EmployeeServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see net.opentrends.training.service.service.http.EmployeeServiceSoap
 * @generated
 */
public class EmployeeSoap implements Serializable {
    private long _employeeId;
    private long _groupId;
    private String _employeeName;
    private String _employeeDesignation;
    private String _address;
    private String _email;
    private String _phoneNumber;
    private Long _fileEntryId;

    public EmployeeSoap() {
    }

    public static EmployeeSoap toSoapModel(Employee model) {
        EmployeeSoap soapModel = new EmployeeSoap();

        soapModel.setEmployeeId(model.getEmployeeId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setEmployeeName(model.getEmployeeName());
        soapModel.setEmployeeDesignation(model.getEmployeeDesignation());
        soapModel.setAddress(model.getAddress());
        soapModel.setEmail(model.getEmail());
        soapModel.setPhoneNumber(model.getPhoneNumber());
        soapModel.setFileEntryId(model.getFileEntryId());

        return soapModel;
    }

    public static EmployeeSoap[] toSoapModels(Employee[] models) {
        EmployeeSoap[] soapModels = new EmployeeSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EmployeeSoap[][] toSoapModels(Employee[][] models) {
        EmployeeSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EmployeeSoap[models.length][models[0].length];
        } else {
            soapModels = new EmployeeSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EmployeeSoap[] toSoapModels(List<Employee> models) {
        List<EmployeeSoap> soapModels = new ArrayList<EmployeeSoap>(models.size());

        for (Employee model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EmployeeSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _employeeId;
    }

    public void setPrimaryKey(long pk) {
        setEmployeeId(pk);
    }

    public long getEmployeeId() {
        return _employeeId;
    }

    public void setEmployeeId(long employeeId) {
        _employeeId = employeeId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public String getEmployeeName() {
        return _employeeName;
    }

    public void setEmployeeName(String employeeName) {
        _employeeName = employeeName;
    }

    public String getEmployeeDesignation() {
        return _employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        _employeeDesignation = employeeDesignation;
    }

    public String getAddress() {
        return _address;
    }

    public void setAddress(String address) {
        _address = address;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        _email = email;
    }

    public String getPhoneNumber() {
        return _phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        _phoneNumber = phoneNumber;
    }

    public Long getFileEntryId() {
        return _fileEntryId;
    }

    public void setFileEntryId(Long fileEntryId) {
        _fileEntryId = fileEntryId;
    }
}
