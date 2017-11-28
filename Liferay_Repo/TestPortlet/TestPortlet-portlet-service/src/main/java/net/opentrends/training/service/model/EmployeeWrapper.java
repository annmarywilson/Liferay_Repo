package net.opentrends.training.service.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Employee}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Employee
 * @generated
 */
public class EmployeeWrapper implements Employee, ModelWrapper<Employee> {
    private Employee _employee;

    public EmployeeWrapper(Employee employee) {
        _employee = employee;
    }

    @Override
    public Class<?> getModelClass() {
        return Employee.class;
    }

    @Override
    public String getModelClassName() {
        return Employee.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("employeeId", getEmployeeId());
        attributes.put("groupId", getGroupId());
        attributes.put("employeeName", getEmployeeName());
        attributes.put("employeeDesignation", getEmployeeDesignation());
        attributes.put("address", getAddress());
        attributes.put("email", getEmail());
        attributes.put("phoneNumber", getPhoneNumber());
        attributes.put("fileEntryId", getFileEntryId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long employeeId = (Long) attributes.get("employeeId");

        if (employeeId != null) {
            setEmployeeId(employeeId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        String employeeName = (String) attributes.get("employeeName");

        if (employeeName != null) {
            setEmployeeName(employeeName);
        }

        String employeeDesignation = (String) attributes.get(
                "employeeDesignation");

        if (employeeDesignation != null) {
            setEmployeeDesignation(employeeDesignation);
        }

        String address = (String) attributes.get("address");

        if (address != null) {
            setAddress(address);
        }

        String email = (String) attributes.get("email");

        if (email != null) {
            setEmail(email);
        }

        String phoneNumber = (String) attributes.get("phoneNumber");

        if (phoneNumber != null) {
            setPhoneNumber(phoneNumber);
        }

        Long fileEntryId = (Long) attributes.get("fileEntryId");

        if (fileEntryId != null) {
            setFileEntryId(fileEntryId);
        }
    }

    /**
    * Returns the primary key of this employee.
    *
    * @return the primary key of this employee
    */
    @Override
    public long getPrimaryKey() {
        return _employee.getPrimaryKey();
    }

    /**
    * Sets the primary key of this employee.
    *
    * @param primaryKey the primary key of this employee
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _employee.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the employee ID of this employee.
    *
    * @return the employee ID of this employee
    */
    @Override
    public long getEmployeeId() {
        return _employee.getEmployeeId();
    }

    /**
    * Sets the employee ID of this employee.
    *
    * @param employeeId the employee ID of this employee
    */
    @Override
    public void setEmployeeId(long employeeId) {
        _employee.setEmployeeId(employeeId);
    }

    /**
    * Returns the group ID of this employee.
    *
    * @return the group ID of this employee
    */
    @Override
    public long getGroupId() {
        return _employee.getGroupId();
    }

    /**
    * Sets the group ID of this employee.
    *
    * @param groupId the group ID of this employee
    */
    @Override
    public void setGroupId(long groupId) {
        _employee.setGroupId(groupId);
    }

    /**
    * Returns the employee name of this employee.
    *
    * @return the employee name of this employee
    */
    @Override
    public java.lang.String getEmployeeName() {
        return _employee.getEmployeeName();
    }

    /**
    * Sets the employee name of this employee.
    *
    * @param employeeName the employee name of this employee
    */
    @Override
    public void setEmployeeName(java.lang.String employeeName) {
        _employee.setEmployeeName(employeeName);
    }

    /**
    * Returns the employee designation of this employee.
    *
    * @return the employee designation of this employee
    */
    @Override
    public java.lang.String getEmployeeDesignation() {
        return _employee.getEmployeeDesignation();
    }

    /**
    * Sets the employee designation of this employee.
    *
    * @param employeeDesignation the employee designation of this employee
    */
    @Override
    public void setEmployeeDesignation(java.lang.String employeeDesignation) {
        _employee.setEmployeeDesignation(employeeDesignation);
    }

    /**
    * Returns the address of this employee.
    *
    * @return the address of this employee
    */
    @Override
    public java.lang.String getAddress() {
        return _employee.getAddress();
    }

    /**
    * Sets the address of this employee.
    *
    * @param address the address of this employee
    */
    @Override
    public void setAddress(java.lang.String address) {
        _employee.setAddress(address);
    }

    /**
    * Returns the email of this employee.
    *
    * @return the email of this employee
    */
    @Override
    public java.lang.String getEmail() {
        return _employee.getEmail();
    }

    /**
    * Sets the email of this employee.
    *
    * @param email the email of this employee
    */
    @Override
    public void setEmail(java.lang.String email) {
        _employee.setEmail(email);
    }

    /**
    * Returns the phone number of this employee.
    *
    * @return the phone number of this employee
    */
    @Override
    public java.lang.String getPhoneNumber() {
        return _employee.getPhoneNumber();
    }

    /**
    * Sets the phone number of this employee.
    *
    * @param phoneNumber the phone number of this employee
    */
    @Override
    public void setPhoneNumber(java.lang.String phoneNumber) {
        _employee.setPhoneNumber(phoneNumber);
    }

    /**
    * Returns the file entry ID of this employee.
    *
    * @return the file entry ID of this employee
    */
    @Override
    public java.lang.Long getFileEntryId() {
        return _employee.getFileEntryId();
    }

    /**
    * Sets the file entry ID of this employee.
    *
    * @param fileEntryId the file entry ID of this employee
    */
    @Override
    public void setFileEntryId(java.lang.Long fileEntryId) {
        _employee.setFileEntryId(fileEntryId);
    }

    @Override
    public boolean isNew() {
        return _employee.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _employee.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _employee.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _employee.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _employee.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _employee.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _employee.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _employee.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _employee.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _employee.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _employee.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EmployeeWrapper((Employee) _employee.clone());
    }

    @Override
    public int compareTo(
        net.opentrends.training.service.model.Employee employee) {
        return _employee.compareTo(employee);
    }

    @Override
    public int hashCode() {
        return _employee.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<net.opentrends.training.service.model.Employee> toCacheModel() {
        return _employee.toCacheModel();
    }

    @Override
    public net.opentrends.training.service.model.Employee toEscapedModel() {
        return new EmployeeWrapper(_employee.toEscapedModel());
    }

    @Override
    public net.opentrends.training.service.model.Employee toUnescapedModel() {
        return new EmployeeWrapper(_employee.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _employee.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _employee.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _employee.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EmployeeWrapper)) {
            return false;
        }

        EmployeeWrapper employeeWrapper = (EmployeeWrapper) obj;

        if (Validator.equals(_employee, employeeWrapper._employee)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Employee getWrappedEmployee() {
        return _employee;
    }

    @Override
    public Employee getWrappedModel() {
        return _employee;
    }

    @Override
    public void resetOriginalValues() {
        _employee.resetOriginalValues();
    }
}
