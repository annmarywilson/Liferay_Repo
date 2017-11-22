package net.opentrends.training.service.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Employee_portlet}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Employee_portlet
 * @generated
 */
public class Employee_portletWrapper implements Employee_portlet,
    ModelWrapper<Employee_portlet> {
    private Employee_portlet _employee_portlet;

    public Employee_portletWrapper(Employee_portlet employee_portlet) {
        _employee_portlet = employee_portlet;
    }

    @Override
    public Class<?> getModelClass() {
        return Employee_portlet.class;
    }

    @Override
    public String getModelClassName() {
        return Employee_portlet.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("employeeId", getEmployeeId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("address", getAddress());
        attributes.put("email", getEmail());
        attributes.put("phoneNumber", getPhoneNumber());
        attributes.put("password", getPassword());

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

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
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

        String password = (String) attributes.get("password");

        if (password != null) {
            setPassword(password);
        }
    }

    /**
    * Returns the primary key of this employee_portlet.
    *
    * @return the primary key of this employee_portlet
    */
    @Override
    public long getPrimaryKey() {
        return _employee_portlet.getPrimaryKey();
    }

    /**
    * Sets the primary key of this employee_portlet.
    *
    * @param primaryKey the primary key of this employee_portlet
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _employee_portlet.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the employee ID of this employee_portlet.
    *
    * @return the employee ID of this employee_portlet
    */
    @Override
    public long getEmployeeId() {
        return _employee_portlet.getEmployeeId();
    }

    /**
    * Sets the employee ID of this employee_portlet.
    *
    * @param employeeId the employee ID of this employee_portlet
    */
    @Override
    public void setEmployeeId(long employeeId) {
        _employee_portlet.setEmployeeId(employeeId);
    }

    /**
    * Returns the group ID of this employee_portlet.
    *
    * @return the group ID of this employee_portlet
    */
    @Override
    public long getGroupId() {
        return _employee_portlet.getGroupId();
    }

    /**
    * Sets the group ID of this employee_portlet.
    *
    * @param groupId the group ID of this employee_portlet
    */
    @Override
    public void setGroupId(long groupId) {
        _employee_portlet.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this employee_portlet.
    *
    * @return the company ID of this employee_portlet
    */
    @Override
    public long getCompanyId() {
        return _employee_portlet.getCompanyId();
    }

    /**
    * Sets the company ID of this employee_portlet.
    *
    * @param companyId the company ID of this employee_portlet
    */
    @Override
    public void setCompanyId(long companyId) {
        _employee_portlet.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this employee_portlet.
    *
    * @return the user ID of this employee_portlet
    */
    @Override
    public long getUserId() {
        return _employee_portlet.getUserId();
    }

    /**
    * Sets the user ID of this employee_portlet.
    *
    * @param userId the user ID of this employee_portlet
    */
    @Override
    public void setUserId(long userId) {
        _employee_portlet.setUserId(userId);
    }

    /**
    * Returns the user uuid of this employee_portlet.
    *
    * @return the user uuid of this employee_portlet
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employee_portlet.getUserUuid();
    }

    /**
    * Sets the user uuid of this employee_portlet.
    *
    * @param userUuid the user uuid of this employee_portlet
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _employee_portlet.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this employee_portlet.
    *
    * @return the user name of this employee_portlet
    */
    @Override
    public java.lang.String getUserName() {
        return _employee_portlet.getUserName();
    }

    /**
    * Sets the user name of this employee_portlet.
    *
    * @param userName the user name of this employee_portlet
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _employee_portlet.setUserName(userName);
    }

    /**
    * Returns the address of this employee_portlet.
    *
    * @return the address of this employee_portlet
    */
    @Override
    public java.lang.String getAddress() {
        return _employee_portlet.getAddress();
    }

    /**
    * Sets the address of this employee_portlet.
    *
    * @param address the address of this employee_portlet
    */
    @Override
    public void setAddress(java.lang.String address) {
        _employee_portlet.setAddress(address);
    }

    /**
    * Returns the email of this employee_portlet.
    *
    * @return the email of this employee_portlet
    */
    @Override
    public java.lang.String getEmail() {
        return _employee_portlet.getEmail();
    }

    /**
    * Sets the email of this employee_portlet.
    *
    * @param email the email of this employee_portlet
    */
    @Override
    public void setEmail(java.lang.String email) {
        _employee_portlet.setEmail(email);
    }

    /**
    * Returns the phone number of this employee_portlet.
    *
    * @return the phone number of this employee_portlet
    */
    @Override
    public java.lang.String getPhoneNumber() {
        return _employee_portlet.getPhoneNumber();
    }

    /**
    * Sets the phone number of this employee_portlet.
    *
    * @param phoneNumber the phone number of this employee_portlet
    */
    @Override
    public void setPhoneNumber(java.lang.String phoneNumber) {
        _employee_portlet.setPhoneNumber(phoneNumber);
    }

    /**
    * Returns the password of this employee_portlet.
    *
    * @return the password of this employee_portlet
    */
    @Override
    public java.lang.String getPassword() {
        return _employee_portlet.getPassword();
    }

    /**
    * Sets the password of this employee_portlet.
    *
    * @param password the password of this employee_portlet
    */
    @Override
    public void setPassword(java.lang.String password) {
        _employee_portlet.setPassword(password);
    }

    @Override
    public boolean isNew() {
        return _employee_portlet.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _employee_portlet.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _employee_portlet.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _employee_portlet.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _employee_portlet.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _employee_portlet.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _employee_portlet.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _employee_portlet.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _employee_portlet.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _employee_portlet.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _employee_portlet.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new Employee_portletWrapper((Employee_portlet) _employee_portlet.clone());
    }

    @Override
    public int compareTo(
        net.opentrends.training.service.model.Employee_portlet employee_portlet) {
        return _employee_portlet.compareTo(employee_portlet);
    }

    @Override
    public int hashCode() {
        return _employee_portlet.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<net.opentrends.training.service.model.Employee_portlet> toCacheModel() {
        return _employee_portlet.toCacheModel();
    }

    @Override
    public net.opentrends.training.service.model.Employee_portlet toEscapedModel() {
        return new Employee_portletWrapper(_employee_portlet.toEscapedModel());
    }

    @Override
    public net.opentrends.training.service.model.Employee_portlet toUnescapedModel() {
        return new Employee_portletWrapper(_employee_portlet.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _employee_portlet.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _employee_portlet.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _employee_portlet.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Employee_portletWrapper)) {
            return false;
        }

        Employee_portletWrapper employee_portletWrapper = (Employee_portletWrapper) obj;

        if (Validator.equals(_employee_portlet,
                    employee_portletWrapper._employee_portlet)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Employee_portlet getWrappedEmployee_portlet() {
        return _employee_portlet;
    }

    @Override
    public Employee_portlet getWrappedModel() {
        return _employee_portlet;
    }

    @Override
    public void resetOriginalValues() {
        _employee_portlet.resetOriginalValues();
    }
}
