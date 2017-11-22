package net.opentrends.training.service.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link net.opentrends.training.service.service.http.Employee_portletServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see net.opentrends.training.service.service.http.Employee_portletServiceSoap
 * @generated
 */
public class Employee_portletSoap implements Serializable {
    private long _employeeId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private String _address;
    private String _email;
    private String _phoneNumber;
    private String _password;

    public Employee_portletSoap() {
    }

    public static Employee_portletSoap toSoapModel(Employee_portlet model) {
        Employee_portletSoap soapModel = new Employee_portletSoap();

        soapModel.setEmployeeId(model.getEmployeeId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setAddress(model.getAddress());
        soapModel.setEmail(model.getEmail());
        soapModel.setPhoneNumber(model.getPhoneNumber());
        soapModel.setPassword(model.getPassword());

        return soapModel;
    }

    public static Employee_portletSoap[] toSoapModels(Employee_portlet[] models) {
        Employee_portletSoap[] soapModels = new Employee_portletSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Employee_portletSoap[][] toSoapModels(
        Employee_portlet[][] models) {
        Employee_portletSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Employee_portletSoap[models.length][models[0].length];
        } else {
            soapModels = new Employee_portletSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Employee_portletSoap[] toSoapModels(
        List<Employee_portlet> models) {
        List<Employee_portletSoap> soapModels = new ArrayList<Employee_portletSoap>(models.size());

        for (Employee_portlet model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Employee_portletSoap[soapModels.size()]);
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

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
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

    public String getPassword() {
        return _password;
    }

    public void setPassword(String password) {
        _password = password;
    }
}
