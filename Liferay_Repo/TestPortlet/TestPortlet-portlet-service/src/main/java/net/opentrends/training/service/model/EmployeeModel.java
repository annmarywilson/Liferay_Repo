package net.opentrends.training.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Employee service. Represents a row in the &quot;TestPortlet_Employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link net.opentrends.training.service.model.impl.EmployeeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link net.opentrends.training.service.model.impl.EmployeeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Employee
 * @see net.opentrends.training.service.model.impl.EmployeeImpl
 * @see net.opentrends.training.service.model.impl.EmployeeModelImpl
 * @generated
 */
public interface EmployeeModel extends BaseModel<Employee> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a employee model instance should use the {@link Employee} interface instead.
     */

    /**
     * Returns the primary key of this employee.
     *
     * @return the primary key of this employee
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this employee.
     *
     * @param primaryKey the primary key of this employee
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the employee ID of this employee.
     *
     * @return the employee ID of this employee
     */
    public long getEmployeeId();

    /**
     * Sets the employee ID of this employee.
     *
     * @param employeeId the employee ID of this employee
     */
    public void setEmployeeId(long employeeId);

    /**
     * Returns the group ID of this employee.
     *
     * @return the group ID of this employee
     */
    public long getGroupId();

    /**
     * Sets the group ID of this employee.
     *
     * @param groupId the group ID of this employee
     */
    public void setGroupId(long groupId);

    /**
     * Returns the employee name of this employee.
     *
     * @return the employee name of this employee
     */
    @AutoEscape
    public String getEmployeeName();

    /**
     * Sets the employee name of this employee.
     *
     * @param employeeName the employee name of this employee
     */
    public void setEmployeeName(String employeeName);

    /**
     * Returns the employee designation of this employee.
     *
     * @return the employee designation of this employee
     */
    @AutoEscape
    public String getEmployeeDesignation();

    /**
     * Sets the employee designation of this employee.
     *
     * @param employeeDesignation the employee designation of this employee
     */
    public void setEmployeeDesignation(String employeeDesignation);

    /**
     * Returns the address of this employee.
     *
     * @return the address of this employee
     */
    @AutoEscape
    public String getAddress();

    /**
     * Sets the address of this employee.
     *
     * @param address the address of this employee
     */
    public void setAddress(String address);

    /**
     * Returns the email of this employee.
     *
     * @return the email of this employee
     */
    @AutoEscape
    public String getEmail();

    /**
     * Sets the email of this employee.
     *
     * @param email the email of this employee
     */
    public void setEmail(String email);

    /**
     * Returns the phone number of this employee.
     *
     * @return the phone number of this employee
     */
    @AutoEscape
    public String getPhoneNumber();

    /**
     * Sets the phone number of this employee.
     *
     * @param phoneNumber the phone number of this employee
     */
    public void setPhoneNumber(String phoneNumber);

    /**
     * Returns the file entry ID of this employee.
     *
     * @return the file entry ID of this employee
     */
    public Long getFileEntryId();

    /**
     * Sets the file entry ID of this employee.
     *
     * @param fileEntryId the file entry ID of this employee
     */
    public void setFileEntryId(Long fileEntryId);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(
        net.opentrends.training.service.model.Employee employee);

    @Override
    public int hashCode();

    @Override
    public CacheModel<net.opentrends.training.service.model.Employee> toCacheModel();

    @Override
    public net.opentrends.training.service.model.Employee toEscapedModel();

    @Override
    public net.opentrends.training.service.model.Employee toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}